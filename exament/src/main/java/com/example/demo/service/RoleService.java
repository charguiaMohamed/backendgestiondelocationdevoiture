package com.example.demo.service;


import com.example.demo.model.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService implements IRoleService{
    @Autowired
    private RoleRepository IroleRepository;
    @Override
    public Iterable<Role> RoleList() {
        return IroleRepository.findAll();
    }

    @Override
    public Role addRole(Role role) {
        return IroleRepository.save(role);
    }

    @Override
    public Role updateRole(Role role, Integer id) {
        Role role1 = new Role();
        role= IroleRepository.findById(id).get();
        if(role != null){

            role.setDescription(role.getDescription());

            return IroleRepository.save(role);
        }else
            return null;
    }


    @Override
    public void deleteRoleByid(Integer id) {
    IroleRepository.deleteById(id);
    }
}
