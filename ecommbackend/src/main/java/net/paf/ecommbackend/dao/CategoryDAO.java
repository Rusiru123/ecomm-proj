package net.paf.ecommbackend.dao;

import java.util.List;

import net.paf.ecommbackend.dto.Category;

public interface CategoryDAO {

		boolean add(Category category);
	
		List<Category> list();
		Category get(int id);
}
