package de.cookbook.cookbook.model;

import javax.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ingredient_id")
    private long id;
    @Column(name = "ingredient_name")
    private String ingredientName;
    @Column(name = "quantity")
    private double quantity;

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
