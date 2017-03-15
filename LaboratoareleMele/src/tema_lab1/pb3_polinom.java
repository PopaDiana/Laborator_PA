package tema_lab1;

import java.util.Scanner;

public class pb3_polinom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []coeficienti=new int[4];
		Scanner citire=new Scanner(System.in);
		int n,i,x;
		System.out.println("gredul polinomului : ");
		n=citire.nextInt();
		for(i=0;i<n;i++)
		{
			System.out.println(" a"+i+" = ");
			coeficienti[i]=citire.nextInt();
		}
		System.out.println("x= ");
		x=citire.nextInt();
		
		System.out.println(Polinom_complexitate_n2(coeficienti, n, x));
		System.out.println(Polinom_complexitate_n_Horner(coeficienti, n, x));

	}

	public static int Polinom_complexitate_n2(int c[],int n,int x)
	{
		int i,j, S=0,p;
		for(i=0;i<n;i++)
		{
			j=1;
			p=1;
			while(j<=i)
			{
				p=p*x;
				j++;
			}
			S=S+(c[i]*p);
		}
		
		return S;
	}
	public static int Polinom_complexitate_n_Horner(int c[],int n, int x)
	{
		int S=c[n-1]*x,i;
		for(i=n-2;i>=1;i--)
		{
			S=(S+c[i])*x;
		}
		S=S+c[0];
		return S;
	}
}
