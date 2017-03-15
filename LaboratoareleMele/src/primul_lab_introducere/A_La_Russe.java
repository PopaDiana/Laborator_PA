package primul_lab_introducere;

import java.util.Scanner;

public class A_La_Russe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire = new Scanner(System.in);
		int A, B;
		System.out.println("Introduceti A : ");
		A = citire.nextInt();
		System.out.println(" Introduceti B : ");
		B = citire.nextInt();
		System.out.println("Produsul dintre " + A + " si " + B + " = " + AlaRusse(A, B));

	}

	public static int AlaRusse(int a, int b) {
		int prod = 0;
		int[] X = new int[1000];
		int[] Y = new int[1000];
		X[0] = a;
		Y[0] = b;
		int i = 0;
		while (X[i] > 1) {
			X[i + 1] = X[i] / 2;
			Y[i + 1] = Y[i] * 2;
			i++;

		}
		while (i > -1) {
			if (X[i] % 2 == 1)
				prod = prod + Y[i];
			i--;
		}
		return prod;
	}

}
