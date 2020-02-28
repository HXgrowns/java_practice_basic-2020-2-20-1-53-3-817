package com.thoughtworks;

import java.util.*;

public class MemoryRepository<E> implements Repository<E> {
    private Map<String, E> entities;

    public MemoryRepository() {
        this.entities = new HashMap<>();
    }

    @Override
    public boolean save(String id, E entity) {
        if (entity != null && id != null && !this.entities.containsKey(id)) {
            this.entities.put(id, entity);
            return true;
        }
        return false;
    }

    @Override
    public E get(String id) {
        return this.entities.getOrDefault(id, null);
    }

    @Override
    public boolean delete(String id) {
        if (id != null && this.entities.containsKey(id)) {
            this.entities.remove(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean update(String id, E entity) {
        if (entity != null && id != null && this.entities.containsKey(id)) {
            this.entities.put(id, entity);
            return true;
        }
        return false;
    }

    @Override
    public List<E> list() {
        return new ArrayList<>(this.entities.values());
    }
}
