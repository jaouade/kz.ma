package kouzina.app.rest.kouzinastarter.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by kel on 03/10/17.
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public Set<User> all(){
        Set<User> users = new HashSet<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }
    public void add(User user){
        userRepository.save(user);
    }
    public void delete(User user){
        userRepository.delete(user);
    }
    public void delete(Long id){
        userRepository.delete(id);
    }
    public void update(User user){
        userRepository.save(user);
    }
    public User getOne(Long id){
        return userRepository.findOne(id);
    }
}
