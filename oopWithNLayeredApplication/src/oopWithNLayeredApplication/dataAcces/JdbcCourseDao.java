package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Course;

public class JdbcCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Jdbc ile veritabanına eklendi : " +course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Jdbc ile veritabanından silindi : " +course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Jdbc ile veritabanı güncellendi : " +course.getCourseName());
		
	}

	@Override
	public List<Course> getAllCourses() {
		
		return getAllCourses();
	}

}
