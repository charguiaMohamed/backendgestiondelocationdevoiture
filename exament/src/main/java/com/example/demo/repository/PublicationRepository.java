package com.example.demo.repository;


import com.example.demo.model.Publication;
import org.springframework.data.repository.CrudRepository;

public interface PublicationRepository extends CrudRepository<Publication, Integer> {
}
