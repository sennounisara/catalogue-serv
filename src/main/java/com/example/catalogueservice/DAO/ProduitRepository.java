package com.example.catalogueservice.DAO;

import com.example.catalogueservice.Entity.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends MongoRepository<Produit, String> {
}
