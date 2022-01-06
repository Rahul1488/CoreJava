package project;

public class p9 {

	public static void main(String[] args) 
	{
		int i,j;
		int rows=5,col=5;
		for(i=5;i>=1;i--)
		{
			for(j=1;j<=5;j++)
			{
				if(j>=i)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}System.out.println();
		}
		

	}

}
