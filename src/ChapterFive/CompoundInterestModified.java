package ChapterFive;

public class CompoundInterestModified {
    public static void main(String[] args) {

        double principal = 1000.0;
        double rate = 0.05;

        System.out.printf("%s%20s%35s%n", "year", "Amount on deposit", "interest rate");
        for (int counter = 1; counter <= 6; counter++) {
            for (int year = 1; year <= 10; year++) {

                double amount = principal * Math.pow(1.0 + rate, year);

                System.out.printf("%4d%20.2f%35.2f%n", year, amount, rate);


            }
            System.out.println();
            if (counter < 6) {
                System.out.printf("%s%20s%35s%n", "year", "Amount on deposit", "interest rate");
            }
            rate = rate + 0.01;

        }
    }
}
