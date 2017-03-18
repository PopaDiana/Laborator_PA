package coada;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Coada {
	int head;
	int dim;
	int tail;
	ArrayList<Integer> coada;
	//int []stiva;
	
	Coada(int size)
	{
		if(size<=0)throw new IllegalArgumentException("Coada trebuie sa aiba dimensiuni poztive");
		dim=size;
		coada=new ArrayList<Integer>(dim);
		tail=-1;
		head=0;
	}

	public void EnQueue(int x)
	{
		if(tail>=dim-1)throw new NoSuchElementException("Coada e plina");
		tail=tail+1;
		coada.add(tail,x);
	}
	

	public int move()
	{
		if(tail<head)throw new NoSuchElementException("Coada e goala");
		int res=-1;   //retin cate elem am mutat
		for(int i=head;i<tail;i++)
		{
			coada.set(i, coada.get(i+1));
			res++;
		}
		return res;
	}
	
	public int DeQueue()
	{
		int temp=coada.get(head);
		if (move() < -1) throw new NoSuchElementException("Coada e goala");  
		tail--;
		return temp;
	}
	public void display()
	{
		if(head>tail)System.out.println("Coada e goala");
		else
		{
			for(int i=head;i<=tail;i++)
				System.out.print(coada.get(i)+"  ");
		}
		System.out.println();
	}

}
