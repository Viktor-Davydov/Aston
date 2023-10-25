package lesson_3;
public class Task_3{
    public static void main(String[] args) {
        System.out.println(negativeNumber(-2));
    }
    private static boolean negativeNumber(int a) {
        if (a < 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
