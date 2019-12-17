package CoreJava.MainEntryPoint;

import java.io.FileNotFoundException;
import java.util.List;

import CoreJava.DAO.StudentDAO;
import CoreJava.Models.Student;

public class TestRunner {
    public static void main(String[] args) throws FileNotFoundException {
    	StudentDAO studentDAO = new StudentDAO();
        List<Student> studentList = studentDAO.getStudents();
        
        for(Student student: studentList) {
        	System.out.println(student.getEmail()+"|"+ student.getName()+"|"+ student.getPass());
        }
        
        
    	String e ="tom@gmail.com";
		String p ="tom@gmail.com";
		
		if(e==p) {
			System.out.println("true");
		}
    }
}
