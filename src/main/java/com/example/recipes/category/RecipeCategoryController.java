package com.example.recipes.category;

import com.example.recipes.Recipe;
import com.example.recipes.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RecipeCategoryController {

    private final RecipeRepository recipeRepository;

    private final CategoryRepository categoryRepository;

    public RecipeCategoryController(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping("/category/{name}")
    public String showRecipesByCategory(Model model, @PathVariable String name) {
        List<Category> categories = categoryRepository.findAllByName(name);
        List<Recipe> recipes = recipeRepository.findAllByCategoryName(name);
        model.addAttribute("categories", categories);
        model.addAttribute("recipes", recipes);
        return "category";
    }
}
