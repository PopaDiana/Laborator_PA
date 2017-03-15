package primul_lab_introducere;

import java.util.ArrayList;
import java.util.Scanner;

public class A_La_Russe_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire = new Scanner(System.in);
		int A, B;
		System.out.print("A= ");
		A = citire.nextInt();
		System.out.print("\n B= ");
		B = citire.nextInt();
		System.out.println(A + " * " + B + " = " + AlaRusseArray(A, B));

	}

	public static int AlaRusseArray(int a, int b) {
		int prod = 0, i = 0;
		ArrayList<Integer> X = new ArrayList<Integer>();
		ArrayList<Integer> Y = new ArrayList<Integer>();
		X.add(0, a);
		Y.add(0, b);
		while (X.get(i) > 1) {
			X.add(i + 1, (X.get(i) / 2));
			Y.add(i + 1, (Y.get(i) * 2));
			i++;
		}
		while (i > -1) {
			if (X.get(i) % 2 == 1)
				prod = prod + Y.get(i);
			i--;
		}
		return prod;
	}

}
