package project;

public class p30 {

	public static void main(String[] args)
	{
		
	for (int i = 0;i<5; i++)
	{
	for (int j = 4; j >=0; j--)
	{
	if(i>=j)
	{
		System.out.print("*");
	}
	else 
	{
		System.out.print(" ");
	}
	}
	for (int k = 1; k<5; k++)
	{
	if(i>=k)
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
	
	

	
		
	}

}
