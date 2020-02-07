package CoreJava.DAO;

import CoreJava.Models.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



//not the file
public class StudentDAO {

	public StudentDAO() {
	} // default constructor
	// fields

	public List<Student> getStudents() throws FileNotFoundException {
		String location = "/Users/Habboubi/eclipse-workspace/Final Project.zip_expanded/Final Project/students.csv";
		File file = new File(location);
		ArrayList<Student> studentList = new ArrayList<Student>();
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String[] line = input.nextLine().split(",");

				studentList.add(new Student(line[0], line[1], line[2]));
				
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problem: issue with split and adding reading from file student.csv");
			
		}
			
		return studentList;

	}

	public Student getStudentByEmail(List<Student> studentList, String studentEmail) {
	
		Student x = null;
		for(Student s: studentList) {
			if(s.getEmail().equals(studentEmail)) {
				 x = s;
			}
		}
		return x;
	}

	public boolean validateUser(List<Student> studentList, String studentEmail, String studentPass) {
		//for(Student student: studentList) {
		for(int i=0;i<studentList.size();i++) {
			
			String e =studentList.get(i).getEmail();
			String p =studentList.get(i).getPass();
			
			if(e.equals(studentEmail)&&p.equals(studentPass)) 
				return true;
			}
		return false;
	}
	
	
}
