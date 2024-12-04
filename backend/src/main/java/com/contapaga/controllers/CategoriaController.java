package com.contapaga.controllers;

import com.contapaga.entities.Categoria;
import com.contapaga.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoriaController extends BaseController<Categoria, Long> {

    @Autowired
    private CategoriaService categoriaService;

    @Override
    protected List<Categoria> findAll() {
        return categoriaService.findAll();
    }

    @Override
    protected Categoria findById(Long id) {
        return categoriaService.findById(id);
    }

    @Override
    protected Categoria save(Categoria categoria) {
        return categoriaService.save(categoria);
    }

    @Override
    protected Categoria update(Long id, Categoria categoria) {
        return categoriaService.update(id, categoria);
    }

    @Override
    protected void delete(Long id) {
        categoriaService.delete(id);
    }
}
