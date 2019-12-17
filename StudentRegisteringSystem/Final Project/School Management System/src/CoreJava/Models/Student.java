package CoreJava.Models;

public class Student {
	
	public Student() {} //default constructor
	
	//fields
	private String email;
	private String name;
	private String pass;
	public Student(String email,String name,String pass) {
		this.email=email;
		this.name=name;
		this.pass=pass;
	}
	
	
	
	
	
	// getters & setters
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the pass
	 */
	public String getPass() {
		return pass;
	}
	/**
	 * @param pass the pass to set
	 */
	public void setPass(String pass) {
		this.pass = pass;
	}



}
