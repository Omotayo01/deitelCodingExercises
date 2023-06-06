package Di;

public class LekkiBoy extends Boyfriend {
    @Override
    public void spend(int amount) {
        System.out.println("Spending " + (amount + (amount * 0.5)));
        System.out.println("pull out kidney");
    }
}
