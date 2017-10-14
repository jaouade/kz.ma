package kouzina.app.rest.kouzinastarter.category;

import kouzina.app.rest.kouzinastarter.image.Image;
import kouzina.app.rest.kouzinastarter.like.Like;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/categories")
    public List<Category> all(){
        return new ArrayList<>(categoryService.all());
    }
    @RequestMapping(value = "/categories",method = RequestMethod.POST)
    public void add(@RequestBody Category category){
        categoryService.add(category);
    }
    @RequestMapping(value = "/categories",method = RequestMethod.PUT)
    public void update(@RequestBody Category category){
        categoryService.update(category);
    }
    @RequestMapping(value = "/categories/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        categoryService.delete(id);
    }
    @RequestMapping(value = "/categories/{id}",method = RequestMethod.GET)
    public Category get(@PathVariable Long id){
        return categoryService.getOne(id);
    }
}
