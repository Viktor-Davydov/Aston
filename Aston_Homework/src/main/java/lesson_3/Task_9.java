package lesson_3;

import java.util.Arrays;

public class Task_9 {
    public static void main(String[] args) {

        int[][] array = new int[6][6];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] || i + j == 5) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}