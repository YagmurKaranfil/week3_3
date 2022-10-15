package oopWithNLayeredApplication.business;

import java.util.ArrayList;

import oopWithNLayeredApplication.core.logging.Logger;
import oopWithNLayeredApplication.dataAcces.CourseDao;
import oopWithNLayeredApplication.entities.Course;

public class CourseManager {
	private CourseDao courseDao;
	private Logger[] loggers;
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	public CourseManager(CourseDao courseDao,Logger[] loggers) {
		
		this.courseDao=courseDao;
		this.loggers=loggers;
	}
	
	public void add(Course course) throws Exception{
		for(Course course1:courses) {
			if(course1.getCoursePrice()<0) {
				throw new Exception("Yanlýþ deðer girdiniz, kurs ücreti 0'dan küçük olamaz : "+course.getCoursePrice());
			}
			if(course1.getCourseName().equals(course1.getCourseName())) {
				throw new Exception("Bu isim baþka bir kursa aittir, yeni bir isim bulun : "+course.getCourseName());
			}
		}
		
		courses.add(course);
		courseDao.add(course);
		for(Logger logger:loggers) {
			logger.log(course.getCourseName());
		}
	}

}
