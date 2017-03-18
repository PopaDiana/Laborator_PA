package coada_cu_lista_s_i;
import java.util.NoSuchElementException;

import lista_s_inlantuita.*;

public class Coada extends Lista{
	Coada()
	{
		super();
	}
	public void EnQueue(int x)
	{
		adauga(x);
		
	}
	public void DeQueue()
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala");
		prim=prim.next;
		dim--;
	}

}
