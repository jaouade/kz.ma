package kouzina.app.rest.kouzinastarter.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public Set<Category> all(){
        Set<Category> categories = new HashSet<>();
        categoryRepository.findAll().forEach(categories::add);
        return categories;
    }
    public void add(Category category){
        categoryRepository.save(category);
    }
    public void delete(Long id){
        categoryRepository.delete(id);
    }
    public void delete(Category category){
        categoryRepository.delete(category);
    }
    public void update(Category category){
        categoryRepository.save(category);
    }
    public Category getOne(Long id){
        return categoryRepository.findOne(id);
    }


}
