package oopWithNLayeredApplication.dataAcces;

import java.util.List;
import oopWithNLayeredApplication.entities.Category;

public interface CategoryDao {

	void add(Category category);
	void delete(Category category);
	void update(Category category);
	List<Category> getAllCategories();
	

}
