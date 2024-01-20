import java.util.*;

class Solution {

    public static int equilibriumPoint(long arr[], int n) {

        int equilibrium = 0;
        boolean flag = false;
        long sum = 0;
        for(int i = 0; i < n;i++){
            sum = sum + arr[i];
        }

        long leftSum = 0;
        long rightSum = arr[n-1];

        for(int i = 0 ; i < n;i++){
            rightSum = sum - leftSum;
            leftSum = leftSum + arr[i];

            if(leftSum == rightSum){
                flag = true;
                equilibrium = i;
                break;
            }
        }

        if(n == 1){
            return 1;
        }else if(flag == false){
            return -1;
        }else{
            return (equilibrium+1);
        }
    }
}

class Client{

	public static void main(String[] args){

		Solution obj = new Solution();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();

		System.out.println("Enter the elements of an array");
		long nums[] = new long[size];
		for(int i = 0;i < size;i++){
			nums[i] = sc.nextInt();
		}

		int ret = obj.equilibriumPoint(nums,size);
		System.out.println(ret);
	}
}


