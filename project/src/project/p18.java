package project;

public class p18 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=3;i++)
		{
			for (j=1;j<=3;j++)
			{
				if(i>=j)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.println();
		}

	}

}
