package c_h_g;

import java.awt.geom.Point2D;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class GrahamsScan {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n;
		Scanner citire=new Scanner(System.in);
		System.out.println("Nr e puncte");
		n=citire.nextInt();
		Point2D[] multimea_punctelor=new Point2D[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Coordonata x si y pentru punctul "+i+"  :");
		   multimea_punctelor[i].setLocation(citire.nextDouble(),citire.nextDouble());
		}
		
		primulPunct(multimea_punctelor);
		Afisare(multimea_punctelor);
		
		/*Ordonare(multimea_punctelor);
		
		
		
		Stack<Point2D> ch=new Stack<Point2D>();
*/
	}
	public static void Afisare(Point2D[] p)
	{
		for(int i=0;i<p.length;i++)
			System.out.println("P[ "+i+" ]= "+"("+p[i].getX()+" , "+p[i].getY()+" )");
	}
	public static int verificaConvexitate(Point2D a, Point2D b,Point2D c)
	{
		double m=(b.getX()-a.getX())*(c.getY()-a.getY())-(b.getY()-a.getY())*(c.getX()-a.getX());
		if(m>0)return 1;
		else if(m==1)return 0;
		else return -1;
	}
	
	//punct[0]--min y si x
	public static void primulPunct(Point2D[] puncte)
	{
		int n=puncte.length;
		Arrays.sort(puncte);
		
	}
	public static double Unghiul(Point2D a,Point2D b)
	{
		double deltaX=b.getX()-a.getX();
		double deltaY=b.getY()-a.getY();
		double tan=Math.toDegrees(Math.atan2(deltaY,deltaX));
		return tan;
	}
	public static void Switch(Point2D a,Point2D b)
	{
		Point2D aux;
		aux=(Point2D) a.clone();
		a=(Point2D) b.clone();
		b=(Point2D) aux.clone();
	}
	public static void Ordonare(Point2D[] puncte)
	{
		int i,j,n=puncte.length;
		for(i=1;i<n-1;i++)
			for(j=i+1;j<n;j++)
			{
				if(Unghiul(puncte[0],puncte[i])>Unghiul(puncte[0],puncte[j]))
				{
					Switch(puncte[i],puncte[j]);
				}
			}

	}
	public static Stack<Point2D> ConstruiesteStiva(Point2D[] puncte)
	{
		int i=2,n=puncte.length,verif;
		Point2D top;
		Stack<Point2D> stiva=new Stack<Point2D>();
		stiva.push(puncte[0]);
		stiva.push(puncte[1]);
		for (i = 2; i < n; i++)
		{
            top = stiva.pop();
            while (verificaConvexitate(stiva.peek(), top, puncte[i]) <= 0) {
                top = stiva.pop();
            }
            stiva.push(top);
            stiva.push(puncte[i]);
        }
		
		return stiva;
		/*
		while(i<=n)
		{
			B=stiva.pop();
			A=stiva.peek();
			if(verificaConvexitate(A, B, puncte[i])==true)
			{
				stiva.push(B);
				stiva.push(puncte[i]);
				i++;
			}
			else{
				
				stiva.push(puncte[i]);
				i++;
				
			}
		}*/
		
		
		
		
	}
}
