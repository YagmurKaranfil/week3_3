package oopWithNLayeredApplication.dataAcces;

import oopWithNLayeredApplication.entities.Instructor;
import java.util.List;

public interface InstructorDao {

	void add(Instructor instructor );
	void delete (Instructor instructor );
	void update(Instructor instructor );
	
	List<Instructor> getAllInstuctores();
}
