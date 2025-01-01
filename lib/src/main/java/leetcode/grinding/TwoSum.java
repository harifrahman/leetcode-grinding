package leetcode.grinding;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            for (int j = i + 1; j < n; j++) {
                if (num + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        System.out.println("No solution found.");
        return new int[] {};
    }
}
