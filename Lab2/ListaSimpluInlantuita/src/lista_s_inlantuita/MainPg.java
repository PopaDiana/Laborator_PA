package lista_s_inlantuita;

import java.io.File;
import java.util.Scanner;



public class MainPg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 Node x=new Node();
		System.out.println(x.key+" "+x.next);
		x.key=3;
		System.out.println(x.key+" "+x.next);
		Node t=new Node();
		x.next=t;
		t.key=16;
		System.out.println("x  -  "+x.key+" "+x.next);
		System.out.println("t  -  "+t.key+" "+t.next);
		System.out.println(x.next.key);
		*/
	
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
					System.out.println("Lista dupa stergere:");
					l.afisare();
					break;
					
				}
				case 3:
				{
					l.afisare();
					break;
				}
				case 4:
				{
					int x;
					System.out.println("Elementul cautat :");
					x=citire.nextInt();
					System.out.println(l.cauta(x));
					break;
				}
				case 5:
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
			System.out.println(e);
		}
	
		

		

	}
	public static void Comenzi()
	{
		System.out.println("1  - Insereaza element ");
		System.out.println("2  - Elimina un element");
		System.out.println("3  - Afiseaza lista");
		System.out.println("4  - Gaseste un element");
		System.out.println("5  - Afiseaza lista de optiuni");
		System.out.println("0  - Exit");
		System.out.println();
	}

}
