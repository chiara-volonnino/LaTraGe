package utils;

/**
 * This class manages a simple counter
 */
public class CounterImpl implements Counter {

    private int counter;

    public CounterImpl(int init) {
        this.counter = init;
    }


    @Override
    public int getCounter() {
        return counter;
    }

    @Override
    public void increment() {
        counter++;
    }
}
