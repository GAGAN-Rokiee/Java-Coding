package Java8Features;

public class Employee{


    private int empId;
    private String empName;
    private int age;
    private String gender;
    private String dept;
    private int passing_year;
    private int salary;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getPassing_year() {
        return passing_year;
    }

    public void setPassing_year(int passing_year) {
        this.passing_year = passing_year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(int empId, String empName, int age, String gender, String dept, int passing_year, int salary) {
        this.empId = empId;
        this.empName = empName;
        this.age = age;
        this.gender = gender;
        this.dept = dept;
        this.passing_year = passing_year;
        this.salary = salary;
    }
}
