package com.example.recipes;

import com.example.recipes.category.CategoryType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findAllByCategoryType(CategoryType categoryType);
}
