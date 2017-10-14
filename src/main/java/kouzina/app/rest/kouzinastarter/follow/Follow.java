package kouzina.app.rest.kouzinastarter.follow;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.user.User;

import javax.persistence.*;

/**
 * Created by kel on 02/10/17.
 */
@Entity
public class Follow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private User follower;
    @ManyToOne(fetch = FetchType.EAGER)
    private User following;

    public Follow() {
    }

    public long getId() {
        return id;
    }

    public Follow setId(long id) {
        this.id = id;
        return this;
    }

    public User getFollower() {
        return follower;
    }

    public Follow setFollower(User follower) {
        this.follower = follower;
        return this;
    }

    public User getFollowing() {
        return following;
    }
    @JsonProperty
    public Follow setFollowing(User following) {
        this.following = following;
        return this;
    }
}
