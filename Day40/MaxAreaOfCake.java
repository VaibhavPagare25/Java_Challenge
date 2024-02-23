
class Solution {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        // Sort the horizontal and vertical cut positions
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);

        int maxHorizontalGap = Math.max(horizontalCuts[0], h - horizontalCuts[horizontalCuts.length - 1]);
        for (int i = 1; i < horizontalCuts.length; i++) {
            maxHorizontalGap = Math.max(maxHorizontalGap, horizontalCuts[i] - horizontalCuts[i - 1]);
        }

        int maxVerticalGap = Math.max(verticalCuts[0], w - verticalCuts[verticalCuts.length - 1]);
        for (int i = 1; i < verticalCuts.length; i++) {
            maxVerticalGap = Math.max(maxVerticalGap, verticalCuts[i] - verticalCuts[i - 1]);
        }

        return (int) ((long) maxHorizontalGap * maxVerticalGap % 1_000_000_007);
    }
}
