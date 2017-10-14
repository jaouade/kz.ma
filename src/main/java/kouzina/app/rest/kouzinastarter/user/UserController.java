package kouzina.app.rest.kouzinastarter.user;

import kouzina.app.rest.kouzinastarter.recipe.Recipe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kel on 03/10/17.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "/users")
    public List<User> all(){
        return new ArrayList<>(userService.all());
    }
    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public void add(@RequestBody User user){
        userService.add(user);
    }
    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    public void update(@RequestBody User user){
        userService.update(user);
    }
    @RequestMapping(value = "/users/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }
    @RequestMapping(value = "/users/{id}",method = RequestMethod.GET)
    public User get(@PathVariable Long id){
        return userService.getOne(id);
    }
}
