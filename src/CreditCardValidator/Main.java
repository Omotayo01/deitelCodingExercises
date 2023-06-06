package CreditCardValidator;

public class Main {

    public static void main(String[] args) {

        CollectingCreditCardNumber toVerify = new CollectingCreditCardNumber();

        CollectingCreditCardNumber.collectCardNumber();

        toVerify.displayCardAnalysisSummary();


    }
}
