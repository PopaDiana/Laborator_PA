import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Labirint 
{
	public static void Citire_matrice(ArrayList<ArrayList<Integer>> matrice ) throws FileNotFoundException
	{
		Scanner citeste = new Scanner(new File("C:\\Users\\Utilizator\\Documents\\AFacultate\\AN II\\Sem II\\PA\\Laborator\\labirint.txt"));
		while(citeste.hasNextLine())
		{
		    Scanner linReader = new Scanner(citeste.nextLine());
		    ArrayList col = new ArrayList();
		    while(linReader.hasNextInt())
		    {
		        col.add(linReader.nextInt());
		    }
		    matrice.add(col);
		}
		citeste.close();
		
	}
	public static void Afisare_Matrice(ArrayList<ArrayList<Integer>> matrice)
	{
		int i,j;
		for(i=0;i<matrice.size();i++)
		{
			for(j=0;j<matrice.get(i).size();j++)
			{
				System.out.print(matrice.get(i).get(j)+"  ");
			}
			System.out.println();
		}
		
	}
	public static void Citire_poz_start_stop_maze(Point start,Point stop)
	{
		Scanner citire=new Scanner(System.in);
		System.out.println("Introduceti i si j - locul pe unde se intra in labirint : ");
		start.setX(citire.nextInt());
		start.setY(citire.nextInt());
		
		System.out.println("Introduceti i si j - locul pe unde se doreste iesirea din labirint : ");
		stop.setX(citire.nextInt());
		stop.setY(citire.nextInt());
		
		
	}
	public static void Afisare_drum(Stack<Point> stiva_point)
	{
		while(! stiva_point.empty())
		{
			System.out.println(stiva_point.peek().getX()+"   "+stiva_point.peek().getY());
			stiva_point.pop();
			
		}
	}
	public static void main(String[] args)  
	{
		ArrayList<ArrayList<Integer>> maze=new ArrayList<ArrayList<Integer>>();
		Stack<Point> drum=new Stack<Point>();
		
		//citim matricea
		try {
			Citire_matrice(maze);
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			System.out.println(e);
		}
		//o afisam
		
		Afisare_Matrice(maze);
		
		//citirea pozitiilor de intrare si iesire
		Point start=new Point();
		Point stop=new Point();
		Citire_poz_start_stop_maze(start,stop);
		

		int i,j,ok=1;
		//creare stiva
		//se introduce in stiva punctul de start si se marcheaza ca vizitat elementul
		drum.push(start);
		maze.get(start.getX()).set(start.getY(),2);
		i=start.getX();
		j=start.getY();
	
	//( drum.peek().getX()!=stop.getX() && drum.peek().getY()!=stop.getY())
		while (!drum.empty() && ok==1)
		{
			if(drum.peek().getX()!=stop.getX() || drum.peek().getY()!=stop.getY())
			{
				if(j+1<(maze.get(i).size()) && maze.get(i).get(j+1)==1)
				{
					Point ad=new Point();
					ad.setX(i);
					ad.setY(j+1);
					drum.push(ad);
					j++;
					maze.get(i).set(j,2);
					
				}
				else if(i+1<maze.size() && maze.get(i+1).get(j)==1)
				{
					Point ad=new Point();
					ad.setX(i+1);
					ad.setY(j);
					drum.push(ad);
					i++;
					maze.get(i).set(j,2);
				}
				else if(j-1>-1 && maze.get(i).get(j-1)==1)
				{
					Point ad=new Point();
					ad.setX(i);
					ad.setY(j-1);
					drum.push(ad);
					j--;
					maze.get(i).set(j,2);
				}
				else if(i-1>-1 && maze.get(i-1).get(j)==1 )
				{
					Point ad=new Point();
					ad.setX(i-1);
					ad.setY(j);
					drum.push(ad);
					i--;
					maze.get(i).set(j,2);
				}
				else
				{
					drum.pop();
					if(drum.size()!=0)
						{
						i=drum.peek().getX();
						j=drum.peek().getY();
						}
				}
			}
			else ok=0;	
			}
			
			
		
		if(drum.empty())System.out.println("Nu se poate iesi din labirint");
		else Afisare_drum(drum);
		
	}

}
