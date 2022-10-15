package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Course;

public interface CourseDao {
	
	void add(Course course);
	void delete(Course course);
	void update(Course course);
	
	List<Course> getAllCourses();
	

}
