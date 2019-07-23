package lambda_practice.myFunctionalInterface;

public class Main {
    public void checkDebtHistory(Human human){

        CreditGiver cg = human1 -> {
            return !human1.getDebtsHistory();
        };
        System.out.println("Can the visitor take credit? "+cg.canTakeCredit(human));
    }
}
