class p5
{
	public static void main(String[] args) 
	{
		int row=5,col=5;
		for(int i=1;i<=row;i++)
		{
		for(int j=1;j<=col;j++)
			{
		     if(i>j)
				{
			 System.out.print(i);
             System.out.print(i+=1);
			 }
			 else
				{
			 System.out.print(' ');
			 }
		}
		System.out.println();
		}
	}
}
