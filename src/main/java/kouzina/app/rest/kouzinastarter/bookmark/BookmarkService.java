package kouzina.app.rest.kouzinastarter.bookmark;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class BookmarkService  {
    @Autowired
    private BookmarkRepository bookmarkRepository;

    public Set<Bookmark> all(){
        Set<Bookmark> categories = new HashSet<>();
        bookmarkRepository.findAll().forEach(categories::add);
        return categories;
    }
    public void add(Bookmark bookmark){
        bookmarkRepository.save(bookmark);
    }
    public void delete(Long id){
        bookmarkRepository.delete(id);
    }
    public void delete(Bookmark bookmark){
        bookmarkRepository.delete(bookmark);
    }
    public void update(Bookmark bookmark){
        bookmarkRepository.save(bookmark);
    }
    public Bookmark getOne(Long id){
        return bookmarkRepository.findOne(id);
    }


}
