package lcode;

import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subsetHelper(result, list, nums, 0);
        return result;
    }
    public void subsetHelper(List<List<Integer>> result, List<Integer> list, int[] nums, int pos) {
        result.add(new ArrayList<Integer> (list));
        for(int i = pos; i < nums.length; i++) {
            if(i != pos && nums[i] == nums[i - 1]){
                continue;
            }
            list.add(nums[i]);
            subsetHelper(result, list, nums, i + 1);
            list.remove(list.size() - 1);
        }
    }
}
