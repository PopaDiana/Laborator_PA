package lista_s_inlantuita;

import java.util.NoSuchElementException;

public class Lista {
	public Node prim;
	public Node ultim;
	public int dim;
	public Lista()
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
			ultim.next=aux;
			ultim=aux;
			dim++;
			
		}
		
		
	}
	public void afisare()
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala");
		Node aux=prim;
		while(aux!=null)
		{
			System.out.print(aux.key+"  ");
			aux=aux.next;
		}
		System.out.println();
	}
	public void sterge(Object x)
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala");
		if(cauta(x)==true)
		{
		if(prim.key==x)
		{
		prim=prim.next;
		dim--;
		
		}
		else if(ultim.key==x)
		{
			
			Node aux=new Node();
			aux=prim;
			while(aux.next.key!=x)
			{
				aux=aux.next;
			}
			if(aux.next.next==null)
			{
				aux.next=null;
				ultim=aux;
			}
			dim--;
			
		}
		else
		{
			Node aux=new Node();
			int verif=0;
			aux=prim;
			do{
				if(aux.next.key==x)
				{
					aux.next=aux.next.next;
					verif=1;
				}
				else aux=aux.next;
			}while(aux!=null && verif==0);
			dim--;
		}
		}
		else System.out.println("Elementul nu exista in lista");
	}
	public boolean cauta(Object x)
	{
		if(dim==0)throw new NoSuchElementException("Lista e goala");
		Node aux=new Node();
		aux=prim;
		while(aux!=null)
		{
			if(aux.key==x)return true;
			aux=aux.next;
		}
		
		return false;
		
	}
	

}
