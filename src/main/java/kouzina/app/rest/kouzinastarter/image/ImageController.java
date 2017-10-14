package kouzina.app.rest.kouzinastarter.image;

import kouzina.app.rest.kouzinastarter.like.Like;
import org.apache.commons.lang.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kel on 02/10/17.
 */
@RestController
public class ImageController {
    @Autowired
    private ImageService imageService;
    @RequestMapping(value = "/images")
    public List<Image> all(){
       return new ArrayList<>(imageService.all());
    }
    @RequestMapping(value = "/images",method = RequestMethod.POST)
    public void add(@RequestBody Image image){
        imageService.add(image);
    }
    @RequestMapping(value = "/images",method = RequestMethod.PUT)
    public void update(@RequestBody Image image){
        imageService.update(image);
    }
    @RequestMapping(value = "/images/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        imageService.delete(id);
    }
    @RequestMapping(value = "/images/{id}",method = RequestMethod.GET)
    public Image get(@PathVariable Long id){
        return imageService.getOne(id);
    }

    @RequestMapping(value = "/images/link/{link}",method = RequestMethod.GET)
    public Image findByLink(@PathVariable String link){
        return imageService.findByLink(link);
    }
    @RequestMapping(value = "/images/user/{id}",method = RequestMethod.GET)
    public Image findByLink(@PathVariable long id){
        return imageService.findByUserId(id);
    }
    @RequestMapping(value = "/images/recipe/{id}",method = RequestMethod.GET)
    public Image findByRecipeId(@PathVariable long id){
        return imageService.findByRecipeId(id);
    }
}
