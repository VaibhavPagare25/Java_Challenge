
import java.util.*;
class SingleNumberOptimized{
	
	int single(int arr[]){

		int result = 0;
        	int i = 0;
        	while(i < arr.length) {

          		result = (result ^ arr[i]);
            		i++;
		}

        	return result;
	}



	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
	
                SingleNumberOptimized obj = new SingleNumberOptimized();

                System.out.println("Enter the size of an Array");
                int size = sc.nextInt();
                System.out.println("Enter the elements of Array");
                int arr[] = new int[size];

                for(int i = 0; i<arr.length; i++){

                        arr[i] = sc.nextInt();
                }

                int solution = obj.single(arr);
		
                System.out.println("Only one Single Element in Array is: " + solution);

	}	
}
