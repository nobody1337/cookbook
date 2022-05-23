package de.cookbook.cookbook.controller;


import de.cookbook.cookbook.model.Ingredient;
import de.cookbook.cookbook.model.Recipe;
import de.cookbook.cookbook.repository.IngredientRepository;
import de.cookbook.cookbook.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


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
    public String createRecipe(Ingredient ingredientName,Ingredient quantity,Recipe recipe){
        return "newRecipe";
    }

    @PostMapping("/saveRecipe")
    public String saveRecipe(Recipe recipe, Ingredient ingredient){
        recipeRepository.save(recipe);
        ingredientRepository.save(ingredient);
        enrollIngredienttoRecipe(recipe,ingredient);
        return "index";
    }

    @GetMapping("/recipeCollection")
    public String recipeCollection(Model model){
        model.addAttribute("recipe",recipeRepository.findAll());
        model.addAttribute("ingredient",ingredientRepository.findAll());
        return "recipeCollection";
    }

    public Recipe enrollIngredienttoRecipe(Recipe recipe,
                                           Ingredient ingredient){
        recipe.enrollIngredient(ingredient);
        return recipeRepository.save(recipe);
    }
    @PutMapping("/{recipeId}/ingredient/{ingredientId}")
    Recipe enrollIngredienttoRecipe(@PathVariable long recipeId,
                                    @PathVariable long ingredientId){
        Recipe recipe = recipeRepository.findById(recipeId).get();
        Ingredient ingredient = ingredientRepository.findById(ingredientId).get();
        recipe.enrollIngredient(ingredient);
        return recipeRepository.save(recipe);

    }



}
