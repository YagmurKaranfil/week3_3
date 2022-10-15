package oopWithNLayeredApplication.dataAcces;
import oopWithNLayeredApplication.entities.Category;
import java.util.List;


public class HibernateCategoryDao implements CategoryDao{

	@Override
	
	public void add(Category category) {
		System.out.println("Hibernate ile veritaban�na eklendi : " +category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Hibernate ile veritaban�ndan silindi : " +category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Hibernate ile veritaban� g�ncellendi : " +category.getCategoryName());
		
	}

	@Override
	public List<Category> getAllCategories() {
		
		return getAllCategories();
	}


}
