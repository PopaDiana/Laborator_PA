package tema_lab1;

import java.util.Scanner;

public class pb2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire=new Scanner(System.in);
		System.out.println("Nr de biti : ");
		int n,i;
		n=citire.nextInt();
		int []a=new int[10];
		int []b=new int[10];
		int []c=new int[11];
		System.out.println("Introduceti A ");
		for(i=0;i<n;i++)
		{
			a[i]=citire.nextInt();
		}

		System.out.println("Introduceti B ");
		for(i=0;i<n;i++)
		{
			b[i]=citire.nextInt();
		}
		Adunare(a,b,c,n);
		for(i=0;i<=n;i++)
		{
		System.out.println(c[i]);
		}
	}
	public static void Adunare(int []a,int[]b,int[]c,int n)
	{
		int i,transp=0,x=0;
		for(i=n;i>0;i--)
		{
			x=transp+a[i-1]+b[i-1];
			transp=x/2;
			c[i]=x%2;
			
		}
		c[0]=transp;
	}

}
