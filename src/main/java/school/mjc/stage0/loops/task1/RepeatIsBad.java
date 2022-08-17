package school.mjc.stage0.loops.task1;

public class RepeatIsBad {


    void repeatIsBad() {
        String s = "writing the same code doesn't have much impact, and it's also time consuming";
        String i = "--------------------";
        i = i.replaceAll("-", s + "\n");

        System.out.print(i);
    }
}