package bean;

import java.util.Objects;

public class Employee  implements Comparable <Employee>{

    public int eId;
    public String name;
    public double salary;
    public Department department;


    // aggretion department object needs to be create seprately will be passed
    public Employee(Department department) {

        this.setDepartment(department);


    }



//	@Override
//	public int hashCode() {
//		System.out.println("In HahsCode");
////		return Objects.hash(department, eId, name, salary);
//		return eId;
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		System.out.println("In Equals");
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return Objects.equals(department, other.department) && eId == other.eId && Objects.equals(name, other.name)
//				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
//	}

    @Override
    public int hashCode() {
        System.out.println("In hash code");
        return eId;
    }



    @Override
    public boolean equals(Object obj) {

        System.out.println("In equals");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return eId == other.eId && Objects.equals(name, other.name)
                && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
    }



//	@Override
//	public String toString() {
//		return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + ", department=" + department
//				+ ", geteId()=" + geteId() + ", getName()=" + getName() + ", getSalary()=" + getSalary()
//				+ ", getDepartment()=" + getDepartment() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
//				+ ", toString()=" + super.toString() + "]";
//	}



    public Employee() {
        System.out.println("Non parameterised Constructor");
    }

    @Override
    public String toString() {
        return "Employee [eId=" + eId + ", name=" + name + ", salary=" + salary + "]";
    }



    public Employee(int eId, String name, double salary) {

        System.out.println("Parameterised Constructor");

        this.eId = eId;
        this.name = name;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setData(int eId, String name, double salary) {
        this.eId = eId;
        this.name = name;
        this.salary = salary;
    }

    public void display() {

        System.out.println(eId + " " + name + " " + salary);
    }


    public void display(int eId, String name) {

        System.out.println(eId + " " + name );
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



    @Override
    public int compareTo(Employee o) {
        // TODO Auto-generated method stub

        if(eId > o.eId) {
            return 1;
        }else if (eId < o.eId) {
            return 0;
        }

        return 0;
    }





}
