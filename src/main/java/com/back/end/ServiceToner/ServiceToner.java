package com.back.end.ServiceToner;

import com.back.end.TonerRepository.TonerRepository;

import com.back.end.model.Toner;

import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

import java.util.Optional;

@Service
public class ServiceToner {

private  final TonerRepository tonerRepository ;


    public ServiceToner(TonerRepository tonerRepository) {
        this.tonerRepository = tonerRepository;
    }

    public List<Toner> getToner() {
        return tonerRepository.findAll() ;
    }

    public void addToner(Toner toner) {
        Optional<Toner> tonerbytype = tonerRepository.findById(toner.getNum());
        if(tonerbytype.isPresent()){
            throw new IllegalStateException("User is present ! ");
        }
        else
        {
            tonerRepository.save(toner);
        }
        System.out.println(toner);
    }
@Transactional
    public void updateToner(int num_toner, int stock) {
        Toner toner = tonerRepository.getById(num_toner);
        if(stock < 0 )
        {
            throw new IllegalStateException("value of stock cannot be updated !! ");
        }
        else
        {
         toner.setStock(stock);
        }
    }


    public void deleteToner(int num_toner) {
        boolean exist = tonerRepository.existsById(num_toner);
        if (exist) {
            tonerRepository.deleteById(num_toner);
        } else
            throw new IllegalStateException("User is already does not exist ! ");
    }
    }


