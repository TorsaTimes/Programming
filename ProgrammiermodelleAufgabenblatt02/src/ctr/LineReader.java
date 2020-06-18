package ctr;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public abstract class LineReader implements Iterable<String>{

	String filename = "/tmp/read.me";
	File file=new File(filename);
	Reader reader = new FileReader(file);
	
	
	public LineReader(Reader reader) {
		this.reader = reader;

	}

	LineReader lines = new LineReader(reader);
	for(String line : lines)
	System.out.println(line);
	for(String line : lines)
	System.out.println(line);
	
	
	
}
