package day2homework2;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		
		Student student1=new Student(1,"Stive", 90 ,"Computer engineer");
		Student student2=new Student(2,"Jane",100 , "Sociology ");
		Student student3=new Student(3,"Jesica",80,"Psychology");
		
		Student[] students= {student1, student2,student3};
		
		for (Student student : students) {
			
			System.out.println("Student id: "+ student.id);
			System.out.println("Student name: "+ student.name);
			System.out.println("Student note: "+ student.note);
			System.out.println("Student departmant: "+ student.department);
			System.out.println("****************");	
		} 
		
        Lesson lesson1=new Lesson(1, "C#");
        Lesson lesson2=new Lesson(2, "Java");
        
        Lesson[] lessons={lesson1,lesson2};
        for (Lesson lesson : lessons) {
        	
        	System.out.println("Lesson id: "+ lesson.id);
        	System.out.println("Lesson: "+ lesson.name);
			
		}
        
        StudentManager studentManager=new StudentManager();
        
        studentManager.addToStudent(student3);
        studentManager.addToStudent(student2);
        
        
        
	}

}
