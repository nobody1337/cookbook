package de.cookbook.cookbook.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "recipe")
@SecondaryTable(name = "ingredient", pkJoinColumns = @PrimaryKeyJoinColumn(name = "recipe_id"))
public class Recipe {
    //Rezept-ID als long
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "recipe_id")
    private long id;
    //Rezept Name als String
    @Column(name = "recipe_name")
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
