package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class Role extends AbstractEntity {
    public enum Name {Admin,User} ;
    private String description;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<User> users  ;

    public Role() {
    }

    public Role(String description, List<User> users) {
        this.description = description;
        this.users = users;
    }
}
