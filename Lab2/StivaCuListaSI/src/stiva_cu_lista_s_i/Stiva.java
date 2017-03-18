package stiva_cu_lista_s_i;
import java.util.NoSuchElementException;

import lista_s_inlantuita.*;


public class Stiva extends Lista
{
	Node prev;
	Stiva()
	{
		super();
		prev=ultim;
	}
	
	public void POP()
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala");
		else{
		prev.next=null;
		ultim=prev;
		dim--;}
	}
	public void PUSH(Object x)
	{
		prev=ultim;
		adauga(x);
	}	
}
