package kouzina.app.rest.kouzinastarter.bookmark;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.user.User;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;

import javax.persistence.*;

/**
 * Created by kel on 02/10/17.
 */
@Entity
public class Bookmark {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.EAGER)
    private Recipe recipe;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;

    public Recipe getRecipe() {
        return recipe;
    }

    public Bookmark setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public Bookmark() {
    }
    public int getId() {
        return id;
    }
    public Bookmark setId(int id) {
        this.id = id;
        return this;
    }


    public User getUser() {
        return user;
    }
    public Bookmark setUser(User user) {
        this.user = user;
        return this;
    }
}
