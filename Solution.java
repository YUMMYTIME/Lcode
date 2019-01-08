public class Solution {
    /**
     * @param nums: An integer array
     * @return: nothing
     */
    public void recoverRotatedSortedArray(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0) {
            return;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            if(nums[start] < nums[end]) {
                return;
            } else {
                int mid = start + (end - start) / 2;
                if(nums[start] < nums[mid]) {
                    start = mid;
                } else {
                    end = mid;
                }
            }
        }
        int min = nums[start] < nums[end] ? start: end;
        int i = min;
        while (i<= nums.length - 1) {
            nums[i-min] = nums[i];
            i++;
        }
        int j = min - 1;
        while ( j>=0) {
            nums[j + nums.length - min] = nums[j];
            j --;
        }

    }
}