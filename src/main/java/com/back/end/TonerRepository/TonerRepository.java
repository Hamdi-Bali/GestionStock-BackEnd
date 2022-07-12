package com.back.end.TonerRepository;
import com.back.end.model.Toner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface TonerRepository extends JpaRepository<Toner,Integer> {

Toner getById(int num_toner) ;
}
