package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritaban�na eklendi : " +category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile veritaban�ndan silindi: " +category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Jdbc ile g�ncellendi : " +category.getCategoryName());
		
	}

	@Override
	public List<Category> getAllCategories() {
		
		return getAllCategories();
	}

}
