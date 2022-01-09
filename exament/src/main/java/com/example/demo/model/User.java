package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbstractEntity {

    private String nom;
    @Column(unique = true,updatable = true)
    private String prenom;
    private String telephone;
    private String login;
    private String pwd;


    @ManyToMany(fetch = FetchType.LAZY)
    private List <Role> roles;


}
