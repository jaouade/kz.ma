package kouzina.app.rest.kouzinastarter.recipe;

import kouzina.app.rest.kouzinastarter.like.LikeRepository;
import kouzina.app.rest.kouzinastarter.like.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class RecipeService {
    @Autowired
    private RecipeRepository recipeRepository;
    @Autowired
    private LikeService likeService;

    public Set<Recipe> all(){
        Set<Recipe> recipes = new HashSet<>();
        recipeRepository.findAll().forEach(recipes::add);
        Set<Recipe> recipesToReturn = new HashSet<>();
        for(Recipe recipe:recipes){
            recipesToReturn.add(recipe.setLikes(likeService.findByRecipeId(recipe.getId())));
        }
        return recipesToReturn;
    }
    public void add(Recipe recipe){
        recipeRepository.save(recipe);
    }
    public void delete(Long id){
        recipeRepository.delete(id);
    }
    public void delete(Recipe recipe){
        recipeRepository.delete(recipe);
    }
    public void update(Recipe recipe){
        recipeRepository.save(recipe);
    }
    public Recipe getOne(long id){
        return recipeRepository.findOne(id);
    }
    public Set<Recipe> findByCategoryId(long id){
        return recipeRepository.findByCategoryId(id);
    }
    public long countByCategoryId(long id){
        return recipeRepository.countByCategoryId(id);
    }
    public long count(){
        return recipeRepository.count();
    }
}
