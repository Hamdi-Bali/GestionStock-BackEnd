package com.back.end.ServiceUser;

import com.back.end.model.User;
import com.back.end.userrepository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;


@Service
public class ServiceUser {
    private final UserRepository userrepository ;

    public ServiceUser(UserRepository userrepository) {
        this.userrepository = userrepository;
    }

    @GetMapping
    public List<User> getUser()
    {
        return userrepository.findAll() ;
    }

    public void addNewUser(User user)
    {
        Optional<User> userbytype = userrepository.findUserByName(user.getName());
        if(userbytype.isPresent()){
           throw new IllegalStateException("User is present ! ");
        }
        else
       {
            userrepository.save(user);
        }
    System.out.println(user);
    }
    public void delete(int num) {
        boolean exist = userrepository.existsById(num);
        if (exist) {
            userrepository.deleteById(num);
        } else
            throw new IllegalStateException("User is already does not exist ! ");
    }




}
