package com.example.recipes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class RecipeController {

    private final RecipeRepository recipeRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @GetMapping("/")
    public String home(Model model) {
        List<Recipe> recipes = recipeRepository.findAll();
        model.addAttribute("recipes", recipes);
        return "home";
    }

    @GetMapping("/add")
    public String addForm(Model model) {
        model.addAttribute("recipe", new Recipe());
        return "add";
    }

    @PostMapping("/add")
    public String add(Recipe recipe) {
        recipeRepository.save(recipe);
        return "redirect:/";
    }

    @GetMapping("/recipe/{id}")
    public String showRecipe(@PathVariable Long id, Model model) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            model.addAttribute("recipeShow", recipe);
            return "recipe";
        } else {
            return "redirect:/";
        }
    }
//    Jedna metoda dla edit + add
    @GetMapping("/recipe/{id}/form")
    public String editRecipeForm(@RequestParam String mode, @PathVariable Long id, Model model) {
        Optional<Recipe> recipeOptional = recipeRepository.findById(id);
        if (recipeOptional.isPresent()) {
            Recipe recipe = recipeOptional.get();
            model.addAttribute("recipeForm", recipe);
            model.addAttribute("mode", "edit");
            model.addAttribute("mode", "add");
            return "recipeForm";
        } else {
            return "redirect:/";
        }

//        if (mode.equals("edit")) {
//            return "recipeForm";
//        } else if (mode.equals("add")) {
//            model.addAttribute("recipe", new Recipe());
//            return "";
//        }
    }

    @PostMapping("/recipe/{id}/edit")
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
//
//    @GetMapping("/recipe/${id}/${likes}")
//    public String showLikes(Model model, @PathVariable Long id, @PathVariable int likes) {
//        //TO DO
//
//        likes++;
//        model.addAttribute("likes", likes);
//        return "recipe";
//    }

}
