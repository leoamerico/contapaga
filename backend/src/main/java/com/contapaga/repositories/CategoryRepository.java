package com.contapaga.repositories;

import org.springframework.stereotype.Repository;

import com.contapaga.entities.Category;

@Repository
public interface CategoryRepository extends GenericRepository<Category, Long> {
    
}