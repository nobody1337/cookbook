package de.cookbook.cookbook.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Recipe {
    //Rezept-ID als long
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    //Rezept Name als String
    private String recipeName;
    //Zutaten
    @ManyToMany //Gibt die Beziehung der Tabellen an
    @JoinTable(name = "Recipe_Ingredient",
    joinColumns = @JoinColumn(name = "recipe_id"),
    inverseJoinColumns = @JoinColumn(name = "ingredient_id"))
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

    public Set<Ingredient> getIngredients() {
        return Ingredients;
    }

    public void setIngredients(Set<Ingredient> ingredients) {
        Ingredients = ingredients;
    }


    public void enrollIngredient(Ingredient ingredient) {
        Ingredients.add(ingredient);
    }
}

 

