package lesson_5;

public class Dog extends Animal {
    static int count;

    public Dog(String name, int run, int swim) {
        super(run, swim);
        count++;
        if (run > 500) {
            System.out.println(name + " не может пробежать " + run + " метров");
        } else {
            System.out.println(name + " пробежал " + run + " метров");
        }
        if (swim > 10) {
            System.out.println(name + " не может проплыть " + swim + " метров\n");
        } else {
            System.out.println(name + " проплыл " + swim + " метров\n");
        }

    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }
}