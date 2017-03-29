package easy;

import java.util.Scanner;

public class Matrix {
	private int m;
	private int[][] matrix;
	
	public Matrix(int m) {
		matrix = new int[m][m];
	}
	
	public void MatrixFill() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < m; i++) {
			for (int a = 0; a < m; a++) {
				matrix[i][a] = sc.nextInt();
			}
		}
		sc.close();
	}
	
	public void MatrixAdd(int[][] anotherMatrix) {
		int[][] resultMatrixAdd = new int [m][m];
		for (int i = 0; i < m; i++) {
			for (int a = 0; a < m; a++) {
				resultMatrixAdd[i][a] = matrix[i][a] + anotherMatrix[i][a];
			}
		}
		
		for (int i = 0; i < m; i++) {
			for (int a = 0; a < m; a++) {
				System.out.print(resultMatrixAdd [i][a]+ " ");
			}
			System.out.println(" ");
		}
	}
	
	public void MatrixMulti(int[][] anotherMatrix) {
		int[][] resultMatrixMulti = new int [m][m];
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                	resultMatrixMulti[i][j] += matrix[i][k] * anotherMatrix[k][j]; 
                }
            }
        }
		
		for (int i = 0; i < m; i++) {
			for (int a = 0; a < m; a++) {
				System.out.print(resultMatrixMulti [i][a]+ " ");
			}
			System.out.println(" ");
		}
	}
}
