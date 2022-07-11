package com.back.end.api;
import com.back.end.ServiceMachine.ServiceMachine;
import com.back.end.ServiceUser.ServiceUser;
import com.back.end.model.Machine;
import com.back.end.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/users")
public class ApiController {
    private final ServiceUser serviceUser ;
    private final ServiceMachine serviceMachine ;

    @Autowired
    public ApiController(ServiceUser serviceUser, ServiceMachine serviceMachine) {
        this.serviceUser = serviceUser;
        this.serviceMachine = serviceMachine;
    }
    @GetMapping
    public List<User> getUser() {
        return serviceUser.getUser();
    }

    @PostMapping(path = "/add")
    public void addUser( @RequestBody  User user){
    serviceUser.addNewUser(user);

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


}
