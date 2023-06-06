package ClassWork;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class StudentMain {



    public static void main(String[] args) {

//        List<Student> studentList = List.of(new Student("Bolu", 25),
//                new Student("Tolu", 15));


        ArrayList<Student> students = new ArrayList<>();

        Student student1 = new Student("Bolu", 25);

        Student student2 = new Student("Tolu", 15);

        Student student3 = new Student("Tayo", 21);

        Student student4 = new Student("Toyin", 25);

        Student student5 = new Student("Ope", 25);

        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        Collections.sort(students, new StudentSorting());
        for (Student pupil : students) {
            System.out.println(pupil.getName() + " " + pupil.getAge());

//
//            Comparator<Student> comparator = Comparator.comparingInt(Student::getAge).
//                    thenComparing(Student::getName);



        }

    }

}
