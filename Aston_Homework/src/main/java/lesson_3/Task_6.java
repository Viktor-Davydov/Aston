package lesson_3;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(nums));
        int a = 0;
        if (nums[a] == 1) {
            nums[a] = 0;
        }
        System.out.println(Arrays.toString(nums));

    }
}
