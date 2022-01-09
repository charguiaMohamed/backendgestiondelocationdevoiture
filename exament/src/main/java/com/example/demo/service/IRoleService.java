package com.example.demo.service;


import com.example.demo.model.Role;
import org.springframework.stereotype.Service;

@Service
public interface IRoleService {
    Iterable<Role> RoleList();
    Role addRole( Role role);
    Role updateRole (Role role,Integer id );
    void deleteRoleByid( Integer id);
}
