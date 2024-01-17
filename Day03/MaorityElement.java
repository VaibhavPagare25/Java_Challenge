
import java.util.*;
class MajorityElement{
	
	int biggest(int arr[]){
		
		int n = arr.length;
		int n1 = n/2;
		for(int i = 0; i<arr.length; i++){
			
			int count = 0;
			for(int j = i; j<arr.length; j++){

				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count >= n1){
				
				return arr[i];
			}	
		}
		
		return -1;	
	}
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		MajorityElement obj = new MajorityElement();

		System.out.println("Enter the size of Array");
		int size = sc.nextInt();

		int arr[] = new int[size];
		System.out.println("Enter the elements in array");
		for(int i = 0; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}

		int result = obj.biggest(arr);
		System.out.println(result);

	}
}
