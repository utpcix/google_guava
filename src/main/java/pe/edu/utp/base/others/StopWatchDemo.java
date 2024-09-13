package pe.edu.utp.base.others;

import com.google.common.base.Stopwatch;

import java.time.Duration;

public class StopWatchDemo {

    public static void main(String[] args) {

        Stopwatch stopwatch = Stopwatch.createStarted();
        for (int i = 0; i < 1000000; i++) {
            String aux = new String("Hello" + i);
            System.out.println(aux);
        }
        stopwatch.stop();

        Duration duration = stopwatch.elapsed();
        System.out.println("duration = " + duration);

    }
}
