import static java.lang.System.out;
import java.util.Scanner;
class MatrixSearch
{
	static public void main(String... args)
	{
		Scanner sc=new Scanner(System.in);
		out.println("Enter no. of rows and column");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int RESULT=0;
		 
		out.println("enter element of matrix");
		int ar[][]=new int[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				ar[i][j]=sc.nextInt();
   			}
      		}
		out.println(" enter element to be found");			
            	int key=sc.nextInt();
           			
           	for(int i=0;i<rows;i++)
			{
			for(int j=0;j<cols;j++)
				{
			     	if(key ==ar[i][j])
					{
                                 	RESULT++ ;
					}
   				}	
			}

                if(RESULT>=1)
		{
			out.println("Element Found " + RESULT+" times");
		}

		else
		{
			out.println("element not found ");  
                }				

	}
}		