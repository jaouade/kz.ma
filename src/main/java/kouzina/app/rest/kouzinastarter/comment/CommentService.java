package kouzina.app.rest.kouzinastarter.comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;

    public Set<Comment> all(){
        Set<Comment> categories = new HashSet<>();
        commentRepository.findAll().forEach(categories::add);
        return categories;
    }
    public void add(Comment comment){
        commentRepository.save(comment);
    }
    public void delete(Long id){
        commentRepository.delete(id);
    }
    public void delete(Comment comment){
        commentRepository.delete(comment);
    }
    public void update(Comment comment){
        commentRepository.save(comment);
    }
    public Comment getOne(Long id){
        return commentRepository.findOne(id);
    }
    public long countByRecipeId(Long id){
        return commentRepository.countCommentByRecipeId(id);
    }
    public Set<Comment> findByRecipeId(long id){
        return commentRepository.findByRecipeId(id);
    }

}
