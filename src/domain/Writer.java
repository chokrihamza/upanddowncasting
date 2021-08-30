package domain;

public class Writer extends Employee  {

	final TypeWriter typeWriter;

	public Writer(String name, double salary,TypeWriter typeWriter) {
		super(name, salary);
		this.typeWriter=typeWriter;
	}
     @Override
	 public String getDetails() {
    	 return super.getDetails()+ ", typeWriter: " + typeWriter.getDescription();
    }

     @Override
     public String toString() {
         return "Writer{" + "typeWriting=" + typeWriter + '}' + " " + super.toString();
     }
     
	public TypeWriter getTypeWriter() {
		return this.typeWriter;
	}
	
	
	
}
