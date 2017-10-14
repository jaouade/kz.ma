package kouzina.app.rest.kouzinastarter.like;

import kouzina.app.rest.kouzinastarter.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class LikeController {
    @Autowired
    private LikeService likeService;
    @RequestMapping(value = "/likes")
    public Set<Like> all(){
        for (Like like:likeService.all()){
            System.out.println(like.getUser().getFullName());
        }
        return new HashSet<>(likeService.all());
    }
    @RequestMapping(value = "/likes",method = RequestMethod.POST)
    public void add(@RequestBody Like like){
        if(Objects.isNull(
                likeService.findByUserIdAndRecipeId(like.getUser().getId(),like.getRecipe().getId())
        )){likeService.add(like);}
    }
    @RequestMapping(value = "/likes",method = RequestMethod.PUT)
    public void update(@RequestBody Like like){
        likeService.update(like);
    }
    @RequestMapping(value = "/likes/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        likeService.delete(id);
    }
    @RequestMapping(value = "/likes/{id}",method = RequestMethod.GET)
    public Like get(@PathVariable Long id){
        return likeService.getOne(id);
    }
    @RequestMapping(value = "/likes/recipe/{id}",method = RequestMethod.GET)
    public Set<Like> findByRecipe(@PathVariable Long id){
        return likeService.findByRecipeId(id);
    }
    @RequestMapping(value = "/likes/recipe/{id}/count",method = RequestMethod.GET)
    public long count(@PathVariable Long id){
        return likeService.countByRecipeId(id);
    }

}

