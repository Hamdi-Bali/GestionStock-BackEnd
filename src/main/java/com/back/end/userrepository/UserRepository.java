package com.back.end.userrepository;

import com.back.end.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

Optional<User> findUserByType(String type);
Optional<User> findUserByName(String name) ;



}
