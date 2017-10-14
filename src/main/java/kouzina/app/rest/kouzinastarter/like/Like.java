package kouzina.app.rest.kouzinastarter.like;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import kouzina.app.rest.kouzinastarter.user.User;

import javax.persistence.*;

/**
 * Created by kel on 02/10/17.
 */
@Entity
@Table(name = "likes")
public class Like {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Recipe recipe;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    public Like() {
    }

    public long getId() {
        return id;
    }

    public Like setId(long id) {
        this.id = id;
        return this;
    }
    @JsonIgnore
    public Recipe getRecipe() {
        return recipe;
    }
    @JsonProperty
    public Like setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public User getUser() {
        return user;
    }
    public Like setUser(User user) {
        this.user = user;
        return this;
    }
}
