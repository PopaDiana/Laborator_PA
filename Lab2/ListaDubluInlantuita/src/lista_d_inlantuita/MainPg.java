package lista_d_inlantuita;

import java.util.Scanner;

public class MainPg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista l=new Lista();
		Scanner citire=new Scanner(System.in);
		boolean stop=true;
		
		Comenzi();
		try{
		while(stop)
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
					System.out.println("Eelmentul introdus in lista: ");
					x=citire.nextInt();
					l.adauga(x);;
					break;
				}
				case 2:
				{
					int x;
					System.out.println("Eelmentul sters din  lista: ");
					x=citire.nextInt();
					l.sterge(x);
					break;
					
				}
				case 3:
				{
					l.afiseazaDeLaStanga();
					break;
				}
				case 4:
				{
					l.afiseazaDeLaDreapta();
					break;
				}
				case 5:
				{
					int x;
					System.out.println("Elementul cautat :");
					x=citire.nextInt();
					System.out.println(l.cauta(x));
					break;
				}
				case 6:
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
		}
		catch(Exception e)
		{
			System.out.println("Eroare : "+e);
		}
			
		
	
		

		

	}
	public static void Comenzi()
	{
		System.out.println("1  - Insereaza element ");
		System.out.println("2  - Elimina un element");
		System.out.println("3  - Afiseaza lista de la stanga la dreapta");
		System.out.println("4  - Afiseaza lista de la dreapta la stanga");
		System.out.println("5  - Gaseste un element");
		System.out.println("6  - Afiseaza lista de optiuni");
		System.out.println("0  - Exit");
		System.out.println();
	}

}