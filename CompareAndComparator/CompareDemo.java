package CompareAndComparator;

import java.util.Arrays;

import static CompareAndComparator.Student.NameCoparator;


public class CompareDemo {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0]= new Student(1,"Gagan","CSE","JAVA");
        students[1]= new Student(2,"Rohit","IT","Python");
        students[2]= new Student(3,"Aman","EC",".Net");
        students[3]= new Student(4,"Rahul","EEE","React");

        Arrays.sort(students, NameCoparator);

        for(Student s : students)
        {
            System.out.println(s);
        }
    }
}
