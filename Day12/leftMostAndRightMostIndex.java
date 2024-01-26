
class Solution {

    public pair indexes(long arr[], long x) {
        long first = 0;
        long second = 0;
        long count = 0;
        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                if (count == 0) {
                    first = i;
                    count++;
                }

                if (count > 0) {
                    second = i;
                    count++;
                }
            }
        }
        if (count == 0) {
            return new pair(-1, -1);
        } else if (count == 1) {
            return new pair(first, first);
        } else {
            return new pair(first, second);
        }
    }
}
