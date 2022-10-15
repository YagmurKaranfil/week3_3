package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

	@Override
	public void add(Instructor instructor) {
		System.out.println("Jdbc ile veritabanýna eklendi : " +instructor.getFirstName()+instructor.getLastName());
		
	}

	@Override
	public void delete(Instructor instructor) {
		System.out.println("Jdbc ile veritabanýndan silindi: " +instructor.getFirstName()+instructor.getLastName());
		
	}

	@Override
	public void update(Instructor instructor) {
		System.out.println("Jdbc ile veritabaný güncellendi : " +instructor.getFirstName()+instructor.getLastName());
		
	}

	@Override
	public List<Instructor> getAllInstuctores() {

		return getAllInstuctores();
	}

}
