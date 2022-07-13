package com.back.end.ImprimanteRepository;

import com.back.end.model.Imprimante;
import com.back.end.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ImprimanteRepository extends JpaRepository<Imprimante,Integer> {
    Optional<Imprimante> findByNum(int num);
    Imprimante findImprimanteByNum(int num) ;
}
