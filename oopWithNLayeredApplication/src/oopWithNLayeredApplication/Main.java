package oopWithNLayeredApplication;

import oopWithNLayeredApplication.business.CategoryManager;
import oopWithNLayeredApplication.business.CourseManager;
import oopWithNLayeredApplication.business.InstructorManager;
import oopWithNLayeredApplication.core.logging.DatabaseLogger;
import oopWithNLayeredApplication.core.logging.FileLogger;
import oopWithNLayeredApplication.core.logging.Logger;
import oopWithNLayeredApplication.core.logging.MailLogger;
import oopWithNLayeredApplication.dataAcces.HibernateCategoryDao;
import oopWithNLayeredApplication.dataAcces.HibernateInstructorDao;
import oopWithNLayeredApplication.dataAcces.JdbcCourseDao;
import oopWithNLayeredApplication.entities.Category;
import oopWithNLayeredApplication.entities.Course;
import oopWithNLayeredApplication.entities.Instructor;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Logger[] loggers = {new DatabaseLogger(),new FileLogger(), new MailLogger()};
		
		Category category1=new Category(1, "Programlamaya Giriþ");
		Category category2=new Category(2, "Python Programlama");
		Category category3=new Category(3, "C Programlama");
		Category category4=new Category(4, "Oyun Programlama");
		Category category5=new Category(5, "Mobil Geliþtirme");
		
		Category[] categories = {category1,category2,category3,category4,category5};
		
	
		
		
		CategoryManager categoryManager= new CategoryManager(new HibernateCategoryDao(), loggers);	
		
		for(Category category:categories) {
			categoryManager.add(category);
		}
		
		
		
		Instructor instructor1=new Instructor(1, "Engin", "DemirOð");
		Instructor instructor2=new Instructor(2, "Yaðmur", "Karanfil");
		Instructor[] instructores = {instructor1,instructor2};
		
	
		InstructorManager instructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
		 for(Instructor instructor : instructores) {
			 instructorManager.add(instructor);
		 }
		
		
		Course course1 =  new Course(1, "Java", 500);
		Course course2 =  new Course(2, "Python", -500);
		
		Course[] courses = {course1,course2};
		
		CourseManager courseManager = new CourseManager(new JdbcCourseDao(), loggers);
		
		for(Course course:courses) {
			courseManager.add(course);
		}
		

	}

}
