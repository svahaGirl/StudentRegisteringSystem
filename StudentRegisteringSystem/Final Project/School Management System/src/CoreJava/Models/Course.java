package CoreJava.Models;

public class Course {

	public Course() {} // default constructor
	// fields
	private int ID;
	private String name;
	private String instructor;

	public Course(int ID, String name, String instructor) {
		this.ID = ID;
		this.name = name;
		this.instructor = instructor;
	}

	
	
	
	
	
	
	
	
	
	// getters & setters
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the instructor
	 */
	public String getInstructor() {
		return instructor;
	}

	/**
	 * @param instructor the instructor to set
	 */
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

}
