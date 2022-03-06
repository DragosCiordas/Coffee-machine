package FinalExam.caffeeMachine.menu.submenu;

public enum CoffeeTypes {
    MENU("1. Americano (3 ron)\n" +
            "2. Latte (5 ron) \n" +
            "3. Cappuccino (4 ron)\n" +
            "4. Espresso (2 ron) \n");


    private final String text;

    CoffeeTypes(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
