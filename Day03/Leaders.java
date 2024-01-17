
import java.util.*;
class Solution{
   
    static ArrayList<Integer> leaders(int arr[], int n){
       
        ArrayList<Integer> al = new ArrayList<Integer>();

        int max = arr[n-1];
        al.add(arr[n-1]);
        int index = 0;
        for(int i = n-2;i >=0;i--){

            if(arr[i] >= max){
                max = arr[i];
                int num = al.get(0);
                al.set(0,max);
                al.add(1,num);

            }
        }


        return al;
    }
}

class Client{

	public static void main(String[] args){

		Solution obj = new Solution();
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0; i< size;i++){
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> al = new ArrayList<Integer>();

		al = obj.leaders(arr,size);
		System.out.println(al);
	}
}

