package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int SIZE = 12;
    private static final int ERROR = -1;
    private static final int FULL = 11;
    private final int[] numbers = new int[getSIZE()];

    private int total = getERROR();

    public static int getSIZE() {
        return SIZE;
    }

    public static int getERROR() {
        return ERROR;
    }

    public static int getFULL() {
        return FULL;
    }


    public void countIn(int in) {
        if (!isFull())
            numbers[total = getTotal() + 1] = in;
    }

    public boolean callCheck() {
        return getTotal() == getERROR();
    }

    public boolean isFull() {
        return getTotal() == getFULL();
    }

    protected int peekaboo() {
        if (callCheck())
            return getERROR();
        return numbers[getTotal()];
    }

    public int countOut() {
        if (callCheck())
            return getERROR();
        return numbers[total = getTotal() - 1];
    }

    public int getTotal() {
        return total;
    }
}
