
public class ReccurUsingMethod
{

	public static void main(String[] args)
	{
	int a=4;
	System.out.println(recur(a));

	}

	 static int recur(int a) {
		int fact=a;
		if(a==1)
		{
			return 1;
		}
		return fact=a*recur(a-1);
	}

}
