package de.cookbook.cookbook.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String ingredientName;

    private double quantity;

    @JsonIgnore
    @ManyToMany(mappedBy = "Ingredients")
    private Set<Recipe>recipes = new HashSet<>();

    public Ingredient() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Ingredient(String ingredientName, double quantity) {
        this.ingredientName = ingredientName;
        this.quantity = quantity;
    }
}
