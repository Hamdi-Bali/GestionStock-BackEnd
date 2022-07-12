package com.back.end.ServiceUser;

import com.back.end.model.Machine;
import com.back.end.model.User;
import com.back.end.userrepository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.crypto.Mac;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;
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
    @Transactional
   public void updateUser(int num ,String name ,String mdp , String type )
    {
        System.out.println("update succés mezelt ");
        User user = userrepository.findUserByNum(num);
        if(name != null && name.length() > 0 /** && !Objects.equals(user.getName(),name)**/){
          user.setName(name);
        }
        if(mdp != null && mdp.length() > 0  /** && !Objects.equals(user.getMdp(),mdp) **/ )
        {
           user.setMdp(mdp);
        }
        if(type != null && type.length() > 0)
        {
            user.setType(type);
        }

        System.out.println(num);
    }



}
