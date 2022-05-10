package de.cookbook.cookbook.controller;


import de.cookbook.cookbook.repository.RecipeRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecipeController {

    RecipeRepository recipeRepository;

    //GET-Methoden
    @GetMapping("/")
    public String index(){
        return "index";
    }

}
