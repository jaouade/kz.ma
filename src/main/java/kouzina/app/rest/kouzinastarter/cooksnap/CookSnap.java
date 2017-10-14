package kouzina.app.rest.kouzinastarter.cooksnap;

import kouzina.app.rest.kouzinastarter.image.Image;
import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import kouzina.app.rest.kouzinastarter.user.User;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by kel on 03/10/17.
 */
@Entity
public class CookSnap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String howDoYouLikeIt;
    @ManyToOne(fetch = FetchType.LAZY)
    private Recipe recipe;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "cookSnap")
    private User cookSnapper;
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "cookSnap", cascade = CascadeType.ALL)
    private Image image;
    private Date date;

    public CookSnap() {
    }

    public long getId() {
        return id;
    }

    public CookSnap setId(long id) {
        this.id = id;
        return this;
    }

    public String getHowDoYouLikeIt() {
        return howDoYouLikeIt;
    }

    public CookSnap setHowDoYouLikeIt(String howDoYouLikeIt) {
        this.howDoYouLikeIt = howDoYouLikeIt;
        return this;
    }

    public Image getImage() {
        return image;
    }

    public CookSnap setImage(Image image) {
        this.image = image;
        return this;
    }

    public Date getDate() {
        return date;
    }

    public CookSnap setDate(Date date) {
        this.date = date;
        return this;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public CookSnap setRecipe(Recipe recipe) {
        this.recipe = recipe;
        return this;
    }

    public User getCookSnaper() {
        return cookSnapper;
    }

    public CookSnap setCookSnaper(User cookSnapper) {
        this.cookSnapper = cookSnapper;
        return this;
    }
}
