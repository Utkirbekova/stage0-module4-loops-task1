package school.mjc.stage0.loops.task1;

public class RepeatIsBad {
    void repeatIsBad(int n) {
        if (n > 0) {
            repeatIsBad(n - 1);
            System.out.print("writing the same code doesn't have much impact, and it's also time consuming\n");
        }
        return;
    }


    public void repeatIsBad() {
        repeatIsBad(20);
    }
}
