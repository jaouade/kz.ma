package kouzina.app.rest.kouzinastarter.comment;

import kouzina.app.rest.kouzinastarter.like.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class CommentController {
    @Autowired
    private CommentService commentService;
    @RequestMapping(value = "/comments")
    public List<Comment> all(){
        return new ArrayList<>(commentService.all());
    }
    @RequestMapping(value = "/comments",method = RequestMethod.POST)
    public void add(@RequestBody Comment comment){
        commentService.add(comment);
    }
    @RequestMapping(value = "/comments",method = RequestMethod.PUT)
    public void update(@RequestBody Comment comment){
        commentService.update(comment);
    }
    @RequestMapping(value = "/comments/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        commentService.delete(id);
    }
    @RequestMapping(value = "/comments/{id}",method = RequestMethod.GET)
    public Comment get(@PathVariable Long id){
        return commentService.getOne(id);
    }
    @RequestMapping(value = "/comments/recipe/{id}",method = RequestMethod.GET)
    public Set<Comment> getCommentsByRecipe(@PathVariable Long id){
        return commentService.findByRecipeId(id);
    }
    @RequestMapping(value = "/comments/recipe/{id}/count",method = RequestMethod.GET)
    public long countByRecipeId(@PathVariable Long id){
        return commentService.countByRecipeId(id);
    }
}
