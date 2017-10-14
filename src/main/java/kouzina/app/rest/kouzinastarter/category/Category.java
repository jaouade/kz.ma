package kouzina.app.rest.kouzinastarter.category;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by kel on 02/10/17.
 */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    private Set<Recipe> recipes;

    public Category() {
    }

    public long getId() {
        return id;
    }

    public Category setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Category setName(String name) {
        this.name = name;
        return this;
    }
    @JsonIgnore
    public Set<Recipe> getRecipes() {
        return recipes;
    }
    @JsonProperty
    public Category setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
        return this;
    }
}
