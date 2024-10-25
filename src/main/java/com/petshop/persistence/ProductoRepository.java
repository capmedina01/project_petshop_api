package com.petshop.persistence;

import com.petshop.persistence.crud.ProductoCrudRepository;
import com.petshop.persistence.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll() {

        return (List<Producto>) productoCrudRepository.findAll();
    }
    public Optional <Producto> getById(int id) {

        return productoCrudRepository.findById(id);
    }

}
