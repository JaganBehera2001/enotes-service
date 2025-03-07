package com.evenza.Enotes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.evenza.Enotes.entity.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer>  {

}
