package com.practice.spring5webapp.repository;

import com.practice.spring5webapp.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
