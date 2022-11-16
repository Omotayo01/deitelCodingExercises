package tdd;

public class Utme {
    public int copies(int numberBought) {
            if (numberBought >= 1 && numberBought <= 4)
            return numberBought * 2_000 ;

            if (numberBought >= 5 && numberBought <= 9)
                return numberBought * 1_800;


            if (numberBought >= 10 && numberBought <= 29)
                return numberBought * 1_600;

            if (numberBought >= 30 && numberBought <= 49)
                return numberBought * 1_500;

            if (numberBought >= 50 && numberBought <= 99)
                return numberBought * 1_300;

            if (numberBought >= 100 && numberBought <= 199)
                return numberBought * 1_200;

            if (numberBought >= 200 && numberBought <= 499)
                return numberBought * 1_100;

            if (numberBought >= 500 )
                numberBought = numberBought * 1000;
                return numberBought;
            }


}
