package loops;

public class basics {

	public static void main(String[] args) {
		int n = 10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if ( i!=1 && j==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if (j==0  || i==j || j==(n-1)  )
				{
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if (j==(n+1)/2 || (i==0 && j>=(n+1)/2) || (i==(n+1)/2 && j>=(n+1)/2) || (i==(n-1) && j>=(n+1)/2) )
				{
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if (j==(n+1)/2 || (i==(n-1) && j>=(n+1)/2) ||(j==(n-1)))
				{
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if (j==(n+1)/2 || (i==0 && j>=(n+1)/2) || (j==(n-1) && (i<=(n-1)/2))||(i==(n-1)/2)&&(j>(n-1)/2)||(i==j && j>(n-1)/2) )
				{
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		
			for(int j=0;j<n;j++)
			{
				if ((j==(n+1)/4   ) || (i==0 && j>(n+1)/4)&& (j<=3*(n+1)/4) || (i==(n-1) && j>(n+1)/4)&& j<=3*(n+1)/4 || (j==3*(n+1)/4)    )
				{
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int j=0;j<n;j++)
			{
				if (j==0  || i==j || j==(n-1)  )
				{
						System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			
			System.out.println();
			
		}
		int m = 10;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if (j==0 )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
					
				}
		
			}
	
		}	
	}
}
