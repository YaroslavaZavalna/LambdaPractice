import lambda_practice.myFunctionalInterface.Human;
import lambda_practice.myFunctionalInterface.Main;

public class test {
    public static void main(String[] args) throws Exception {

        Main m = new Main();
        Human h = new Human(false);
        m.checkDebtHistory(h);
    }
}
