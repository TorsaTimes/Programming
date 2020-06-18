import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class RegexTest {

	static int i = 0;

	public static String[] split(String line) {

		String date = "((0?[1-9])|([1|2][0-9])|(3[0|1]))\\.((0?[1-9])|(1[0-2]))\\.\\d{4}";
		String time = "(0[0-9]|1[0-9]|2[0-3]):([0-5][0-9]):([0-5][0-9])";
		String fliesskommazahl = "(-?(\\d*\\.\\d{2})[,]){13}(-?\\d*\\.\\d{2})";
		String sum = date + "\\s" + time + "," + fliesskommazahl;
		boolean b = Pattern.matches(sum, line);
		System.out.println(b + " " + line);

		if (b) {
			return line.split(",");

		} else {

			System.out.println(i);
			i++;
			return null;
		}
	}

	public static void main(String[] args) {
		String line = "";
		String[] parts;
		float value = 0;
		int counter = 0;

		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(new File(
					"C:\\Users\\SamueleTortomasi\\Dropbox\\Semester4\\Programmiermodelle\\Praktikum\\Aufgabe1\\jena.csv"))));

			while ((line = reader.readLine()) != null) {
				parts = split(line);
				if (parts != null) {
					for (String part : parts) {
						//System.out.println(s);
						value += Float.parseFloat(parts[2]);
						counter++;
					}
				}
			}
			System.out.println("Durchsch. Temperatur: " + (value / counter));
		}

		catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
