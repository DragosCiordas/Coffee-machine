package ex4;

import java.util.List;
import java.util.Random;

public class SetterThread extends Thread {
    private final List<Robot> robots;

    public SetterThread(List<Robot> robots) {
        this.robots = robots;
    }
    Random RANDOM = new Random();

    @Override
    public void run() {
        while(!robots.isEmpty()){
            for(Robot robot : robots){
                int x = RANDOM.nextInt(10);
                int y = RANDOM.nextInt(10);

                robot.setX(x);
                robot.setX(y);
                System.out.println("Set new values: x = " + x + "y = "+ y);

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}
