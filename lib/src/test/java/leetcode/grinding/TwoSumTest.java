package leetcode.grinding;

import org.junit.jupiter.api.Test;

/**
 * Test cases for TwoSum.
 * <br>
 * <a href="https://leetcode.com/problems/two-sum/">
 * https://leetcode.com/problems/two-sum/
 * </a>
 */
public class TwoSumTest {
    @Test
    void testTwoSum1() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        assert result[0] == 0;
        assert result[1] == 1;
    }

    @Test
    void testTwoSum2() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assert result[0] == 1;
        assert result[1] == 2;
    }

    @Test
    void testTwoSum3() {
        TwoSum twoSum = new TwoSum();
        int[] nums = {3, 3};
        int target = 6;
        int[] result = twoSum.twoSum(nums, target);
        assert result[0] == 0;
        assert result[1] == 1;
    }
}
