package lesson_3;

public class Task_8 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int o : nums) {
            if (o < 6) {
                int result = o * 2;
                System.out.println(result);
            }
        }
    }
}
