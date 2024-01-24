
import java.util.*;

class Solution{

	String longestCommonPrefix(String str[]){
		
		int size = str.length;
		if(size == 0){
			return "";
		}

		if(size == 1){
		       return str[0];
		}
		
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< size; i++){

			if(str[i].length() <  min){

				min = str[i].length();
			}
		}

		Arrays.sort(str);
		int i = 0;
		while(i < min && str[0].charAt(i) == str[size-1].charAt(i)){
			i++;
		}

		String result = str[0].substring(0, i);
		return result;
			
	}

	public static void main(String[] args){

	
		Scanner sc = new Scanner(System.in);
		Solution obj = new Solution();
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		String arr[] = new String[size];
		System.out.println("Enter the strings of an array");
		for(int i = 0; i<arr.length; i++){
	
			arr[i] = sc.next();
		}

		System.out.println(obj.longestCommonPrefix(arr));

	}
}
