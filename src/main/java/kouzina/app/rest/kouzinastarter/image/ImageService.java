package kouzina.app.rest.kouzinastarter.image;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 02/10/17.
 */
@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public Set<Image> all(){
        Set<Image> images = new HashSet<>();
        imageRepository.findAll().forEach(images::add);
        return images;
    }
    public void add(Image image){
        imageRepository.save(image);
    }
    public void delete(Image image){
        imageRepository.delete(image);
    }
    public void delete(Long id){
        imageRepository.delete(id);
    }
    public void update(Image image){
        imageRepository.save(image);
    }
    public Image getOne(Long id){
        return imageRepository.findOne(id);
    }
    public Image findByLink(String link){
        return imageRepository.findByLink(link);
    }
    public Image findByUserId(long id){
        return imageRepository.findByUserId(id);
    }
    public Image findByRecipeId(long id){
        return imageRepository.findByRecipeId(id);
    }

}
