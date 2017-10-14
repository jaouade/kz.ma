package kouzina.app.rest.kouzinastarter.recipe;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.bookmark.Bookmark;
import kouzina.app.rest.kouzinastarter.category.Category;
import kouzina.app.rest.kouzinastarter.comment.Comment;
import kouzina.app.rest.kouzinastarter.cooksnap.CookSnap;
import kouzina.app.rest.kouzinastarter.image.Image;
import kouzina.app.rest.kouzinastarter.like.Like;
import kouzina.app.rest.kouzinastarter.user.User;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

/**
 * Created by kel on 02/10/17.
 */
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int serving;
    private String method;
    private String ingredients;
    private boolean hidden;
    private int cookingTime;
    @OneToOne(fetch = FetchType.EAGER)
    private Image image;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipe")
    private Set<Like> likes;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "recipe")
    private Set<Bookmark> bookmarks;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipe")
    private Set<Comment> comments;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "recipe")
    private Set<CookSnap> cookSnaps;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private Date date;

    public Recipe(int serving, String method) {
        this.serving = serving;
        this.method = method;
    }
    public Recipe() {
    }

    public long getId() {
        return id;
    }

    public Recipe setId(long id) {
        this.id = id;
        return this;
    }

    public int getServing() {
        return serving;
    }

    public Recipe setServing(int serving) {
        this.serving = serving;
        return this;
    }

    public String getMethod() {
        return method;
    }

    public Recipe setMethod(String method) {
        this.method = method;
        return this;
    }

    public String getIngredients() {
        return ingredients;
    }

    public Recipe setIngredients(String ingredients) {
        this.ingredients = ingredients;
        return this;
    }

    public boolean isHidden() {
        return hidden;
    }

    public Recipe setHidden(boolean hidden) {
        this.hidden = hidden;
        return this;
    }

    public int getCookingTime() {
        return cookingTime;
    }

    public Recipe setCookingTime(int cookingTime) {
        this.cookingTime = cookingTime;
        return this;
    }

    public Image getImage() {
        return image;
    }

    public Recipe setImage(Image image) {
        this.image = image;
        return this;
    }
    public Category getCategory() {
        return category;
    }
    public Recipe setCategory(Category category) {
        this.category = category;
        return this;
    }
    public Set<Like> getLikes() {
        return likes;
    }
    public Recipe setLikes(Set<Like> likes) {
        this.likes = likes;
        return this;
    }
    @JsonIgnore
    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }
    @JsonProperty
    public Recipe setBookmarks(Set<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
        return this;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public Recipe setComments(Set<Comment> comments) {
        this.comments = comments;
        return this;
    }

    public User getUser() {
        return user;
    }

    public Recipe setUser(User user) {
        this.user = user;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public Recipe setDate(Date date) {
        this.date = date;
        return this;
    }
}
