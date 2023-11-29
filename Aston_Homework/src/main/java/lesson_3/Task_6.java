package lesson_3;

import java.util.Arrays;

public class Task_6 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 1, 0};
        System.out.println(Arrays.toString(nums));
        for (int o : nums) {
            if (o == 1) {
                int result = 0;
                System.out.print(result + " ");
            }

            if (o == 0) {
                int result = 1;
                System.out.print(result + " ");
            }
        }
    }
}