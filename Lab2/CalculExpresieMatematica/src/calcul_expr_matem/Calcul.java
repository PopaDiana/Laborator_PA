package calcul_expr_matem;
//3,*,4,+,(,8,-,12,),-,1
import java.util.Scanner;
import java.util.Stack;

public class Calcul {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner citire=new Scanner(System.in);
		String expresie=citire.nextLine();
		
		
		
		String expresie_postfixata=Formeaza_expr_postfixata(expresie);
		System.out.println("Expresie postfixata :   "+expresie_postfixata);

		
		System.out.println("Rezultatul este :"+ Calculeaza(Separa_expresia(expresie_postfixata)));

	}
	
	public static String[] Separa_expresia(String sir)
	{
		String [] nou=sir.split(",");
		return nou;
		
	}

	
	public static double Calculeaza(String[] sir)
	{
		Stack<Double> stiva=new Stack<Double>();
		double rezultat=0,x;
		for(int i=0;i<sir.length;i++)
		{
			try{
			switch (sir[i])
			{
			case "+":
				{
					x=stiva.peek();
					stiva.pop();
					rezultat=x+stiva.peek();
					stiva.pop();
					stiva.push(rezultat);
				break;
				}
			case "-":
				{
					x=stiva.peek();
					stiva.pop();
					rezultat=stiva.peek()-x;
					stiva.pop();
					stiva.push(rezultat);
				break;
				}
			case "*":
				{
					x=stiva.peek();
					stiva.pop();
					rezultat=x*stiva.peek();
					stiva.pop();
					stiva.push(rezultat);
				break;
				}
			case "/":
				{
					x=stiva.peek();
					stiva.pop();
					rezultat=stiva.peek()/x;
					stiva.pop();
					stiva.push(rezultat);
				break;
				}
			default:
				{
					
					stiva.push(Double.parseDouble(sir[i]));
				break;
				}
			}
			}
			catch(Exception e)
			{
				System.out.println("Eroare !! :"+e);
			}
		}
		rezultat=stiva.peek();
		
		return rezultat;
	}
	
	/*public static double Calcul_expresie_postfixata(String sir)
	{
		String []s=Separa_expresia(sir);
		return Calculeaza(s);
		
	}
	*/
	
	public static boolean isNumeric(String s)
	{
		try{
			double d=Double.parseDouble(s);
		}
		catch(Exception e)
		{
			return false;
		}
		return true;
	}
	public static boolean verificaPrecedenta(String vf_stiva,String in)
	{
		if(vf_stiva.equals("*") ||vf_stiva.equals("/")) return true;
		else if(vf_stiva.equals("+")||vf_stiva.equals("-"))
		{
			if(in.equals("+")||in.equals("-"))return true;
			else return false;
		}
		else return false;
		
	}
	
	public static String Formeaza_expr_postfixata(String expresie_citita)
	{
		String [] expresie=Separa_expresia(expresie_citita);
		String sir="";
		Stack<String> stiva=new Stack<String>();
		int i=0;
		while(i<expresie.length)
		{
			if(stiva.isEmpty() && isNumeric(expresie[i])==false){stiva.push(expresie[i]);i++;}
			if(expresie[i].equals("(")){stiva.push(expresie[i]);i++;}
			else if(isNumeric(expresie[i])==true) {sir=sir+expresie[i]+",";i++;}
			else if(expresie[i].equals(")")==false)
				{
					if(verificaPrecedenta(stiva.peek(), expresie[i])==true)
					{
						
						sir=sir+stiva.peek()+",";
						stiva.pop();
						stiva.push(expresie[i]);
						i++;
						
					}
					else { stiva.push(expresie[i]);i++;}
				
				
						
					
				}
			else 
			{
				while(!stiva.empty()&&stiva.peek().equals("(")==false)
				{
					if(stiva.peek().equals("(")==false)sir=sir+stiva.peek()+",";
					stiva.pop();
				}
				stiva.pop();
				i++;
			}
		}
		
		if(!stiva.empty())
		{
			while(!stiva.empty())
			{
				sir=sir+stiva.peek()+",";
				stiva.pop();
			}
		}
		
		
		return sir;
	}

}
