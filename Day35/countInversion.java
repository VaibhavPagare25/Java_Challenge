
class Solution {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    // Function to count inversions in the array.
    static long inversionCount(long arr[], long N) {
        return mergeSortAndCount(arr, 0, N - 1);
    }

    static long mergeSortAndCount(long arr[], long left, long right) {
        long invCount = 0;
        if (left < right) {
            long mid = left + (right - left) / 2;
            invCount += mergeSortAndCount(arr, left, mid);
            invCount += mergeSortAndCount(arr, mid + 1, right);
            invCount += mergeAndCount(arr, left, mid, right);
        }
        return invCount;
    }

    static long mergeAndCount(long arr[], long left, long mid, long right) {
        long[] temp = new long[(int) (right - left + 1)];
        long invCount = 0;
        long i = left, j = mid + 1, k = 0;

        while (i <= mid && j <= right) {
            if (arr[(int) i] <= arr[(int) j]) {
                temp[(int) k++] = arr[(int) i++];
            } else {
                temp[(int) k++] = arr[(int) j++];
                invCount += mid - i + 1;
            }
        }

        while (i <= mid) {
            temp[(int) k++] = arr[(int) i++];
        }

        while (j <= right) {
            temp[(int) k++] = arr[(int) j++];
        }

        System.arraycopy(temp, 0, arr, (int) left, temp.length);

        return invCount;
    }
}

