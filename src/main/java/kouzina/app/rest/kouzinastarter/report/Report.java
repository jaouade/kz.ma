package kouzina.app.rest.kouzinastarter.report;

import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import kouzina.app.rest.kouzinastarter.user.User;

/**
 * Created by kel on 02/10/17.
 */
public class Report {
    private long id;
    private Recipe reportedRecipe;
    private User reporter;
    private User reported;

    public Report() {
    }

    public long getId() {
        return id;
    }

    public Report setId(long id) {
        this.id = id;
        return this;
    }

    public Recipe getReportedCategory() {
        return reportedRecipe;
    }

    public Report setReportedCategory(Recipe recipe) {
        this.reportedRecipe = recipe;
        return this;
    }

    public User getReporter() {
        return reporter;
    }

    public Report setReporter(User reporter) {
        this.reporter = reporter;
        return this;
    }

    public User getReported() {
        return reported;
    }

    public Report setReported(User reported) {
        this.reported = reported;
        return this;
    }
}
