package collections;

import bean.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream {
    public static void main(String[] args) {
        Employee emp1= new Employee(101,"Asha",60);
        Employee emp2= new Employee(103,"Nisha",65);
        Employee emp3= new Employee(102,"Disha",76);
        Employee emp4= new Employee(102,"Disha",76);
        List<Employee> list=new ArrayList<Employee>();
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        List<Double> salaryList=list.stream()
                .filter(emp->emp.salary>60)//used to filter list
                .map(emp -> emp.salary)
                .collect(Collectors.toList());
        System.out.println(salaryList);
    }
}
