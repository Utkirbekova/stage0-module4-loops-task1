package school.mjc.stage0.loops.task1;

public class RepeatIsBad {
    public static void main(String[] args) {
        repeatIsBad();
    }

    public static void repeatIsBad() {
        for (int runner = 0; runner < 20; ++runner) {
            System.out.println("writing the same code doesn't have much impact, and it's also time consuming");
        }
    }
}
