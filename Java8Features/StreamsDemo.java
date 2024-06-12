package Java8Features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee(100, "Gagan", 26, "Male", "Java", 2018, 25000));
        employeeList.add(new Employee(102, "Aakas", 36, "Male", "Python", 2013, 45000));
        employeeList.add(new Employee(103, "Rahul", 56, "Male", "SQL", 2017, 84000));
        employeeList.add(new Employee(104, "Karan", 26, "Male", "SQL", 2015, 25000));
        employeeList.add(new Employee(105, "Vaisali", 36, "Female", "C#", 2004, 35000));
        employeeList.add(new Employee(106, "mohit", 24, "Male", "React", 2022, 25000));
        employeeList.add(new Employee(107, "Rohit", 25, "Male", "Angular", 2021, 25000));
        employeeList.add(new Employee(108, "sanjay", 27, "Male", "Python", 2020, 35000));
        employeeList.add(new Employee(108, "kesav", 29, "Male", "C#", 2017, 24000));
        employeeList.add(new Employee(110, "lalit", 28, "Male", "Java", 2018, 24000));
        employeeList.add(new Employee(111, "sachin", 36, "Male", "Angular", 2006, 45000));
        employeeList.add(new Employee(112, "Mayank", 46, "Male", "Python", 2000, 65000));
        employeeList.add(new Employee(113, "Sahil", 27, "Male", "C#", 2018, 25000));
        employeeList.add(new Employee(114, "vinod", 22, "Male", "Java", 2022, 23000));
        employeeList.add(new Employee(115, "Priyanka", 36, "Female", "C#", 2006, 45000));
        employeeList.add(new Employee(116, "Kanchan", 27, "Female", "Java", 2019, 27000));
        employeeList.add(new Employee(117, "Vishal", 29, "Male", "PLSQL", 2014, 28000));
        employeeList.add(new Employee(118, "Soumya", 28, "Female", "AWS", 2015, 28000));
        employeeList.add(new Employee(119, "Pragya", 24, "Female", "C#", 2019, 25000));
        employeeList.add(new Employee(120, "Pragati", 28, "Female", "Java", 2018, 25000));
        employeeList.add(new Employee(121, "Khushi", 30, "Female", "SQL", 2012, 65000));
        employeeList.add(new Employee(122, "Payal", 36, "Female", "PLSQL", 2005, 46000));
        employeeList.add(new Employee(123, "Sonali", 28, "Female", "React", 2004, 29000));
        employeeList.add(new Employee(124, "Kiran", 27, "Female", "Angular", 2003, 24000));
        employeeList.add(new Employee(125, "Anamika", 29, "Female", "Java", 2002, 26000));

        Optional<Employee> employe = findEmpNameWithHighestSalary(employeeList);
        employe.ifPresent(employee -> System.out.println("employee with highest salary is " + employee.getEmpName()));
    }

    private static  Optional<Employee> findEmpNameWithHighestSalary(List<Employee> employeeList) {
        return employeeList.stream().max(Comparator.comparing(Employee::getSalary));
       // return null;
    }
}
