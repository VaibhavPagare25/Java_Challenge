
import java.util.*;
class Solution {

  public static ArrayList < Double > findMedian(ArrayList < Integer > arr, int n, int m) {
    Integer[] nums = arr.toArray(new Integer[0]);
    ArrayList<Double> alist = new ArrayList<Double>();
    for(int i = 0; i<=nums.length-m; i++){
      int start = i;
        int end = i+m;
        if(m % 2 ==0){
          int median1 = (start+end)/2;
          int median2 = median1 -1;
          double median = (nums[median1] + nums[median2]) / 2.0;
          alist.add(median);
        }
        else{
          int mid = (start+end) / 2;
          double median = nums[mid];
          alist.add(median);
        }
      }
    return alist;
  }


  public static void main(String[] args){
	 
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the N");
	int n = sc.nextInt();
	System.out.println("Enter the m");
	int m = sc.nextInt();
	System.out.println("Enter the elements of ArrayList");
	ArrayList<Integer> alist = new ArrayList<>();
	for(int i = 0; i<n; i++){
		alist.add(sc.nextInt());	
	}

	ArrayList<Double> medians = findMedian(alist,n,m);

	for (Double median : medians) {
        	System.out.print(median + " ");
      	}
      	System.out.println();
  }
}
