package FinalExam.caffeeMachine.menu.submenu;

public enum NutritionValue {
    MENU("1. Americano\n" +     //+
            "2. Latte\n" +
            "3. Cappuccino\n" +
            "4. Espresso\n");


    private final String text;

    NutritionValue(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
