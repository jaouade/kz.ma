package kouzina.app.rest.kouzinastarter.follow;

import kouzina.app.rest.kouzinastarter.user.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
public interface FollowRepository extends CrudRepository<Follow,Long> {
    Set<Follow> findByFollowingId(long id);
    Set<Follow> findByFollowerId(long id);
}
