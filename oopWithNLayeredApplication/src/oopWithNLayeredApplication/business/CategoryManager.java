package oopWithNLayeredApplication.business;
import oopWithNLayeredApplication.entities.Category;

import java.util.ArrayList;
import oopWithNLayeredApplication.core.logging.Logger;

import oopWithNLayeredApplication.dataAcces.CategoryDao;

public class CategoryManager {
	private CategoryDao categoryDao;
	private Logger[] loggers ; 
	private ArrayList<Category> categories = new ArrayList<Category>();
	
	public CategoryManager(CategoryDao categoryDao , Logger[] loggers  ) {
		
		this.categoryDao=categoryDao;
		this.loggers=loggers;
		
	}
	
	public void add(Category category) throws Exception{
		
		for(Category category1 : categories) {
			if(category1.getCategoryName().equals(category1.getCategoryName())) {
				throw new  Exception("Bu isim baþka bir kategoriye aittir, yeni bir isim bulun : "+category.getCategoryName());
			}	
		}
	 categories.add(category);
	 categoryDao.add(category);
	 for(Logger logger :loggers) {
		 logger.log(category.getCategoryName());
		 
	 }
		
	
	
	
		
	}
	
			

	
		
	
		
	

}
