package com.contapaga.services;

import java.util.List;

public abstract class BaseService<T, ID> {

    protected abstract List<T> findAll();

    protected abstract T findById(ID id);

    protected abstract T save(T entity);

    protected abstract T update(ID id, T entity);

    protected abstract void delete(ID id);
}
