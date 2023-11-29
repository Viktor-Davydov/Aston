package lesson_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a >= 0) {
            System.out.println("Это положительное число");
        }
        else {
            System.out.println("Это отрицательное число");
        }
    }
}