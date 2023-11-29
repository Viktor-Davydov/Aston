package lesson_5;
public class Animal {

    public int run;
    public int swim;
    static int count;

    public Animal(int run, int swim) {
        this.run = run;
        this.swim = swim;
        count++;
    }

    public void getRun(int run) {
        this.run = run;
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