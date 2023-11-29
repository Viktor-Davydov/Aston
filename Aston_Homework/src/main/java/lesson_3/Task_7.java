package lesson_3;

import java.util.Arrays;

public class Task_7 {
    public static void main(String[] args) {
        int[] arr = new int [100];
        int i;
        for (i = 0; i < 100; i++) {
            arr [i] = i+1;
        }
        System.out.print(Arrays.toString(arr));
    }
}