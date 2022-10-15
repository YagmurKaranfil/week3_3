package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Course;

public class HibernetCourseDao implements CourseDao{

	@Override
	public void add(Course course) {
		System.out.println("Hibernate ile veritaban�na eklendi : " +course.getCourseName());
		
	}

	@Override
	public void delete(Course course) {
		System.out.println("Hibernate ile veritaban�ndan silindi : " +course.getCourseName());
		
	}

	@Override
	public void update(Course course) {
		System.out.println("Hibernate ile g�ncellendi :  " +course.getCourseName());
		
	}

	@Override
	public List<Course> getAllCourses() {
		return getAllCourses();
	}

}
