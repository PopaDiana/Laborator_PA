package coada_cu_lista_s_i;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coada c=new Coada();
		try
		{
			c.EnQueue(45);
			c.EnQueue(20);
			c.afisare();
			c.DeQueue();
			c.afisare();
			c.EnQueue(9);
			c.afisare();
		
		}
		catch(Exception e)
		{
			System.out.println("Eroare: "+e);
		}
	}

}
