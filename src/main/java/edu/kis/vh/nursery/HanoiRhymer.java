package edu.kis.vh.nursery;
//linijki ktore ulegly zmianie 5, 12, 14, 15
public class HanoiRhymer extends defaultCountingOutRhymer {
//alt + strzalka powoduje zmiane otwartego okna w IntelliJ
    int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }

    public void countIn(int in) {
        if (!callCheck() && in > peekaboo())
            totalRejected++;
        else
            super.countIn(in);
    }
}
