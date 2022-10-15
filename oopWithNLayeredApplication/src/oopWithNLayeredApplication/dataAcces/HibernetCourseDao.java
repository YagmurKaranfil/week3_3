package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Course;

public class HibernetCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritabanýna eklendi : " +course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile veritabanýndan silindi : " +course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile güncellendi :  " +course.getCourseName());
		
	}

	@Override
	public List<Course> getAllCourses() {
		return getAllCourses();
	}

}
