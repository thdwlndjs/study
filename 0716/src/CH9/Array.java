package CH9;

public class Array {

	public void arraySort(int[] a) {
		for (int i = a.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}

	public double arrayTotal(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		return total;
	}
}
