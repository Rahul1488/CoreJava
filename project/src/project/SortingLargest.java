package project;

public class SortingLargest{
	public static void main(String[] args) {

		int[] a = { 33, 44, 5, 12, 4, 5, 8, 22, 44, 99 };

		int l = a[0];
for (int i = 0; i < a.length; i++) {
	if(l<a[i])
	{
		l=a[i];
	}
}
System.out.println("largest element is "+l);
	}
}
