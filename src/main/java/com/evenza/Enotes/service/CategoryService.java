package com.evenza.Enotes.service;

import java.util.List;

import com.evenza.Enotes.entity.Category;

public interface CategoryService {
	
	public Boolean saveCategory(Category category);
	
	public List<Category> getAllCategory();

}
