package lambda_practice.myFunctionalInterface;

public class Human {
    private boolean hadDebts;

    public Human(boolean hadDebts) {
        this.hadDebts = hadDebts;
    }

    public boolean getDebtsHistory() {
        return hadDebts;
    }
}
