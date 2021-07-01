package com.lexis.utils;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

import com.lexis.Matrix;

public class ReadFile {

	public static Matrix getMatrixFromFile(String filePath) throws IOException {
		
		Matrix matrix = null;
		int maxChar = 1000;
		
		try {
			int m = 0, n = 0;
			File f = new File(filePath);
			FileReader fr = new FileReader(f);   //reads the file

			LineNumberReader reader = new LineNumberReader(fr);		
			reader.mark(maxChar);
			n = reader.readLine().length();
			reader.skip(maxChar);
			m = reader.getLineNumber();
			reader.reset();
			
			matrix = new Matrix(m,n);
			char charBuffer;
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					charBuffer = (char)reader.read();
					if(charBuffer == '\n') {
						charBuffer = (char)reader.read();
					}
					matrix.setPosition(charBuffer, i, j);
				}
			}
			reader.close();
		} catch(IOException e) {  
			e.printStackTrace();  
		}	
		return matrix;
	}
}
