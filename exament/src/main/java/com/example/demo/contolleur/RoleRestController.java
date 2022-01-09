package com.example.demo.contolleur;



import com.example.demo.model.Role;
import com.example.demo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/Role")
public class RoleRestController {
    @Autowired
   private IRoleService roleService;
    @GetMapping("/all")
    private Iterable<Role> RoleList(){
        return roleService.RoleList();
    }
    @PostMapping("/add")
    private Role addRole(@RequestBody Role role)
    {
        return roleService.addRole(role);
    }

    @PutMapping("/update/{id}")
    private Role modifieRole ( @RequestBody Role role, @PathVariable Integer id ){
        return roleService.updateRole(role,id);

    }
    @DeleteMapping("/delete/{id}")
    public void deleteRoleByid(@PathVariable Integer id) {
        roleService.deleteRoleByid(id);
    }
//    @GetMapping("/Best")
//    public List<User> BestClass(){ return userService.findBetterClass() ;}

}


