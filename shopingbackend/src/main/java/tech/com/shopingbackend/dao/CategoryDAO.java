package tech.com.shopingbackend.dao;

import java.util.List;

import tech.com.shopingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);

}
