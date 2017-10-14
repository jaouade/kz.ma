package kouzina.app.rest.kouzinastarter.image;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.cooksnap.CookSnap;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import kouzina.app.rest.kouzinastarter.user.User;

import javax.persistence.*;
import java.io.Serializable;
/**
 * Created by kel on 02/10/17.
 */
@Entity
public class Image implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String link;
    @OneToOne(fetch = FetchType.LAZY,mappedBy = "image")
    private Recipe recipe;
    @OneToOne(fetch = FetchType.LAZY)
    private CookSnap cookSnap;
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private User user;

    public Image(String link) {
        this.id = 0;
        this.link = link;
    }
    public Image() {
    }

    public long getId() {
        return id;
    }

    public String getLink() {
        return link;
    }

    public Image setId(long id) {
        this.id = id;
        return this;
    }

    public Image setLink(String link) {
        this.link = link;
        return this;
    }
    @JsonIgnore
    public Recipe getRecipe() {
        return recipe;
    }
    @JsonProperty
    public Image setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public CookSnap getCookSnap() {
        return cookSnap;
    }

    public Image setCookSnap(CookSnap cookSnap) {
        this.cookSnap = cookSnap;
        return this;
    }
    @JsonIgnore
    public User getUser() {
        return user;
    }
    @JsonProperty
    public Image setUser(User user) {
        this.user = user;
        return this;
    }
}
