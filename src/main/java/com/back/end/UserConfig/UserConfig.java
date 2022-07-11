package com.back.end.UserConfig;


import com.back.end.MachineRepository.MachineRepository;
import com.back.end.model.Machine;
import com.back.end.model.User;
import com.back.end.userrepository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UserConfig {
    /**
   @Bean
      CommandLineRunner commandLineRunner(MachineRepository repository){
         return args -> {
            //User hamdi = new User("Hamdi","12345","admin");
            //  User kais = new User("zied","0214dD","user");
             Machine m = new Machine("dd","dd","dd","dd","ddd") ;
                repository.save(m) ;
           // repository.saveAll(List.of(hamdi,kais));

       };
   } **/


}
