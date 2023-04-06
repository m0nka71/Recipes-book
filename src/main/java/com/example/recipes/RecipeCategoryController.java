package com.example.recipes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RecipeCategoryController {
    private final RecipeRepository recipeRepository;

    public RecipeCategoryController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/breakfast")
    public String showBreakfastList(Model model) {
        List<Recipe> recipesByCategory = recipeRepository.findAllByCategory(RecipeCategory.BREAKFAST);
        model.addAttribute("breakfast", recipesByCategory);
        return "breakfast";
    }
    @GetMapping("/lunch")
    public String showLunchList(Model model) {
        List<Recipe> recipesByCategory = recipeRepository.findAllByCategory(RecipeCategory.LUNCH);
        model.addAttribute("lunch", recipesByCategory);
        return "lunch";
    }
    @GetMapping("/dinner")
    public String showDinnerList(Model model) {
        List<Recipe> recipesByCategory = recipeRepository.findAllByCategory(RecipeCategory.DINNER);
        model.addAttribute("dinner", recipesByCategory);
        return "dinner";
    }
    @GetMapping("/snack")
    public String showSnackList(Model model) {
        List<Recipe> recipesByCategory = recipeRepository.findAllByCategory(RecipeCategory.SNACK);
        model.addAttribute("snack", recipesByCategory);
        return "snack";
    }
    @GetMapping("/dessert")
    public String showDessertList(Model model) {
        List<Recipe> recipesByCategory = recipeRepository.findAllByCategory(RecipeCategory.DESSERT);
        model.addAttribute("dessert", recipesByCategory);
        return "dessert";
    }

}
