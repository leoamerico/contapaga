package com.contapaga.repositories;

import org.springframework.stereotype.Repository;

import com.contapaga.entities.Categoria;

@Repository
public interface CategoriaRepository extends GenericRepository<Categoria, Long> {
    
}