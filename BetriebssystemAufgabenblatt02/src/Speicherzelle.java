public class Speicherzelle {

	private int wert;

	static Speicherzelle s1 = new Speicherzelle(10);
	static Speicherzelle s2 = new Speicherzelle(20);

	Speicherzelle(int i) {
		wert = i;
	}

	public synchronized void setWert(int w) {
	
		wert = w;
	}

	public synchronized int getWert() {
		
		return wert;
	}

	public synchronized void swapWert(Speicherzelle s) {
		

		 try
	      {
	         Thread.sleep(1000);
	      }
	      catch (Exception e)
	      {
	      }

		int h = s.getWert();
		s.setWert(this.wert);
		setWert(h);

	}

}
