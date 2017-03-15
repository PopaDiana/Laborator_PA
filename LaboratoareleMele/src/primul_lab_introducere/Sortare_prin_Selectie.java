package primul_lab_introducere;

import java.util.ArrayList;
import java.util.Scanner;

public class Sortare_prin_Selectie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner citire=new Scanner(System.in);
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			l.add(i,citire.nextInt());
		}
		SortareSelectie(l);
		System.out.println("Sirul sortat : "+  l);
		

	}
	public static void SortareSelectie(ArrayList<Integer> lista)
	{
		int minimul,pozitie_minim,i,j;
		for(i=0;i<lista.size()-1;i++)
		{
			pozitie_minim=i;
			minimul=lista.get(i);
			for(j=i+1;j<lista.size();j++)
			{
				if(lista.get(j)<minimul)
				{
					minimul=lista.get(j);
					pozitie_minim=j;
										
				}
				
			}
			lista.set(pozitie_minim, lista.get(i));
			lista.set(i,minimul);
		}
	}

}
