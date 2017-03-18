package Stiva;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Stiva 
{
	int top;
	int dim;
	ArrayList<Integer> stiva;
	//int []stiva;
	
	Stiva(int size)
	{
		if(size<=0)throw new IllegalArgumentException("Stiva trebuie sa aiba dimensiuni poztive");
		dim=size;
		stiva=new ArrayList<Integer>(dim);
		top=-1;
	}

	public void Push(int x)
	{
		if(top==stiva.size())throw new NoSuchElementException("Stiva e plina");
		top=top+1;
		stiva.add(top, x);
	}
	public int Pop()
	{
		if(top==-1)throw new NoSuchElementException("Stiva e goala");
		int temp=stiva.get(top);
		top--;
		return temp;
	}
	public boolean isEmpty()
	{
		if(top==-1)return true;
		else return false;
	}
	public void display()
	{
		if(top==-1)
			System.out.println("Stiva e goala");
		else
		{
			for(int i=0;i<=top;i++)
				System.out.println(stiva.get(i));
			
		}
	}
}
