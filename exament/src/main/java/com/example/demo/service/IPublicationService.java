package com.example.demo.service;


import com.example.demo.model.Publication;
import org.springframework.stereotype.Service;

@Service
public interface IPublicationService {
    Iterable<Publication> PublicationList();
    Publication addPublication( Publication publication);
    Publication updatePublication (Publication publication,Integer id );
    void deleteRoleByid( Integer id);
}
