package kouzina.app.rest.kouzinastarter.comment;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import kouzina.app.rest.kouzinastarter.user.User;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by kel on 02/10/17.
 */
@Entity
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "comment")
    private User commenter;
    private String comment;
    private Date date =new Date();

    public Comment() {
    }

    public long getId() {
        return id;
    }

    public Comment setId(long id) {
        this.id = id;
        return this;
    }
    @JsonIgnore
    public Recipe getRecipe() {
        return recipe;
    }
    @JsonProperty
    public Comment setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public User getCommenter() {
        return commenter;
    }

    public Comment setCommenter(User commenter) {
        this.commenter = commenter;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public Comment setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Comment setDate(Date date) {
        this.date = date;
        return this;
    }
}
