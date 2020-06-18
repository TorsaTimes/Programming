package ctr;

import java.awt.Adjustable;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.util.Date;
import java.util.EventObject;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.ListSelectionModel;
import javax.swing.RootPaneContainer;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.bind.Element;
import javax.swing.BoundedRangeModel;
import javax.swing.BoxLayout;
import javax.swing.JButton;

public class SwingTest {

	public static void main(String[] args) {

		// Aufgabe a

		JFrame f = new JFrame("JScrollBar und JSlider Beispiel");
		f.setExtendedState(JFrame.MAXIMIZED_BOTH);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new GridLayout(4, 0, 0, 7));
		f.setMinimumSize(new Dimension(600,600));

		JSlider slider1 = new JSlider(0, 100, 50);
		JScrollBar scroll = new JScrollBar(Adjustable.VERTICAL, 50, 10, 0, 100 + 10);
		f.add(slider1);
		f.add(scroll);

		final JScrollBar sb = new JScrollBar(Adjustable.VERTICAL, 50, 10, 0, 50 + 10);
		final JSlider sl = new JSlider(Adjustable.VERTICAL, 50, 10);
		sl.setSize(300, 10);

		slider1.setMajorTickSpacing(10);
		slider1.setMinorTickSpacing(2);
		slider1.setPaintTicks(true);
		slider1.setPaintLabels(true);
		slider1.setPaintTrack(true);

		slider1.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("model changed: " + sb.getValue());

				scroll.setValue(slider1.getValue());
			}
		});

		BoundedRangeModel modelsb = scroll.getModel();

		modelsb.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {

				System.out.println("model changed: " + slider1.getValue());

				slider1.setValue((int) scroll.getValue());

			}
		});

		f.setVisible(true);

		// ####################################################################################################################################################
		// Aufgabe b

		// Lightweight Notifikation Beispiel (1)
		JSlider slider = new JSlider();
		BoundedRangeModel model = slider.getModel();
		model.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// need to query the model
				// to get updated value...
				BoundedRangeModel m = (BoundedRangeModel) e.getSource();
				System.out.println("model changed: " + m.getValue());
			}
		});
		
		//statefull Notifikation Beispiele (2)		
		String items[] = { "One", "Two", "Three" };
		JList list = new JList(items);
		ListSelectionModel sModel = list.getSelectionModel();
		sModel.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
				// get change information directly
				// from the event instance...
				if (!e.getValueIsAdjusting()) {
					System.out.println("selection changed: " + e.getFirstIndex());
				}
			}
		});

		f.add(list);
		f.add(slider);
		f.setVisible(true);

	}

}
