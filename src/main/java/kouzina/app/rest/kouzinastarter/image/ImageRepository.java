package kouzina.app.rest.kouzinastarter.image;

import kouzina.app.rest.kouzinastarter.user.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by kel on 03/10/17.
 */
public interface ImageRepository extends CrudRepository<Image,Long> {
    Image findByLink(String link);
    Image findByUserId(long id);
    Image findByRecipeId(long id);
}
