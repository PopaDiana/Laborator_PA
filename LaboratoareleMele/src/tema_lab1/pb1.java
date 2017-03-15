package tema_lab1;

import java.util.ArrayList;
import java.util.Scanner;

public class pb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire=new Scanner(System.in);
		ArrayList<Integer> lista=new ArrayList<Integer>();
		int n, val_caut;
		System.out.println("Valoarea cautata : ");
		val_caut=citire.nextInt();
		System.out.println("Nr de elemente din lista :");
		n=citire.nextInt();
		
		for(int i=0;i<n;i++)
		{
			lista.add(i,citire.nextInt());
		}
		
		System.out.println(Cautare(lista,val_caut));
		

	}
	public static int Cautare(ArrayList<Integer> A,int v)
	{
		int i;
		for(i=0;i<A.size();i++)
			if(A.get(i)==v)return i;
		return -1;
	}

}
