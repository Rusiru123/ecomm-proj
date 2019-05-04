package net.paf.ecommbackend.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import net.paf.ecommbackend.dao.CategoryDAO;
import net.paf.ecommbackend.dto.Category;

public class CategoryTestCase {
	
	private static AnnotationConfigApplicationContext context;
	
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		
		context = new AnnotationConfigApplicationContext();
		context.scan("net.paf.ecommbackend");
		context.refresh();
		
		categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
	}
	
	@Test
	public void testAddCategory() {
		
		category = new Category();
		
		category.setName("LED Television");
		category.setDescription("This is description about LED Television");
		category.setImageurl("CAT_1.jpg");
		
		assertEquals("Successfully added a category inside the table",true,categoryDAO.add(category));
	}
}
