package Aula_2.TM;

public class Counter {
    private int counter;

    public Counter() {
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public Counter(Counter copy) {
        this.counter = copy.getCounter();
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increaseCounter() {
        this.counter++;
    }

    public void decreaseCounter() {
        this.counter--;
    }
}
