package loops;
import java.util.*;
public class threedimensional {

	
	public static void main(String[] args) {
		// to store the data of number of students within the colleges in the respective cities
		
		Scanner scan = new Scanner(System.in);
		int[][][] ar = new int[3][][];
		ar[0] = new int[2][];
		ar[1] = new int[3][];
		ar[2] = new int[2][];
			
		ar[0][0] = new int[2];
		ar[0][1] = new int[3];
		ar[1][0] = new int[2];
		ar[1][1] = new int[1];
		ar[1][2] = new int[3];
		ar[2][0] = new int[4];
		ar[2][1] = new int[2];
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				for(int k=0; k<ar[i][j].length; k++)
				{
					System.out.println(" enter the city name "+i+" the college name "+j+ " enter its marks "+k);
					ar[i][j][k] = scan.nextInt();
					
					
				}
			}
		}
		System.out.println("marks stored areas follows:");
		for(int i=0; i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length; j++)
			{
				for(int k=0; k<ar[i][j].length; k++)
				{
					System.out.print(ar[i][j][k] + " ");
					
				}
				System.out.println();
			}
		}
	scan.close();
			 
			 
			
			
	}

}
