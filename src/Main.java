import java.awt.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws AWTException, InterruptedException {
        Robot rb = new Robot();
        Random random = new Random();
        int r1 = random.nextInt(1000);
        int r2 = random.nextInt(1000);
        int timer = 0;

        while(0 <= 120){
            rb.mouseMove(r1, r2);
            TimeUnit.MILLISECONDS.sleep(100);
            timer++;
        }
    }
}
