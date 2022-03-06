package ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class VerifyThread extends Thread {
    private final List<Robot> robots;
    private static final Random RANDOM = new Random();

    public VerifyThread(List<Robot> robots) {
        this.robots = robots;
    }

    @Override
    public void run() {

        while(!robots.isEmpty()){
            synchronized (robots){
                List<Robot> robotsToBeRemoved = new ArrayList<>();
                for(int i = 0 ; i<robots.size();i++){
                    for(int j = i+1;j<robots.size();j++){
                        if(robots.get(j).equals(robots.get(i))){
                            robotsToBeRemoved.add(robots.get(j));
                        }
                    }
                }
                System.out.println("Robots to be removed " + robotsToBeRemoved);
                robots.removeAll(robotsToBeRemoved);
            }
            try{
                Thread.sleep(100);

            }
            catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

        }
    }
}
