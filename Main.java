package lesson_5;
public class Main {
    public static void main(String[] args) {
        Dog tuzik = new Dog( "Тузик", 36, 9);
        Cat sardelka = new Cat("Сарделька", 6, 0);
        Dog pirat = new Dog("Пират",710,56);
        Dog oreshek = new Dog("Орешек",8,620);
        Cat ryzhyk = new Cat("Рыжик", 250, 40);

        System.out.println("Всего бежало и плыло " + Animal.count + " животных");
        System.out.println("В их числе " + Dog.count + " собак");
        System.out.println("И еще " + Cat.count + " котов");
    }
}