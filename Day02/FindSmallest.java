
class SmallestAndSecondSmallest {

    public long[] minAnd2ndMin(long a[], long n){

        long arr[] = new long[a.length];
        long minEle = Long.MAX_VALUE;
        long minEle2 = Long.MAX_VALUE;

        for(int i = 0; i < a.length;i++){

            if(a[i] < minEle){
            minEle = a[i];
            }
        }

        for(int i = 0 ; i < a.length;i++){

            if(a[i] < minEle2 && a[i] != minEle){
                minEle2 = a[i];
            }
        }

        if(minEle2 == Long.MAX_VALUE){
            arr[0] = -1;
        }
        else{
            arr[0] = minEle;
            arr[1] = minEle2;
        }
        return arr;
    }
}
