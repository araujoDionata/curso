package matrix_fix;

import java.util.Scanner;

public class Aplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Numero de linhas da matriz: ");
		int l = sc.nextInt();
		System.out.print("Numero de colunas da matriz: ");
		int c = sc.nextInt();
		int[][] mat = new int[l][c];

		System.out.println("Digite os numeros da matriz separados por espaço e enter no final de cada linha:");
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < c; j++) {
				mat[i][j] = sc.nextInt();
			}

		}

		System.out.println("Escolha um numero da matriz: ");
		int escolha = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == escolha) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					System.out.println();
				}
			}
		}

		sc.close();

	}

}
