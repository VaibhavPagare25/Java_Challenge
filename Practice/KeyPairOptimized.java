
import java.util.*;

class KeyPairOptimized {

	static boolean logic(int arr[], int n, int x) {
		Arrays.sort(arr);
		int i = 0;
		int j = n - 1;

		while (i < j) {
			if (arr[i] + arr[j] == x)
				return true;
			else if (arr[i] + arr[j] < x)
				i++;
			else
				j--;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();

		System.out.println("Enter the elements of Array");
		int arr[] = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("Enter Sum of two elements");
		int x = sc.nextInt();

		boolean result = logic(arr, size, x);
		System.out.println(result);

	}
}
