
/* Problem Link: https://leetcode.com/problems/longest-consecutive-sequence/description/ */
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
        int longest = 0;
        for (int i : nums) {
            set.add(i);
        }
        for (int i : set) {
            int length = 1;
            if (!set.contains(i - 1)) {
                while (set.contains(i + length)) {
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}