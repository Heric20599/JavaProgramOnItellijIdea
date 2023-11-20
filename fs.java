package DAAASSIGNMENT;

import java.util.Arrays;
import java.util.HashMap;

public class fs {
    public static void fs(int[] nums) {
        int[] arr = new int[nums.length];
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!mp.containsKey(nums[i])) {
                mp.put(nums[i], 1);
            } else {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            }
        }

    }
}
