package ClassWork;

import java.util.Comparator;

class StudentSorting implements Comparator<Student> {
    @Override
    public int compare(Student e1, Student e2) {
 int result = Integer.compare(e1.getAge(), e2.getAge());
        if ( result !=0)
            return result;
        else
            return (e1.getName().compareTo(e2.getName()));


    }
}