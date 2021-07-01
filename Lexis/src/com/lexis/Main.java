package com.lexis;

import com.lexis.utils.ReadFile;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Matrix matrix = ReadFile.getMatrixFromFile(args[0]);
		
		if (matrix == null) {
			System.out.println("Error to read matrix file");
			return;
		}
		char[][] tmp_mtx = matrix.getCopy();
		
		for (int i = 0; i < matrix.getM(); i++) {
			for (int j = 0; j < matrix.getN(); j++) {
				if (tmp_mtx[i][j] == '0') {
					matrix.zeroizePosition(i, j);
				}
			}
		}
		
		matrix.printMatrix();
		
	}
}
