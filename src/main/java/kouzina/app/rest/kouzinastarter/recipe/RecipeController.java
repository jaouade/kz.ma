package kouzina.app.rest.kouzinastarter.recipe;

import kouzina.app.rest.kouzinastarter.like.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class RecipeController {
    @Autowired
    private RecipeService recipeService;
    @RequestMapping(value = "/recipes")
    public List<Recipe> all(){
        return new ArrayList<>(recipeService.all());
    }
    @RequestMapping(value = "/recipes",method = RequestMethod.POST)
    public void add(@RequestBody Recipe recipe){
        recipeService.add(recipe);
    }
    @RequestMapping(value = "/recipes",method = RequestMethod.PUT)
    public void update(@RequestBody Recipe recipe){
        recipeService.update(recipe);
    }
    @RequestMapping(value = "/recipes/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable long id){
        recipeService.delete(id);
    }
    @RequestMapping(value = "/recipes/{id}",method = RequestMethod.GET)
    public Recipe get(@PathVariable Long id){
        return recipeService.getOne(id);
    }
    @RequestMapping(value = "/recipes/category/{id}",method = RequestMethod.GET)
    public Set<Recipe> findByCategoryId(@PathVariable long id){
        return recipeService.findByCategoryId(id);
    }
    @RequestMapping(value = "/recipes/category/{id}/count",method = RequestMethod.GET)
    public long countByCategoryId(@PathVariable long id){
        return recipeService.countByCategoryId(id);
    }
    @RequestMapping(value = "/recipes/count",method = RequestMethod.GET)
    public long count(){
        return recipeService.count();
    }

}
