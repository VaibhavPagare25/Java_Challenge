
class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {

        Arrays.sort(a1);
        Arrays.sort(a2);

        int start = 0;
        int end = 0;

        while(start < n && end < m){
            if(a1[start] == a2[end]){
                start++;
                end++;
            }else{
                start++;
            }
        }

        if(end == a2.length){
            return "Yes";
        }else{
            return "No";
        }
    }
}

