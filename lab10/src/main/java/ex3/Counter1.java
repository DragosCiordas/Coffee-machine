package ex3;

public class Counter1 extends Thread {
private final int start;
private final int end;
private final Counter1 counter;


    Counter1(String name, int start, int end, Counter1 counter ){
        super(name);
     this.start=start;
     this.end=end;
     this.counter=counter;
    }


    public void run(){
        for(int i=start;i<=end;i++){

            System.out.println(getName() + " i = "+i);

            try {
                Thread.sleep((int)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(getName() + " job finalised.");

    }

    public static void main(String[] args) {
        Counter1 c1 = new Counter1("counter1",0,100,null);
        Counter1 c2 = new Counter1("counter2",11,200,c1);

        c1.run();
        c2.start();

    }
}