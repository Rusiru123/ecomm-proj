package net.paf.ecommbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.paf.ecommbackend.dao.CategoryDAO;
import net.paf.ecommbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private static List<Category> categories = new ArrayList<>();
	
	static {
		
		Category category = new Category();
		
		category.setId(1);
		category.setName("LED Television");
		category.setDescription("This is description about LED Television");
		category.setImageurl("CAT_1.jpg");
		
		categories.add(category);
		
		
		//adding second category
		 category = new Category();
			
			category.setId(2);
			category.setName("Smart Phone");
			category.setDescription("This is a description for Smart Phone ");
			category.setImageurl("CAT_2.jpg");
			
			categories.add(category);
			
			//adding the third category
			
			 category = new Category();
				
				category.setId(3);
				category.setName("Laptop");
				category.setDescription("This is a description for the Laptop");
				category.setImageurl("CAT_3.jpg");
				
				categories.add(category);
		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		//enhanced the loop
		for(Category category:categories) {
			if(category.getId() == id) return category;
		} 
		return null;
	}

	@Override
	@Transactional
	public boolean add(Category category) {
		// TODO Auto-generated method stub
		
		try {
			//add the categories to the table
			sessionFactory.getCurrentSession().persist(category);
			
			return true;
			
		}
		catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
		
	
	}

}
