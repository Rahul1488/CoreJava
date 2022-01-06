package project;

public class Sorting {
	public static void main(String[] args) {
		int[] a = { 23, 44, 5, 65, 445, 6, 4, 8, 34, 54, 6, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("second laegest "+a[a.length - 2]);
	}
}
