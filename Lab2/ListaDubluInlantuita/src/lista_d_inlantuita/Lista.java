package lista_d_inlantuita;

import java.util.NoSuchElementException;

public class Lista {
	Node prim;
	Node ultim;
	int dim;
	Lista()
	{
		prim=new Node();
		ultim=prim;
		dim=0;
	}
	public  void adauga(Object info)
	{
		if(dim==0){prim.key=info;ultim=prim;dim++;}
		else
		{
			Node aux=new Node();
			aux.key=info;
			aux.prev=ultim;
			ultim.next=aux;
			ultim=aux;
			dim++;	
		}
		
		
	}
	public boolean cauta(Object x)
	{
		Node aux=prim;
		while(aux!=null)
		{
			if(aux.key==x)return true;
			aux=aux.next;
		}
		return false;
	}
	public void afiseazaDeLaStanga()
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala!"); 
		Node aux=prim;
		while(aux!=null)
		{
			System.out.print(aux.key+"  ");
			aux=aux.next;
		}
		System.out.println();
		
		
	}
	
	public void afiseazaDeLaDreapta()
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala!"); 
		Node aux=ultim;
		while(aux!=null)
		{
			System.out.print(aux.key+"  ");
			aux=aux.prev;
		}
		System.out.println();
	}
	
	public void sterge(Object x)
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala!"); 
		if(cauta(x)==true)
		{
			if(prim.key==x)
			{
				prim=prim.next;
				prim.prev=null;
				dim--;
			}
			else if(ultim.key==x)
			{
				ultim=ultim.prev;
				ultim.next=null;
				dim--;
			}
			else
			{
				Node aux=prim;
				while(aux!=null && aux.key!=x)
					aux=aux.next;
				aux.prev.next=aux.next;
				aux.next.prev=aux.prev;
				dim--;
			}
		}
		else System.out.println("Elementul nu exista in lista");
	}
	
	
}
