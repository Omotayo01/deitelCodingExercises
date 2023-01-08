package ChapterFive;

import java.util.Scanner;

public class StudentGrades {

    public static void main(String[] args) {
        Scanner student = new Scanner(System.in);

        int gradeCounter = 0;
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;

        System.out.printf("%s%n%s%n%s%n%s%n", "Enter the student name and grade.", "Type the end-of-file indicator when yu are done",
                "On UNIX/Linux/MacOS type <Ctrl> d then press enter ",
                "On windows type <Ctrl> z then press Enter");

        while (student.hasNext()){
            String name = student.next();
            String grade = student.next();

           gradeCounter++;

           switch (grade){
               case "1":
               aCount++;
               break;

           }
        }
    }
}
