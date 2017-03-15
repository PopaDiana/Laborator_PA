package primul_lab_introducere;

import java.util.ArrayList;
import java.util.Scanner;

public class Met_Insertiei {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> A = new ArrayList<Integer>();
		int x;
		Scanner citire = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			x = citire.nextInt();
			A.add(i, x);
		}
		Insertie(A);
		System.out.println(A);

	}

	public static void Insertie(ArrayList<Integer> l) {
		int key = 0, i = 0, j = 0;
		for (i = 1; i < l.size(); i++) {
			key = l.get(i);
			j = i - 1;
			while (j > -1 && l.get(j) > key) {
				l.set(j + 1, l.get(j));
				j--;
			}
			l.set(j + 1, key);
		}
	}

}
