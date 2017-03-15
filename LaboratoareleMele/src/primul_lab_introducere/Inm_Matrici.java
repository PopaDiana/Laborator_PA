package primul_lab_introducere;

public class Inm_Matrici {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a={{4, 2 ,4},{1,6,2}};
		int [][]b={{1,7,5,9},{10,2,0,0},{1,4,1,5}};
		int [][]c=new int[10][10];
		int i,j,k;
		for(i=0;i<2;i++)
		{
			for(j=0;j<4;j++)
			{
				for(k=0;k<3;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<2;i++)
			{for(j=0;j<4;j++)
				
				System.out.print(c[i][j]+"  ");
			System.out.println();
			}
	}

}
