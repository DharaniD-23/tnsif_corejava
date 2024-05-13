
public class Students {
	
	    private int id;
	    private String name;
	    private int age;

	    // Constructor with only ID
	    public Students(int id) {
	        this.id = id;
	    }

	    // Constructor with ID and name
	    public Students(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    // Constructor with all attributes
	    public Students(int id, String name, int age) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	    }

	    // Getter methods
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }

	    public int getAge() {
	        return age;
	    }
	    public static void main(String[] args) {
	        // Creating instances of the Student class using different constructors
	        Students students1 = new Students(1);
	        Students students2 = new Students(2, "Devi");
	        Students students3 = new Students(3, "Dharani", 20);

	        // Example usage
	        System.out.println("Students 1: ID - " + students1.getId());
	        System.out.println("Students 2: ID - " + students2.getId() + ", Name - " + students2.getName());
	        System.out.println("Students 3: ID - " + students3.getId() + ", Name - " + students3.getName() + ", Age - " + students3.getAge());
	    }
	}

