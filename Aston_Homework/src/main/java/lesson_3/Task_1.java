package lesson_3;
public class Task_1 {
    public static void main(String[] args) {
        System.out.println(checkSum(5, 8));
    }
    private static boolean checkSum(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }
}