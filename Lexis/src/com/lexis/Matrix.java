package com.lexis;

public class Matrix {

	private char[][] matrix; // Matrix m x n
	private int m, n; // matrix dimensions
	
	public Matrix(int m, int n) {
		matrix = new char[m][n];
		this.m = m;
		this.n = n;
	}
	
	public char[][] getMatrix() {
		return matrix;
	}
	
	public int getM() {
		return m;
	}
	
	public int getN() {
		return n;
	}
	
	public void setPosition(char postionValue, int m, int n) {
		matrix[m][n] = postionValue;
	}
	
	// Create another matrix instance
	public char[][] getCopy() {
		char[][] matrix_copy = new char[m][n];
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if (matrix[i][j] == '0') {
					matrix_copy[i][j] = '0';
				} else {
					matrix_copy[i][j] = '1';
				}
			}
		}
		return matrix_copy;
	}
	
	public void zeroizePosition(int i, int j) {
		int tmp_i = i;
		int tmp_j = j;
		zeroizeColumn(tmp_j);
		zeroizeRow(tmp_i);
	}
	
	private void zeroizeColumn(int j) {
		for(int i = 0; i < m; i++) {
			matrix[i][j] = '0';
		}
	}
	
	private void zeroizeRow(int i) {
		for(int j = 0; j < n; j++) {
			matrix[i][j] = '0';
		}
	}
	
	public void printMatrix() {
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%c", matrix[i][j]);
			}
			System.out.println("");
		}
	}
}
