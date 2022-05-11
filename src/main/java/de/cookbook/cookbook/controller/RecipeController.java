package de.cookbook.cookbook.controller;


import de.cookbook.cookbook.model.Ingredient;
import de.cookbook.cookbook.model.Recipe;
import de.cookbook.cookbook.repository.IngredientRepository;
import de.cookbook.cookbook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class RecipeController {

    @Autowired
    RecipeRepository recipeRepository;

    @Autowired
    IngredientRepository ingredientRepository;

    public RecipeController(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    //GET-Methoden
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/newRecipe")
    public String addRecipe(Ingredient ingredient,Ingredient quantity,Recipe recipe){
        return "newRecipe";
    }

    @GetMapping("/recipeCollection")
    public String recipeCol(Model model){
        model.addAttribute("recipe",recipeRepository.findAll());
        return "recipeCollection";
    }

    @PostMapping("/saveRecipe")
    public String saveRecipe(Recipe recipe,Ingredient ingredient){
        recipeRepository.save(recipe);
        ingredientRepository.save(ingredient);
        return "index";
    }

}
