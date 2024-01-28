
class Solve {
    int[] printUnsorted(int[] arr, int n) {

        int nums[] = new int[n];


        int arr2[] = new int[2];


        for(int i = 0; i < n;i++){
            nums[i] = arr[i];
        }

        Arrays.sort(nums);

        //int index1 = 0;
        //int index2 = 0;
        int p = 0;
        int q = n-1;

        while(p < n){
            if(nums[p] != arr[p]){
                //index1 = p;
                arr2[0] = p;
                break;
            }
            p++;
        }

        while(q >= 0){

            if(nums[q] != arr[q]){
                //index2 = q;
                arr2[1] = q;
                break;
            }
            q--;
        }


        return arr2;
    }

}
