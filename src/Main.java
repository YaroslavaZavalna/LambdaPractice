import lambda_practice.myFunctionalInterface.Human;
import lambda_practice.myFunctionalInterface.Main;

public class Main {
    public static void main(String[] args) throws Exception {

        lambda_practice.myFunctionalInterface.Main m = new lambda_practice.myFunctionalInterface.Main();
        Human h = new Human(false);
        m.checkDebtHistory(h);
    }
}
