
import java.util.*;
class SingleNumber{
	
	int single(int arr[]){

		for(int i = 0; i<arr.length; i++){
			
			int count = 0;

			for(int j = 0; j<arr.length; j++){
			
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count == 1){
				return arr[i];
			}
		}
		return -1;

	}


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		SingleNumber obj = new SingleNumber();
		
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		System.out.println("Enter the elements of Array");
		int arr[] = new int[size];
		
		for(int i = 0; i<arr.length; i++){

			arr[i] = sc.nextInt();
		}

		int solution = obj.single(arr);
		
		System.out.println(solution);


	}
}
