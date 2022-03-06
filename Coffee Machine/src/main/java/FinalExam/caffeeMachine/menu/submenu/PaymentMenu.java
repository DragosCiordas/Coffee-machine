package FinalExam.caffeeMachine.menu.submenu;

public enum PaymentMenu {

    MENU("1. Cash\n" +
            "2. Card\n");


    private final String text;

    PaymentMenu(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
