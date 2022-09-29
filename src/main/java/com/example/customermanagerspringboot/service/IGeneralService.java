package com.example.customermanagerspringboot.service;

import com.example.customermanagerspringboot.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();
    Optional<T> findById(Long id);

    void save(T t);
    void remove(Long id);
}
