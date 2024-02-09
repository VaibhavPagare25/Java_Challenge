
class Solution {
  public int findPairs(int[] nums, int k) {
    int count = 0;
    Map<Integer, Integer> hm = new HashMap<>();

    for (int i = 0; i < nums.length; ++i)
      hm.put(nums[i], i);

    for (int i = 0; i < nums.length; ++i) {
      int target = nums[i] + k;
      if (hm.containsKey(target) && hm.get(target) != i) {
        count++;
        hm.remove(target);
      }
    }

    return count;
  }
}
