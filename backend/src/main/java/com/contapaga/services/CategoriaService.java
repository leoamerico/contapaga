package com.contapaga.services;

import com.contapaga.entities.Categoria;
import com.contapaga.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService extends BaseService<Categoria, Long> {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public List<Categoria> findAll() {
        return categoriaRepository.findAll();
    }

    @Override
    public Categoria findById(Long id) {
        return categoriaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Category not found with ID: " + id));
    }

    @Override
    public Categoria save(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    @Override
    public Categoria update(Long id, Categoria updatedCategory) {
        Categoria existingCategory = findById(id);
        existingCategory.setNome(updatedCategory.getNome());
        existingCategory.setDescricao(updatedCategory.getDescricao());
        existingCategory.setAtivo(updatedCategory.isAtivo());
        return categoriaRepository.save(existingCategory);
    }

    @Override
    public void delete(Long id) {
        Categoria category = findById(id);
        categoriaRepository.delete(category);
    }
}
