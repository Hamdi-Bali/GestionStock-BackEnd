package com.back.end.ServiceImprimante;
import com.back.end.ImprimanteRepository.ImprimanteRepository;
import com.back.end.model.Imprimante;
import com.back.end.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceImprimante {
    private final ImprimanteRepository imprimanteRepository ;


    public ServiceImprimante(ImprimanteRepository imprimanteRepository) {
        this.imprimanteRepository = imprimanteRepository;
    }


    public void addImprimante(Imprimante imprimante)
    {
        Optional<Imprimante> imprimante1 = imprimanteRepository.findByNum(imprimante.getNum());
        if(imprimante1.isPresent()){
            throw new IllegalStateException("User is present ! ");
        }
        else
        {
            imprimanteRepository.save(imprimante);
        }
        System.out.println(imprimante);
    }

    public List<Imprimante> getImprimante()
    {
        return imprimanteRepository.findAll();
    }

@Transactional
    public void updateImprimante(int num , String site , String etat , String description) {
        System.out.println("update succés ");
        Imprimante imprimante1 = imprimanteRepository.findImprimanteByNum(num);
        System.out.println(imprimante1);
        System.out.println("imprimante nouv  = " +site+etat+description );
            if (site != null) {
                imprimante1.setSite(site);
            }
            if (etat != null) {
                imprimante1.setEtat(etat);
            }
            if (description != null) {
                imprimante1.setDescription(description);
            }

        }
        public void deleteImprimante(int num)
        {
            Imprimante imprimante = imprimanteRepository.findImprimanteByNum(num) ;
            if(imprimante != null)
            {
                imprimanteRepository.delete(imprimante);
            }
            else
            {
                throw  new IllegalStateException("imprimante introuvable") ;
            }
        }



    }
    // }