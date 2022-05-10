package de.cookbook.cookbook.controller;


import de.cookbook.cookbook.model.Recipe;
import de.cookbook.cookbook.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RecipeController {

    RecipeRepository recipeRepository;

    //GET-Methoden
    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/newRecipe")
    public String addRecipe(Recipe recipe){
        return "newRecipe";
    }

    @PostMapping("/saveRecipe")
    public String saveRecipe(Recipe recipe){
        recipeRepository.save(recipe);
        return "index";
    }

}
