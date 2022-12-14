package oopWithNLayeredApplication.dataAcces;

import java.util.List;

import oopWithNLayeredApplication.entities.Category;

public class JdbcCategoryDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Jdbc ile veritabanına eklendi : " +category.getCategoryName());
		
	}

	@Override
	public void delete(Category category) {
		System.out.println("Jdbc ile veritabanından silindi: " +category.getCategoryName());
		
	}

	@Override
	public void update(Category category) {
		System.out.println("Jdbc ile güncellendi : " +category.getCategoryName());
		
	}

	@Override
	public List<Category> getAllCategories() {
		
		return getAllCategories();
	}

}
