package tdd.chapterThree;

public class Car {

    private String model;

    private String year;

    private double price;

    public Car (String model, String year , double price){

    }

    public String getCarModel() {
        return model;
    }

    public String getCarYear() {
        return year;
    }

    public double getCarPrice() {
        return price;
    }

    public void carModel (String modelType) {
        model = modelType;

    }

    public void carYear (String carYear) {
        year = carYear;

    }

    public void carPrice (double carPrice) {
        if (carPrice < 0)
            price = price;
        if (carPrice > 0)
            price = carPrice;

    }
    public void carDiscount (double discount) {
        price = (price - ((discount/100.0) * price));
    }
}
