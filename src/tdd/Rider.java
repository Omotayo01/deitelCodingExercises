package tdd;

public class Rider {

    private int riderBonus;

    public void collectionRateInPercentage(int successfullyDelivered, int attemptedDeliveries) {
        double collectionRateInPercentage = (successfullyDelivered * 100.0) / attemptedDeliveries;
        if (collectionRateInPercentage >= 50 && collectionRateInPercentage <= 59)
            riderBonus = successfullyDelivered * 200;
        if (collectionRateInPercentage >= 60 && collectionRateInPercentage <= 69)
            riderBonus = successfullyDelivered * 250;
        if (collectionRateInPercentage >= 70)
            riderBonus = successfullyDelivered * 500;

    }

    public int getRiderBonus() {

        return riderBonus;
    }

}
