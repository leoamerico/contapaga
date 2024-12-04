package com.contapaga.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public abstract class BaseController<T, ID> {

    protected abstract List<T> findAll();

    protected abstract T findById(ID id);

    protected abstract T save(T entity);

    protected abstract T update(ID id, T entity);

    protected abstract void delete(ID id);

    @GetMapping
    public ResponseEntity<List<T>> getAllEntities() {
        return ResponseEntity.ok(findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> getEntityById(@PathVariable ID id) {
        return ResponseEntity.ok(findById(id));
    }

    @PostMapping
    public ResponseEntity<T> saveEntity(@RequestBody T entity) {
        return ResponseEntity.ok(save(entity));
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> updateEntity(@PathVariable ID id, @RequestBody T entity) {
        return ResponseEntity.ok(update(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable ID id) {
        delete(id);
        return ResponseEntity.noContent().build();
    }
}
