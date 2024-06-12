package CompareAndComparator;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private int student_id;
    private String name;
    private String branch;
    private String course;

    public Student(int student_id, String name, String branch, String course) {
        this.student_id = student_id;
        this.name = name;
        this.branch = branch;
        this.course = course;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student{" +
                "student_id=" + student_id +
                ", name='" + name + '\'' +
                ", branch='" + branch + '\'' +
                ", course='" + course + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.student_id- o.student_id;
    }

    public static Comparator<Student> NameCoparator = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };
}
