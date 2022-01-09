package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Data
@Entity
public class Publication extends AbstractEntity{

    private String Titre;
    private String Description;
    private String Date;
    @ManyToOne
    private User users;

    public Publication() {
    }

    public Publication(String titre, String description, String date, User users) {
        Titre = titre;
        Description = description;
        Date = date;
        this.users = users;
    }
}
