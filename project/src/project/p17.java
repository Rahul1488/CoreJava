package project;

class p17
{
	public static void main(String[] args) 
	{
	int i,j;
	for (i=1;i<=2;i++)
	{
		for (j=3;j>=1;j--)
		{
			if (j<=i)
			{
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		for (j=1;j<=3;j++)
		{
			if(i>j)
				System.out.print("*");
			else 
				System.out.print(" ");
		}
		System.out.println();	
	}
	for(i=1;i<=3;i++)
	{
		for(j=1;j<=3;j++)
		{
			if(j>=i)
				System.out.print("*");
			else
				System.out.print(" ");
		}
		for(j=3;j>=1;j--)
		{
			if(j>i)
			{
				System.out.print("*");
			}
			else
			{
				System.out.print(" ");
		}
		
		}
		System.out.println();
	}}}

