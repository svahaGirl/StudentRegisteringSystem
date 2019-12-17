package CoreJava.DAO;

import CoreJava.Models.Attending;
import CoreJava.Models.Course;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendingDAO {
	public AttendingDAO() {} //default constructor

    public List<Attending> getAttending(){
    	String location = "/Users/Habboubi/eclipse-workspace/Final Project.zip_expanded/Final Project/attending.csv";
		File file = new File(location);
		ArrayList<Attending> attendingList = new ArrayList<Attending>();
		try {
			Scanner input = new Scanner(file);
			while (input.hasNextLine()) {
				String[] line = input.nextLine().split(",");


				attendingList.add(new Attending(Integer.parseInt(line[0]), line[1]));
				
			}
			input.close();
		} catch (FileNotFoundException e) {
			System.out.println("Problem: issue with split and adding reading from file attending.csv");
			
		}
			
		return attendingList;
    }

    public void registerStudentToCourse(List<Attending> attending, String studentEmail, int courseID){
    	String cName=""; int found=0;
    	for(int i=0;i<attending.size();i++) {
    		if (attending.get(i).getStudentEmail().equals(studentEmail)&& attending.get(i).getCourseID()==courseID) {
    			found++;
    			CourseDAO course = new CourseDAO();
    			List<Course> courseList=course.getAllCourses();
    			for(Course c:courseList) {
    				if(attending.get(i).getCourseID() == c.getID()) {
    					cName=c.getName();
    				}
    			}
    			
				
			}
    		else if(!(attending.get(i).getStudentEmail().equals(studentEmail)&& attending.get(i).getCourseID()==courseID)) {
				
			}
    	}
    	if(found==1) {
			System.out.println("Already attending course: "+cName);

    	}
    	else if(found==0) {
    		attending.add(new Attending(courseID,studentEmail));
			saveAttending(attending);
    	}
    		
    }

    public List<Course> getStudentCourses(List<Course> courseList, List<Attending> attending, String studentEmail){
    	ArrayList <Course> studentCourses = new ArrayList <Course>();
    	
    	for(Attending e:attending) {
    		if(e.getStudentEmail().equals(studentEmail)) {
        		for(Course c: courseList) {
        			if(e.getCourseID() == c.getID()) {
        				studentCourses.add(new Course(c.getID(),c.getName(),c.getInstructor()));
        			}
        			
        		}
    		}
    		

    		
    	}

    	return studentCourses;
    }

    public void saveAttending(List<Attending> attending){
    		
    	String location = "/Users/Habboubi/eclipse-workspace/Final Project.zip_expanded/Final Project/attending.csv";
		File file = new File(location);
		
		try {
			FileWriter writeAtt = new FileWriter(file,false);
			
			for(int i =0;i<attending.size();i++) {
				writeAtt.write(attending.get(i).getCourseID()+","+attending.get(i).getStudentEmail());
				writeAtt.append("\n");
			}
			System.out.println("Added!");
			writeAtt.close();
		} catch (Exception e) {
			System.out.println("Problem: adding all data to attending.csv");
			
		}
			
    	
    		
    }

}
