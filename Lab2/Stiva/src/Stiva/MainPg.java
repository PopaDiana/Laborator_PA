package Stiva;

import java.util.Scanner;

public class MainPg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire=new Scanner(System.in);
		
		System.out.println("Dati dimensiunea stivei : ");
		int dimensiune;
		dimensiune=citire.nextInt();
		Stiva s=new Stiva(dimensiune);

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
					System.out.println("Eelmentul introdus in stiva: ");
					x=citire.nextInt();
					s.Push(x);
					break;
				}
				case 2:
				{
					System.out.println("Elementul extras este : "+s.Pop());
					break;
				}
				case 3:
				{
					s.display();
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
		System.out.println("2  - Elimina elementul din varful stivei");
		System.out.println("3  - Afiseaza stiva");
		System.out.println("4  - Afiseaza lista de optiuni");
		System.out.println("0  - Exit");
		System.out.println();
	}

}
