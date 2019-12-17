package CoreJava.Models;

public class Attending {
	
	public Attending() {} //default constructor
	
	// fields
	int courseID;
	String studentEmail;
	
	public Attending(int courseID,String studentEmail) {
		this.courseID=courseID;
		this.studentEmail=studentEmail;
		
		
	}

	
	
	
	
	
	
	
	
	//getters&setters
	/**
	 * @return the courseID
	 */
	public int getCourseID() {
		return courseID;
	}

	/**
	 * @param courseID the courseID to set
	 */
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}

	/**
	 * @return the studentEmail
	 */
	public String getStudentEmail() {
		return studentEmail;
	}

	/**
	 * @param studentEmail the studentEmail to set
	 */
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	
	
	
    
}
