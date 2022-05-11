package de.cookbook.cookbook.controller;

import de.cookbook.cookbook.repository.RecipeBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RecipeBookController {

    @Autowired
    RecipeBookRepository recipeBookRepository;

    public RecipeBookController(RecipeBookRepository recipeBookRepository) {
        this.recipeBookRepository = recipeBookRepository;
    }
}
