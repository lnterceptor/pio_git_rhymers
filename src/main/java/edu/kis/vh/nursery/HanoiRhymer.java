package edu.kis.vh.nursery;
//linijki ktore ulegly zmianie 5, 12, 14, 15
public class HanoiRhymer extends DefaultCountingOutRhymer {
//alt + strzalka powoduje zmiane otwartego okna w IntelliJ
    private int totalRejected = 0;

    int reportRejected() {
        return totalRejected;
    }

    @Override
    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
