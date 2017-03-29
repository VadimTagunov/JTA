package easy;

import java.util.Scanner;

class MatrixMultiplection {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.println("Какого порядка Вы хотите создать матрицы?");
		int count = sc.nextInt();
    	int[][] mA = new int [count][count];
        
        int[][] mB = new int [count][count];
        
        sc = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			for (int a = 0; a < count; a++) {
				mA[i][a] = sc.nextInt();
			}
		}
		
		sc = new Scanner(System.in);
		for (int i = 0; i < count; i++) {
			for (int a = 0; a < count; a++) {
				mB[i][a] = sc.nextInt();
			}
		}
        
        int m = mA.length;
        int n = mB[0].length;
        int o = mB.length;
        int[][] res = new int[m][n];
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += mA[i][k] * mB[k][j]; 
                }
            }
        }
        
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format("%6d ", res[i][j]);
            }
            System.out.println();
        }
    }
}