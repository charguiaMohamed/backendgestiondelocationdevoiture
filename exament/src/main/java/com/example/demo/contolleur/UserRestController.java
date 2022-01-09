package com.example.demo.contolleur;


import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/User")
public class UserRestController {
    @Autowired
    private IUserService userService;

    @GetMapping("/all")
    private Iterable<User> UserList(){
        return userService.UserList();
    }
    @PostMapping("/add")
    private User addUser(@RequestBody User classroom)
    {
        return userService.addUser(classroom);
    }

    @PutMapping("/update/{id}")
    private User modifieUser ( @RequestBody User user, @PathVariable Integer id ){
        return userService.updateUser(user,id);

    }
    @DeleteMapping("/delete/{id}")
    public void deleteUserByid(@PathVariable Integer id) {
        userService.deleteUserByid(id);
    }
//    @GetMapping("/Best")
//    public List<User> BestClass(){ return userService.findBetterClass() ;}

}
