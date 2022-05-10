package de.cookbook.cookbook.repository;


import de.cookbook.cookbook.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long>{
}
