
import java.util.*;
import java.util.Arrays;

class Compute {
    public String isSubset(int arr1[], int arr2[]) {
        String str1 = "Yes";
        String str2 = "No";

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    count++;
                    break; 
                }
            }
        }

        if (count == arr2.length) {
            return str1;
        } else {
            return str2;
        }
    }


    public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
		Compute obj = new Compute();

		System.out.println("Enter the size of an Array1");
                int size1 = sc.nextInt();
		System.out.println("Enter the size of an Array2");
		int size2 = sc.nextInt();

                System.out.println("Enter the elements of an Array1");
                int arr1[] = new int[size1];
                for(int i = 0; i<arr1.length; i++){

                        arr1[i] = sc.nextInt();
                }
		System.out.println("Enter the elements of an Array2");

                int arr2[] = new int[size2];
                for(int i = 0; i<arr2.length; i++){

                        arr2[i] = sc.nextInt();
                }


                String result = obj.isSubset(arr1, arr2);

                System.out.println(result);
	
    }
}

