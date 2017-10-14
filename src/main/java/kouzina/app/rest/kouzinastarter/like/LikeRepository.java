package kouzina.app.rest.kouzinastarter.like;

import kouzina.app.rest.kouzinastarter.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
public interface LikeRepository extends CrudRepository<Like,Long> {
    Set<Like> findByRecipeId(long id);
    long countLikesByRecipeId(long id);
    Like findByUserIdAndRecipeId(long userId,long recipeId);

}
