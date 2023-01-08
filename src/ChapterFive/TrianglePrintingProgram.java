package ChapterFive;

public class TrianglePrintingProgram {
    public static void main(String[] args) {

        int line;

        int column;
        for (line = 1; line <= 10; line++) {

            for (column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("B");
        for (line = 10; line >= 1; line--) {

            for (column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("C");

        for (line = 10; line >= 1; line--) {
            for (int space = 10; space > line; space --){
                System.out.print(" ");
            }

            for (column = 1; column <= line; column++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("D");

        for (line = 10; line >= 1; line--) {
            for (int space = 1; space < line; space ++){
                System.out.print(" ");
            }

            for (column = 10; column >= line; column --) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
