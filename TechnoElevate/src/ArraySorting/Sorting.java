package ArraySorting;

public class Sorting {

	public static void main(String[] args) {
		int a[] = { 12, 23, 54, 666, 456, 89, 76, 4, 7, 9, 1 };
		int temp;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int x : a) {
			System.out.println(x);
		}

	}

}
