package com.example.recipes;

import com.example.recipes.category.Category;
import com.example.recipes.category.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;

    private final CategoryRepository categoryRepository;

    public RecipeController(RecipeRepository recipeRepository, CategoryRepository categoryRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
    }

    @ModelAttribute
    void setCategories(Model model) {
        List<Category> categories = categoryRepository.findAll();
        model.addAttribute("categories", categories);
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("recipes", recipeRepository.findAll());
        return "home";
    }

    @GetMapping("/recipe/{id}")
    public String showRecipe(@PathVariable Long id, Model model) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            model.addAttribute("recipe", recipe);
            return "recipe";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/recipe/add")
    public String addRecipeForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "recipeForm";
    }

    @GetMapping("/recipe/edit/{id}")
    public String editRecipeForm(@PathVariable Long id, Model model) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            model.addAttribute("recipe", recipe);
            return "recipeForm";
        } else {
            return "redirect:/";
        }
    }

    @PostMapping("/recipe/save")
    public String editRecipe(Recipe recipe) {
        recipeRepository.save(recipe);
        return "redirect:/recipe/" + recipe.getId();
    }

    @GetMapping("/delete-recipe/{id}")
    public String deleteRecipe(@PathVariable Long id) {
        Recipe recipe = recipeRepository.findById(id).orElseThrow();
        recipeRepository.delete(recipe);
        return "redirect:/";
    }

    @GetMapping("/recipe/{id}/likes")
    public String showLikes(Model model, @PathVariable Long id, @PathVariable int likes) {
        Recipe recipe = recipeRepository.findById(id).orElseThrow();
        recipe.setLikes(recipe.getLikes() + 1);
        Recipe save = recipeRepository.save(recipe);
        likes = save.getLikes();
        model.addAttribute("likes", likes);
        return "redirect:/recipe";
    }
}
