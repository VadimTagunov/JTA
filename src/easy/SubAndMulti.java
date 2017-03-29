package easy;

import java.util.Scanner;

public class SubAndMulti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Какого порядка Вы хотите создать матрицы?");
		int count = sc.nextInt();
		int lines = count;
		int rows = count;
		
		int [][] matrix1 = new int [lines][rows];
		int [][] matrix2 = new int [lines][rows];
		int [][] resultMatrixAdd = new int [lines][rows];
		int [][] resultMatrixMulti = new int [lines][rows];
		
		
		System.out.println("Давайте заполним наши матрицы. Начнем с первой!");
		sc = new Scanner(System.in);
		for (int i = 0; i < lines; i++) {
			for (int a = 0; a < rows; a++) {
				matrix1[i][a] = sc.nextInt();
			}
		}
		
		System.out.println("А теперь вторая!");
		sc = new Scanner(System.in);
		for (int i = 0; i < lines; i++) {
			for (int a = 0; a < rows; a++) {
				matrix2[i][a] = sc.nextInt();
			}
		}
		
		for (int i = 0; i < lines; i++) {
			for (int a = 0; a < rows; a++) {
				resultMatrixAdd[i][a] = matrix1[i][a] + matrix2[i][a];
			}
		}
		
		for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                for (int k = 0; k < matrix2.length; k++) {
                	resultMatrixMulti[i][j] += matrix1[i][k] * matrix2[k][j]; 
                }
            }
        }
		
		System.out.println("Матрица сложения: ");
		for (int i = 0; i < lines; i++) {
			for (int a = 0; a < rows; a++) {
				System.out.print(resultMatrixAdd [i][a]+ " ");
			}
			System.out.println(" ");
		}
		
		System.out.println("Матрица умножения: ");
		for (int i = 0; i < lines; i++) {
			for (int a = 0; a < rows; a++) {
				System.out.print(resultMatrixMulti [i][a]+ " ");
			}
			System.out.println(" ");
		}
	}

}
