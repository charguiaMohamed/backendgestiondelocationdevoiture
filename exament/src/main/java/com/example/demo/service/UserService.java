package com.example.demo.service;


import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {
     @Autowired
    private UserRepository iUserRepository;
    @Override
    public Iterable<User> UserList() {
        return  iUserRepository.findAll();
    }

    @Override
    public User addUser(User user) {
        return iUserRepository.save(user);
    }

    @Override
    public User updateUser(User user, Integer id) {
        User user1 = new User();
        user= iUserRepository.findById(id).get();
        if(user != null){
            user.setNom(user.getNom());
            user.setPrenom(user.getPrenom());
            user.setLogin(user.getLogin());
            user.setTelephone(user.getTelephone());
            user.setPwd(user.getPwd());
            return iUserRepository.save(user);
        }else
            return null;
    }


    @Override
    public void deleteUserByid(Integer id) {
    iUserRepository.deleteById(id);
    }
}
