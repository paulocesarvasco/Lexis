package com.lexis.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class ReadFile {

	public static char[][] getMatrix(String filePath) throws IOException {
		
		char[][] matrix = null;
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
			
			matrix = new char[m][n];
			
			for(int i = 0; i < m; i++) {
				for(int j = 0; j < n; j++) {
					matrix[i][j] = (char)reader.read();
				}
			}
			reader.close();
		} catch(IOException e) {  
			e.printStackTrace();  
		}	
		return matrix;
	}
}
