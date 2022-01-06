package Array;

public class ArrayProgramSmallestNumber {

	public static void main(String[] args) {
	int []a= {12,2334,34,43,2,34,54,987,6,5};
	int smallest=a[0];
	for (int i=0;i<a.length;i++)
	{
		if(smallest>a[0])
		{
			smallest =a[i];
		}
	}
	System.out.println(smallest);

	}

}
