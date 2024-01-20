
import java.util.*;

class Solution {

    public long findMinDiff (ArrayList<Integer> a, int n, int m) { 

        Collections.sort(a);

        int res = Integer.MAX_VALUE;
        for(int i = 0; i <= n-m;i++) {
            int min = a.get(i);
            int max = a.get(i+m-1);
            int diff = max - min;

            if(diff < res) {

                res = diff;
            }

        }

        return res;
    }
}

class Client {

	public static void main(String[] args) {

		Solution obj = new Solution();

		ArrayList<Integer> al = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int m = sc.nextInt();

		for(int i = 0; i < size;i++) {

			int x = sc.nextInt();
			al.add(x);
		}

		long ret = obj.findMinDiff(al,size,m);
		System.out.println(ret);
	}
}


