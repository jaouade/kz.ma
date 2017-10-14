package kouzina.app.rest.kouzinastarter.follow;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class FollowService {
    @Autowired
    private FollowRepository followRepository;

    public Set<Follow> all(){
        Set<Follow> images = new HashSet<>();
        followRepository.findAll().forEach(images::add);
        return images;
    }
    public void add(Follow follow){
        followRepository.save(follow);
    }
    public void delete(Follow follow){
        followRepository.delete(follow);
    }
    public void delete(Long id){
        followRepository.delete(id);
    }
    public void update(Follow follow){
        followRepository.save(follow);
    }
    public Follow getOne(Long id){
        return followRepository.findOne(id);
    }
    public Set<Follow> findByFollowingId(long id){
        return followRepository.findByFollowingId(id);
    }
    public Set<Follow> findByFollowerId(long id){
        return followRepository.findByFollowerId(id);
    }
}
