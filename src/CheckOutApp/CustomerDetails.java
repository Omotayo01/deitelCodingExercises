package CheckOutApp;


public class CustomerDetails {
    public static void main(String[] args) {
        CartPopulation checkOut = new CartPopulation();

        checkOut.keepShopping();

        checkOut.displayFirstReceiptWithoutCalculatedChange();

        checkOut.displayFinalReceiptAfterChangeHaveBeenCalculated();
    }
}
