package de.cookbook.cookbook.repository;

import de.cookbook.cookbook.model.Ingredient;
import de.cookbook.cookbook.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends CrudRepository<Ingredient, Long>{

}
