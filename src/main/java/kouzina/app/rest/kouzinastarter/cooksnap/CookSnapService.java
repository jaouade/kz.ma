package kouzina.app.rest.kouzinastarter.cooksnap;

import kouzina.app.rest.kouzinastarter.image.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class CookSnapService {
    @Autowired
    private CookSnapRepository cookSnapRepository;

    public Set<CookSnap> all(){
        Set<CookSnap> images = new HashSet<>();
        cookSnapRepository.findAll().forEach(images::add);
        return images;
    }
    public void add(CookSnap cookSnap){
        cookSnapRepository.save(cookSnap);
    }
    public void delete(CookSnap cookSnap){
        cookSnapRepository.delete(cookSnap);
    }
    public void delete(Long id){
        cookSnapRepository.delete(id);
    }
    public void update(CookSnap cookSnap){
        cookSnapRepository.save(cookSnap);
    }
    public CookSnap getOne(Long id){
        return cookSnapRepository.findOne(id);
    }
    public Set<CookSnap> findByRecipeId(long id){
        return cookSnapRepository.findByRecipeId(id);
    }
    public long countByRecipeId(Long id){
        return cookSnapRepository.countByRecipeId(id);
    }
}
