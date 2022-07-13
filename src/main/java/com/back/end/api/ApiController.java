package com.back.end.api;
import com.back.end.ServiceImprimante.ServiceImprimante;
import com.back.end.ServiceMachine.ServiceMachine;
import com.back.end.ServiceToner.ServiceToner;
import com.back.end.ServiceUser.ServiceUser;
import com.back.end.model.Imprimante;
import com.back.end.model.Machine;
import com.back.end.model.Toner;
import com.back.end.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class ApiController {
    private final ServiceUser serviceUser ;
    private final ServiceMachine serviceMachine ;
    private final ServiceToner serviceToner ;

    private final ServiceImprimante serviceImprimante ;


    @Autowired
    public ApiController(ServiceUser serviceUser, ServiceMachine serviceMachine, ServiceToner serviceToner, ServiceImprimante serviceImprimante) {
        this.serviceUser = serviceUser;
        this.serviceMachine = serviceMachine;
        this.serviceToner = serviceToner;
        this.serviceImprimante = serviceImprimante;
    }
    @GetMapping
    public List<User> getUser() {
        return serviceUser.getUser();
    }

    @PostMapping(path = "/add")
    public void addUser( @RequestBody  User user){
    serviceUser.addNewUser(user);

    }

    @PutMapping(path = "/update/{num}")
    public void updatemUser(

            // @RequestBody int machineid ,
            @PathVariable("num") int num  ,
            @RequestParam(required = false) String nom,
            @RequestParam(required = false) String mdp,
            @RequestParam(required = false) String type

    )
    {
        serviceUser.updateUser(num ,nom,mdp , type );
    }
    @DeleteMapping(path = "/delete/{num}")
    public void deleteuser(@PathVariable("num") int num)
    {
        serviceUser.delete(num);
    }

    @GetMapping(path = "/machine")
    public List<Machine> getMachine()
    {
        return serviceMachine.getMachine() ;
    }

    @DeleteMapping(path = "/machine/{id}")
    public void deleteMachine(@PathVariable("id") int id )
    {
        serviceMachine.delete(id);
    }
    @PostMapping(path = "/addmachine")
    public void addmachine(@RequestBody Machine machine)
    {
        serviceMachine.addNewMachine(machine);
    }



    @GetMapping(path = "/gettoner")
    public List<Toner> getToner()
    {
        return serviceToner.getToner()  ;
    }
    @PostMapping(path = "addtoner")
    public void addToner(@RequestBody Toner toner)
    {
        serviceToner.addToner(toner);
    }
    @PutMapping(path = "/{num}")
    public void updatemachine(

            // @RequestBody int machineid ,
            @PathVariable("num") int num  ,
            @RequestParam(required = false) String utilisateur,
            @RequestParam(required = false) String site

    )
    {
        //    serviceMachine.updatemachine(Integer.parseInt(String.valueOf(num)),utilisateur,site) ;
        serviceMachine.updatemachine(num,utilisateur,site);
    }

    @PutMapping(path = "updatetoner/{num_toner}")
    public void updateToner(@PathVariable int num_toner ,
                            @RequestParam(required = false) int stock)
    {
                serviceToner.updateToner(num_toner,stock) ;
    }

    @DeleteMapping(path = "/deletetoner/{num_toner}")
    public void deleteToner(@PathVariable("num_toner") int num_toner )
    {
        serviceToner.deleteToner(num_toner);
    }

    @PostMapping(path = "addimprimante")
    public void addImprimante(@RequestBody Imprimante imprimante)
    {
    serviceImprimante.addImprimante(imprimante);
    }

    @GetMapping(path = "getImprimante")
    public List<Imprimante> getImprimante()
    {
        return serviceImprimante.getImprimante();
    }
    @PutMapping("updateImprimante/{num}")
    public void updateImprimante(@PathVariable int num ,
                                 @RequestParam(required = false) String site ,
                                 @RequestParam(required = false) String etat ,
                                 @RequestParam (required = false) String description
                                 )
    {
            serviceImprimante.updateImprimante(num,site,etat,description);
    }
    @DeleteMapping(path = "deleteImprimante/{num}")
    public void deleteImprimante(@PathVariable int num )
    {
        serviceImprimante.deleteImprimante(num);
    }

    


}
