package lesson_3;

public class Task_5 {
    public static void main(String[] args) {
        System.out.println(leapYear());
    }
    private static boolean leapYear() {
        int year = 1700;
        if (year%4==0 && year%100==0 && year%400==0) {
            return true;
        }
        else {
            return false;
        }
    }
}
