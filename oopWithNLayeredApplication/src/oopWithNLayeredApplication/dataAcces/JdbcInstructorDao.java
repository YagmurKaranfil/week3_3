package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanına eklendi : " +instructor.getFirstName()+instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Jdbc ile veritabanından silindi: " +instructor.getFirstName()+instructor.getLastName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Jdbc ile veritabanı güncellendi : " +instructor.getFirstName()+instructor.getLastName());
		
	}

	@Override
	public List<Instructor> getAllInstuctores() {

		return getAllInstuctores();
	}

}
