/**
 * Problem Link:
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 */
// Since input array is sorted, two pointer approach is used

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int res[] = new int[2];
        int p1 = 0, p2 = numbers.length - 1;
        while (p1 < p2) {
            if (numbers[p1] + numbers[p2] > target) {
                p2--;
            } else if (numbers[p1] + numbers[p2] < target) {
                p1++;
            } else {
                break;
            }
        }
        res[0] = p1 + 1;
        res[1] = p2 + 1;
        return res;
    }
}
