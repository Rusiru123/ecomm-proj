package net.paf.ecomproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import net.paf.ecommbackend.dao.CategoryDAO;
import net.paf.ecommbackend.dto.Category;

@Controller
public class PagesController {
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@RequestMapping(value = {"/","/home","/index"})
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","Home");
		
		mv.addObject("categories",categoryDAO.list());
		return mv;
	}
	
	@RequestMapping(value ="/about")
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("about");
		mv.addObject("title","About us");
		return mv;
	
	
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("contact");
		mv.addObject("title","Contact us");
		return mv;
	
}
	
	/**
	 * Methods to load the all products and based on all category
	 * **/
	@RequestMapping(value ="/show/all/products")
	public ModelAndView show() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title","All The Products");
		 
		//--list all the products----
		mv.addObject("categories",categoryDAO.list());
		mv.addObject("userClickAllProducts",true);
		return mv;
	
	
	}
	
	
	@RequestMapping(value ="/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id")int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//--category DAO to fetch a single category
		Category category = null;
		
		category = categoryDAO.get(id);
		
		mv.addObject("title",category.getName());
		 
		//--list all the products----
		mv.addObject("categories",categoryDAO.list());
		
		//passing the single category object
		mv.addObject("category",category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	
	
	}


}
	
	

