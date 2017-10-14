package kouzina.app.rest.kouzinastarter.bookmark;

import kouzina.app.rest.kouzinastarter.category.Category;
import kouzina.app.rest.kouzinastarter.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class BookmarkController {
    @Autowired
    private BookmarkService bookmarkService;
    @RequestMapping(value = "/bookmarks")
    public List<Bookmark> all(){
        return new ArrayList<>(bookmarkService.all());
    }
    @RequestMapping(value = "/bookmarks",method = RequestMethod.POST)
    public void add(@RequestBody Bookmark bookmark){
        bookmarkService.add(bookmark);
    }
    @RequestMapping(value = "/bookmarks",method = RequestMethod.PUT)
    public void update(@RequestBody Bookmark bookmark){
        bookmarkService.update(bookmark);
    }
    @RequestMapping(value = "/bookmarks/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        bookmarkService.delete(id);
    }
    @RequestMapping(value = "/bookmarks/{id}",method = RequestMethod.GET)
    public Bookmark get(@PathVariable Long id){
        return bookmarkService.getOne(id);
    }
}
