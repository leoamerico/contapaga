package com.contapaga.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.contapaga.entities.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
    
}