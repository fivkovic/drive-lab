package com.drivelab.core.service;

import com.drivelab.core.exception.NotFoundException;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

@RequiredArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class BaseService<TEntity, TIdentifier> {

    public final JpaRepository<TEntity, TIdentifier> repository;

    public TEntity create(TEntity entity) {
        return this.repository.save(entity);
    }

    public Collection<TEntity> findAll() {
        return this.repository.findAll();
    }

    public TEntity findById(TIdentifier id) {
        return this.repository.findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public TEntity update(TIdentifier id, TEntity entity) {
        this.findById(id);
        return this.repository.save(entity);
    }

    public void delete(TIdentifier id) {
        this.repository.deleteById(id);
    }
}
