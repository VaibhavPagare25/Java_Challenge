
import java.util.*;
class Solution{
	
	int[] plusOne(int[] arr) {

        	int n = arr.length;

		for (int i = n - 1; i >= 0; i--) {
            		if (arr[i] != 9) {
                		arr[i]++;
                		return arr;
           		}	
	       		else {
                		arr[i] = 0;
			}
		}	

        	int[] result = new int[n + 1];
        	result[0] = 1;
        	return result;

	}

	public static void main(String[] args){

                Solution obj = new Solution();

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter the size of an Array");
                int size = sc.nextInt();
                System.out.println("Enter the elements of an Array");
                int nums[] = new int[size];

                for(int i = 0; i < size;i++) {

                        nums[i] = sc.nextInt();
                }

                int[] ret = obj.plusOne(nums);
                for(int i = 0; i<ret.length; i++){
                        System.out.println(ret[i]);
                }
        }

}
