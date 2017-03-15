package primul_lab_introducere;

import java.util.Scanner;

public class Fibonacci {

	public static int fib(int n)
	{
		if(n<2)return n;
		else return fib(n-1)+fib(n-2);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire= new Scanner(System.in);
		int n;
		n=citire.nextInt();
		System.out.println(fib(n));

	}

}
