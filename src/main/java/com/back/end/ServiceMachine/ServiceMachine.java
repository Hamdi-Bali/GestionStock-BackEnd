package com.back.end.ServiceMachine;
import com.back.end.MachineRepository.MachineRepository;
import com.back.end.model.Machine;
//import com.back.end.model.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ServiceMachine {
    private final MachineRepository machineRepository ;

    public ServiceMachine(MachineRepository machineRepository) {
        this.machineRepository = machineRepository;
    }
    @GetMapping
    public List<Machine> getMachine()
    {
        return machineRepository.findAll() ;
    }
/**
    public void addNewUser(User user)
    {
        System.out.println(user);
    }       **/

    public void delete(int num) {
        boolean exist = machineRepository.existsById(num);
        if (exist) {
            machineRepository.deleteById(num);
        } else
            throw new IllegalStateException("User is already does not exist ! ");
    }

@Transactional
    public void updatemachine(int num, String utilisateur, String site) {
        System.out.println("update succés ");
        Machine machine = machineRepository.findMachineById(num);
        if(utilisateur != null && utilisateur.length() > 0 && !Objects.equals(machine.getUtilisateur(),utilisateur)){
            machine.setUtilisateur(utilisateur);
        }
        if(site != null && site.length() > 0  && !Objects.equals(machine.getSite(),site))
        {
            machine.setSite(site);
        }

    }
    public void addNewMachine(Machine machine) {
        machineRepository.save(machine) ;
        System.out.println("machine added !! ");
    }

}



