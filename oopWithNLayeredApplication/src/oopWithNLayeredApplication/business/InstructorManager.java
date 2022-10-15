package oopWithNLayeredApplication.business;

import oopWithNLayeredApplication.core.logging.Logger;
import oopWithNLayeredApplication.dataAcces.InstructorDao;
import oopWithNLayeredApplication.entities.Instructor;

public class InstructorManager {
	private InstructorDao instructorDao;
	private Logger[] loggers;
	
	public InstructorManager(InstructorDao instructorDao, Logger[] loggers ) {
		
		this.instructorDao=instructorDao;
		this.loggers=loggers;
		
	}


	public void add(Instructor instructor) {
		instructorDao.add(instructor);
		
		for(Logger logger:loggers) {
			logger.log(instructor.getFirstName()+instructor.getLastName());
		}
		

}
}
