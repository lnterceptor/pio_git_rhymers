package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int ERROR = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[SIZE];

    private int total = ERROR;

    public void countIn(int in) {
        if (!isFull())
            numbers[total = getTotal() + 1] = in;
    }

    public boolean callCheck() {
        return getTotal() == ERROR;
    }

    public boolean isFull() {
        return getTotal() == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return ERROR;
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return ERROR;
        return numbers[total = getTotal() - 1];
    }

    public int getTotal() {
        return total;
    }
}
