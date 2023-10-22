package lesson_2;

public class printColor {
    public static void main(String[] args) {
        printColor();
    }
    public static void printColor() {
        int value = 199;
        if (value <= 0) {
            System.out.print("Красный");
        }
        else if (value >0 && value <= 100){
            System.out.print("Желтый");
        }
        else {
            System.out.print("Зеленый");
        }
    }
}