package coada;

import java.util.Scanner;

public class MainPg {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner citire=new Scanner(System.in);
		System.out.println("Nr de elem din coada : ");
		int dim=citire.nextInt();
		Coada c=new Coada(dim);
		
		boolean stop=true;
		Comenzi();
		
		while(stop)
		{
			try
			{
				System.out.println("Introduceti comanda ");
				int p=citire.nextInt();
				
				switch (p)
				{
				case 0:
				{
					stop=false;
					break;
				}
				case 1:
				{
					int x;
					System.out.println("Eelmentul introdus in coada: ");
					x=citire.nextInt();
					c.EnQueue(x);
					break;
				}
				case 2:
				{
					System.out.println("Elementul extras este : "+ c.DeQueue());
					System.out.println("Coada dupa extragere :   "); 
					c.display();
					break;
				}
				case 3:
				{
					System.out.println("Coada este : ");
					c.display();
					break;
				}
				case 4:
				{
					Comenzi();
					break;
				}
				default:
				{
					System.out.println("Comanda nu e corecta ");
					break;
				}
				}
				
				
			}
			catch(Exception e)
			{
				System.out.println("Eroare :  "+e);
				System.exit(0);
			}
		}
		
		

	}
	
	public static void Comenzi()
	{
		System.out.println("1  - Insereaza element ");
		System.out.println("2  - Elimina element");
		System.out.println("3  - Afiseaza coada");
		System.out.println("4  - Afiseaza lista de optiuni");
		System.out.println("0  - Exit");
		System.out.println();
	}

}
