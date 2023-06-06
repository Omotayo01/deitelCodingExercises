package Di;

public class ShoppingMall {

    public static void main(String[] args) {
        IlasaBoy allwell = new IlasaBoy();

        Girl renike = new Girl(allwell);

        renike.spendSomeMoney(5000);

        Boyfriend prof = new LekkiBoy();

        renike.setBoyfriend(prof);

        renike.spendSomeMoney(5000);
    }
}
