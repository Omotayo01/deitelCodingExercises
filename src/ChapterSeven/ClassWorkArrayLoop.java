package ChapterSeven;

public class ClassWorkArrayLoop {

    public static void main(String[] args) {

        int[][] numbers = new int[3][3];

        int index = 0;

        for (int row = 0; row < numbers.length; row++) {

                index++;

            System.out.print(index);
            for (int colomn = 0; colomn < numbers[row].length; colomn++) {

                numbers [row] [colomn] = index ;


            }

            System.out.println();
        }

    }
}
