package com.practice.spring5webapp.repository;

import com.practice.spring5webapp.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
