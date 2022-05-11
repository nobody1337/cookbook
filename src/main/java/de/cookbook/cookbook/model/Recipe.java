package de.cookbook.cookbook.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECIPE_ID")
    private long id;

    private String recipeName;

    @ManyToMany //Gibt die Beziehung der Tabellen an
    @JoinTable(name = "Recipe_Ingredient",
    joinColumns = @JoinColumn(name = "RECIPE_ID"),
    inverseJoinColumns = @JoinColumn(name = "INGREDIENT_ID"))
    public Set<Ingredient>Ingredients= new HashSet<>();

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public Set<Ingredient> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        Ingredients = ingredients;
    }

    //    public Recipe() {
//    }
//    public Recipe(String recipeName, String ingredients, double quantity) {
//        this.RecipeName = recipeName;
//        this.Ingredients = ingredients;
//        this.quantity = quantity;
//    }
}
