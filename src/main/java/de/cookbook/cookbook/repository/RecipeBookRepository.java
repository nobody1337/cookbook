package de.cookbook.cookbook.repository;

import de.cookbook.cookbook.model.RecipeBook;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeBookRepository extends CrudRepository<RecipeBook, Long> {
}
