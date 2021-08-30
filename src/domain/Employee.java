package domain;

public class Employee {
    protected String name;
    protected double salary;
    
    // construct 
    public Employee(String name,double salary){
    	this.name=name;
    	this.salary=salary;
    	
    }
    
    public String getDetails() {
    	 return "Name: " + this.name + ", salary: " + this.salary;
    }

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
}
