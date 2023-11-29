package lesson_5;
public class Cat extends Animal {
    static int count;
    public Cat(String name, int run, int swim) {
        super(run, swim);
        count++;
        if(run > 200) {
            System.out.println(name + " не может пробежать " + run + " метров");
        }
        else {
            System.out.println(name + " пробежал " + run + " метров");
        }
        if(swim >= 0) {
            System.out.println(name + ", как и все коты, не умеет плавать\n");
        }
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}