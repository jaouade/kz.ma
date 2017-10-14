package kouzina.app.rest.kouzinastarter.user;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import kouzina.app.rest.kouzinastarter.bookmark.Bookmark;
import kouzina.app.rest.kouzinastarter.comment.Comment;
import kouzina.app.rest.kouzinastarter.cooksnap.CookSnap;
import kouzina.app.rest.kouzinastarter.image.Image;
import kouzina.app.rest.kouzinastarter.like.Like;
import kouzina.app.rest.kouzinastarter.follow.Follow;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by kel on 02/10/17.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String fullName;
    private String email;
    private String password;
    @OneToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private Comment comment;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Recipe> recipes;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Bookmark> bookmarks;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<Like> likes;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "follower")
    private Set<Follow> followers;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "following")
    private Set<Follow> followings;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "user", cascade = CascadeType.ALL)
    private Image avatar;
    @OneToOne(fetch = FetchType.LAZY)
    private CookSnap cookSnap;

    public User() {
    }

    public long getId() {
        return id;
    }

    public User setId(long id) {
        this.id = id;
        return this;
    }

    public String getFullName() {
        return fullName;
    }

    public User setFullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public Comment getComment() {
        return comment;
    }

    public User setComment(Comment comment) {
        this.comment = comment;
        return this;
    }
    @JsonIgnore
    public Set<Recipe> getRecipes() {
        return recipes;
    }
    @JsonProperty
    public User setRecipes(Set<Recipe> recipes) {
        this.recipes = recipes;
        return this;
    }
    @JsonIgnore
    public Set<Bookmark> getBookmarks() {
        return bookmarks;
    }
    @JsonProperty
    public User setBookmarks(Set<Bookmark> bookmarks) {
        this.bookmarks = bookmarks;
        return this;
    }
    @JsonIgnore
    public Set<Like> getLikes() {
        return likes;
    }
    @JsonProperty
    public User setLikes(Set<Like> likes) {
        this.likes = likes;
        return this;
    }
    @JsonIgnore
    public Set<Follow> getFollowers() {
        return followers;
    }
    @JsonProperty
    public User setFollowers(Set<Follow> followers) {
        this.followers = followers;
        return this;
    }
    @JsonIgnore
    public Set<Follow> getFollowings() {
        return followings;
    }
    @JsonProperty
    public User setFollowings(Set<Follow> followings) {
        this.followings = followings;
        return this;
    }

    public Image getAvatar() {
        return avatar;
    }

    public User setAvatar(Image avatar) {
        this.avatar = avatar;
        return this;
    }
    @JsonIgnore
    public CookSnap getCookSnap() {
        return cookSnap;
    }
    @JsonProperty
    public User setCookSnap(CookSnap cookSnap) {
        this.cookSnap = cookSnap;
        return this;
    }
}
