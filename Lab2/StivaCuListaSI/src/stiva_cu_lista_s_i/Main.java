package stiva_cu_lista_s_i;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stiva l=new Stiva();
		try{
		l.PUSH(2);
		l.PUSH(30);
		l.afisare();
		l.POP();
		l.PUSH(44);
		l.afisare();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
