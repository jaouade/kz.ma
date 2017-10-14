package kouzina.app.rest.kouzinastarter.like;

import kouzina.app.rest.kouzinastarter.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;

    public Set<Like> all(){
        Set<Like> likes = new HashSet<>();
        likeRepository.findAll().forEach(likes::add);
        return likes;
    }
    public void add(Like like){
        likeRepository.save(like);
    }
    public void delete(Like like){
        likeRepository.delete(like);
    }
    public void delete(Long id){
        likeRepository.delete(id);
    }
    public void update(Like like){
        likeRepository.save(like);
    }
    public Like getOne(Long id){
        return likeRepository.findOne(id);
    }
    public Like findByUserIdAndRecipeId(Long userId,long recipeId){
        return likeRepository.findByUserIdAndRecipeId(userId,recipeId);
    }
    public long countByRecipeId(Long id){
        return likeRepository.countLikesByRecipeId(id);
    }
    public Set<Like>  findByRecipeId(Long id){
        return likeRepository.findByRecipeId(id);
    }

}
