package kouzina.app.rest.kouzinastarter.cooksnap;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
public interface CookSnapRepository extends CrudRepository<CookSnap,Long> {
    Set<CookSnap>  findByRecipeId(long id);
    long countByRecipeId(long id);
}
