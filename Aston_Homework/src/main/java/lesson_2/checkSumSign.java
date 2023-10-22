package lesson_2;

public class checkSumSign {
    public static void main(String[] args) {
        checkSumSign();
    }
    public static void checkSumSign() {
        int a = 5;
        int b = 2;
        int sum = a + b;
        if (sum >= 0) {
            System.out.print("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
}