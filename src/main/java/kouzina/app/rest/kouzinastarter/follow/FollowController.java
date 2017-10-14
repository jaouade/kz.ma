package kouzina.app.rest.kouzinastarter.follow;

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
public class FollowController {
    @Autowired
    private FollowService followService;
    @RequestMapping(value = "/follows")
    public List<Follow> all(){
        return new ArrayList<>(followService.all());
    }
    @RequestMapping(value = "/follows",method = RequestMethod.POST)
    public void add(@RequestBody Follow follow){
        followService.add(follow);
    }
    @RequestMapping(value = "/follows",method = RequestMethod.PUT)
    public void update(@RequestBody Follow follow){
        followService.update(follow);
    }
    @RequestMapping(value = "/follows/{id}",method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        followService.delete(id);
    }
    @RequestMapping(value = "/follows/{id}",method = RequestMethod.GET)
    public Follow get(@PathVariable Long id){
        return followService.getOne(id);
    }
    @RequestMapping(value = "/follows/UsersFollowedBy/{idUser}",method = RequestMethod.GET)
    public Set<Follow> followers(@PathVariable long idUser){
        return followService.findByFollowerId(idUser);
    }
    @RequestMapping(value = "/follows/followersOfUser/{idUser}",method = RequestMethod.GET)
    public Set<Follow> followings(@PathVariable long idUser){
        return followService.findByFollowingId(idUser);
    }
}
