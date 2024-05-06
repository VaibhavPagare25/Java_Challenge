
import java.util.*;

class FirstRepeatingElementOptimized {

    public static int firstRepeated(int[] arr, int n) {
        int index = -1;
        HashSet<Integer> hs = new HashSet<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (hs.contains(arr[i]))
                index = i;
            else
                hs.add(arr[i]);
        }

        if (index != -1)
            return index + 1;
        return -1;
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
        int result = firstRepeated(arr, size);

        System.out.println("First repeating element index is: " + result);
    }

}