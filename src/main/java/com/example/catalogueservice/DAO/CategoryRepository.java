package com.example.catalogueservice.DAO;

import com.example.catalogueservice.Entity.Category;
import com.example.catalogueservice.Entity.Produit;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategoryRepository extends MongoRepository<Category, String> {
}
