package ex1;

public class CoffeeMaker {
    private final int nrOfCoffees;


    public CoffeeMaker(int nrOfCoffees) {
        this.nrOfCoffees = nrOfCoffees;
    }

    Coffee makeCoffee() throws Exception {
        System.out.println("Make coffee");
        int t = (int) (Math.random() * 100);
        int c = (int) (Math.random() * 100);
        if (Coffee.getNrOfInstances() == nrOfCoffees) {
            throw new Exception("Too many coffees, Stop! ");
        }
        Coffee coffee = new Coffee(t, c);

        return coffee;
    }
}
