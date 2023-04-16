package com.example.recipes.category;

import com.example.recipes.Recipe;
import com.example.recipes.RecipeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Controller
public class RecipeCategoryController {

    private final RecipeRepository recipeRepository;

    private final CategoryRepository categoryRepository;

    public RecipeCategoryController(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }

    @ModelAttribute
    void setCategories(Model model) {
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);
    }

    @GetMapping("/category/{name}")
    public String showRecipesByCategory(Model model, @PathVariable String name) {
        Category category = categoryRepository.findByName(name).orElseThrow(()
                -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Brak wybranej kategorii"));
        List<Recipe> recipes = recipeRepository.findAllByCategoryName(name);
        model.addAttribute("recipes", recipes);
        model.addAttribute("category", category);
        return "category";
    }
}
