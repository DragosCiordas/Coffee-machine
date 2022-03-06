package FinalExam.caffeeMachine.menu;

public enum Menu {
    MENU("\n1. Coffee types\n" +
            "2. Set sugar \n" +
            "3. Nutrition values\n" +
            "4. Exit \n");


    private final String text;

    Menu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

}
