package kouzina.app.rest.kouzinastarter.recipe;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
public interface RecipeRepository extends CrudRepository<Recipe,Long> {
    Set<Recipe> findByCategoryId(long id);
    long countByCategoryId(long id);
}
