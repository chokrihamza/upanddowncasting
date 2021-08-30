package domain;

public class Test {
public static void main(String[] args) {
	Employee employee=new Writer("Alex",300,TypeWriter.CLASSIC);
	  //System.out.println("employee = " + employee);
	  
	  //System.out.println(employee.getDetails());
    //Downcasting 
	// System.out.println(((Writer)employee).getDetails());
	Writer writer=(Writer)employee;
	System.out.println(writer.getDetails());
	
	// upcasting 
	Employee employee1=writer;
	System.out.println(employee1.getDetails());
	
	
}
}
