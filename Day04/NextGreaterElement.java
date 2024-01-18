
class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for(int i=0;i<nums1.length;i++){
            int max = -1;
            boolean flag = false;
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    flag = true;
                }
                if(flag){
                    if(nums2[j]>max){
                        max = nums2[j];
                        if(max!=nums1[i]){
                            break;
                        }
                    }

                }
            }
            if(max==nums1[i]){
                result[i] = -1;
            }
            else {
                result[i] = max;
            }
        }
        return result;
    }
}

