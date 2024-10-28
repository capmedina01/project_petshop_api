package com.petshop.persistence;

import com.petshop.persistence.crud.CategoriaCrudRepository;
import com.petshop.persistence.entity.Categoria;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoriaRepository {

    private CategoriaCrudRepository categoriaCrudRepository;

    public List<Categoria> getCategorias() {
        return (List<Categoria>) categoriaCrudRepository.findAll();
    }
    public Categoria createCategoria(Categoria categoria) {
        return  categoriaCrudRepository.save(categoria);
    }

    public Categoria updateCategoria(Categoria categoria) {
        Optional<Categoria> existCategoria = categoriaCrudRepository.findById(categoria.getCategoriaID());
        existCategoria.get().setDescripcion(categoria.getDescripcion());
        existCategoria.get().setEstado(categoria.isEstado());
        return categoriaCrudRepository.save(existCategoria.get());
    }

    public void deleteCategoria(int categoriaID) {
        categoriaCrudRepository.deleteById(categoriaID);
    }
    public Optional<Categoria> getCategoria(int categoriaID) {
        return categoriaCrudRepository.findById(categoriaID);
    }
}
