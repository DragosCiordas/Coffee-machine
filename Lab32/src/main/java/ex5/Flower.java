package ex5;

public class Flower{
    int petal;
    public static int z;

    Flower(){
        System.out.println("Flower has been created!");
        z=z+1;
    }

    public static int getZ() {
        return z;
    }

    public static void main(String[] args) {
        Flower[] garden = new Flower[5];
        for(int i =0;i<5;i++){
            Flower f = new Flower();
            garden[i] = f;
        }
    }

}