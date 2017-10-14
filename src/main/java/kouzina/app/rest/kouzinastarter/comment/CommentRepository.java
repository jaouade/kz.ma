package kouzina.app.rest.kouzinastarter.comment;

import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
public interface CommentRepository extends CrudRepository<Comment,Long> {
    Set<Comment> findByRecipeId(long id);
    long countCommentByRecipeId(long id);
}
