package bean;

public class TestEmployee {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		emp1.setData(101, "Asha", 60);
		emp1.display();

		Employee emp2 = new Employee();
		emp2.setData(102, "Nisha", 65);
		emp2.display();

		emp2.setName("Disha");
		emp2.setSalary(75);
		
		
	
		
	

	}

}
