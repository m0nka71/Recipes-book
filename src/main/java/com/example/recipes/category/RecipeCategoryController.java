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

    public RecipeCategoryController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/category/{categoryType}")
    public String showRecipesByCategory(Model model, @PathVariable CategoryType categoryType) {
        List<Recipe> recipes;
        recipes = recipeRepository.findAllByCategoryType(categoryType);
        model.addAttribute("recipes", recipes);
        return "category";
    }
}
