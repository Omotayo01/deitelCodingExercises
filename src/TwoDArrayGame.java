import java.util.Arrays;

public class TwoDArrayGame {

    static char[][] symbol = {
            {'X', 'O', 'X'},
            {'O', 'O', 'X'},
            {'X', 'O', 'O'}};

    public static void main(String[] args) {
        int row = symbol.length;

        for(int k = 0; k < symbol.length; k++ ){
            for (int m = 0; m < symbol[0].length; m++){

                System.out.print(symbol[k][m] + "    ");


            }
            System.out.println();
        }
        System.out.println("-----------");

        for (int i = 0; i < symbol.length ; i++){

            for (int j = 0; j < symbol[i].length ; j++){
                if (symbol[i][j] == 'X') {
                    symbol[i][j] = '1';
                }
                else

                    symbol[i][j] = '0';

                System.out.print(symbol[i][j] + "    ");

            }
            System.out.println();
        }


    }

}

