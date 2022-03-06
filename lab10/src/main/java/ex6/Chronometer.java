package ex6;

public class Chronometer extends Thread {
    Interface inter;

    public Chronometer(Interface inter) {
        this.inter = inter;
    }

    @Override
    public void run() {
        while (true) {
            if (inter.starter) {
                inter.nr++;
                inter.txt.setText(inter.nr + "");
            } else {

                synchronized (inter) {
                    try {
                        inter.wait();
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }

            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }
}