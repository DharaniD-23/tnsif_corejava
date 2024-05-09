
public class Student {
	//Instance variables
	private int Studentid;
	private String name;
	private String dept;
	private double cgpa;
	
	//Constructor
	public Student(int Studentid, String name, String dept, double cgpa) 
	{
		 this.Studentid= Studentid;
		 this.name= name;
		 this.dept= dept;
		 this.cgpa= cgpa;
	}
	
//Getter & Setter methods
	public int getStudentid() {
		return Studentid;
	}

	public void setStudentid(int Studentid) {
		this.Studentid = Studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}
	
	//Method to display student information
	public void displayInfo() { 
		System.out.println("Studentid:" +Studentid);
		System.out.println("name:" +name);
		System.out.println("dept:" +dept);
		System.out.println("cgpa:" +cgpa);
	}
	
	public static void main(String[]args) {
		
		//Create a new Student object
		Student student1 = new Student(8126024,"DHARANI","CSE",81.67);
		
		//Display student information
		student1.displayInfo();
	}
}	
	

	
