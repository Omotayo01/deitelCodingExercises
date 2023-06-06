package problemSolving;


import java.util.Scanner;

public class NumberOfOccurrenceOfCharacters {

    public static void repeatedCharacters() {
        Scanner collector = new Scanner(System.in);

        System.out.println("please enter any word");

        String word = collector.nextLine();
        int count = 0;
        char[] character = word.toCharArray();


        for (int i = 0; i < character.length; i++) {
            count = 1;

            for (int j = i + 1; j < character.length; j++) {
                if (character[i] == character[j]) {
                    count++;
                    character[j] = '0';
                }
            }
            if (count > 1) {
                if (character[i] == '0'){
                    break;
                }
                System.out.println(character[i] + " occurred " + count + " number of times" );
            }
        }
        if(count == 1) {
            System.out.println("no letters was repeated in the word");
        }
    }

    public static void main(String[] args) {
        repeatedCharacters();
    }
}




