package project;

public class p19 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++)
		{
			for(j=3;j>=1;j--)
			{
				if(j>=i)
				{
					System.out.print("*");
				}else {
					System.out.print(" ");
			}}
			System.out.println();
		}
	}

}
