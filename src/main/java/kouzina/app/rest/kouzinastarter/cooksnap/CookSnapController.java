package kouzina.app.rest.kouzinastarter.cooksnap;

import kouzina.app.rest.kouzinastarter.comment.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class CookSnapController {
    @Autowired
    private CookSnapService cookSnapService;
    @RequestMapping(value = "/cooksnaps")
    public List<CookSnap> all(){
        return new ArrayList<>(cookSnapService.all());
    }
    @RequestMapping(value = "/cooksnaps",method = RequestMethod.POST)
    public void add(@RequestBody CookSnap cookSnap){
        cookSnapService.add(cookSnap);
    }
    @RequestMapping(value = "/cooksnaps",method = RequestMethod.PUT)
    public void update(@RequestBody CookSnap cookSnap){
        cookSnapService.update(cookSnap);
    }
    @RequestMapping(value = "/cooksnaps/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        cookSnapService.delete(id);
    }
    @RequestMapping(value = "/cooksnaps/{id}",method = RequestMethod.GET)
    public CookSnap get(@PathVariable Long id){
        return cookSnapService.getOne(id);
    }
    @RequestMapping(value = "/cooksnaps/recipe/{id}",method = RequestMethod.GET)
    public Set<CookSnap> getCommentsByRecipe(@PathVariable Long id){
        return cookSnapService.findByRecipeId(id);
    }
    @RequestMapping(value = "/cooksnaps/recipe/{id}/count",method = RequestMethod.GET)
    public long countByRecipeId(@PathVariable Long id){
        return cookSnapService.countByRecipeId(id);
    }
}
