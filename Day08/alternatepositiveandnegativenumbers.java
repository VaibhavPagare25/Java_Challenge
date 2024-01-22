class Solution {

    void rearrange(int arr[], int n) {
        
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<0)
                neg.add(arr[i]);
            else
                pos.add(arr[i]);
        }
        int pcount = pos.size();
        int ncount = neg.size();
        if(pcount>ncount){
            for(int i=0;i<ncount;i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int index = ncount*2;
            for(int i=ncount;i<pcount;i++){
                arr[index++] = pos.get(i);
            }
        }
        else {
            for(int i=0;i<pcount;i++){
                arr[i*2] = pos.get(i);
                arr[i*2+1] = neg.get(i);
            }
            int index = pcount*2;
            for(int i=pcount;i<ncount;i++){
                arr[index++] = neg.get(i);
            }
        }
    }
}
