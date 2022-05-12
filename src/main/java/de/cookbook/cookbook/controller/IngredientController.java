package de.cookbook.cookbook.controller;

import de.cookbook.cookbook.model.Recipe;
import de.cookbook.cookbook.repository.IngredientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IngredientController {

    @Autowired
    IngredientRepository ingredientRepository;

    public IngredientController(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

//    @GetMapping("/newRecipe")
//    public String saveIngredients(){
//
//    }


}
