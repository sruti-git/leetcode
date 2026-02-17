import java.util.*;
public class Solution {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            int index = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == num) {
                    index = j;
                    break;
                }
            }
            int nextGreater = -1;
            for (int k = index + 1; k < nums2.length; k++) {
                if (nums2[k] > num) {
                    nextGreater = nums2[k];
                    break;
                }
            }
            res[i] = nextGreater;
        }
        return res;
    }
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] ans = nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }
}
