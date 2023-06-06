package Di;

public class IlasaBoy extends Boyfriend {

    @Override
    public void spend(int amount) {
        System.out.println("Spending " + (amount - (amount * 0.5)));
    }
}
