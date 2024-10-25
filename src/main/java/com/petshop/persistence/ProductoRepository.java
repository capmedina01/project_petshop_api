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

    public Producto saveProduct(Producto producto) {
        return productoCrudRepository.save(producto);
    }

    public Producto updateProduct(Producto producto) {
        Optional<Producto> existProduct = productoCrudRepository.findById(producto.getProductoID());
        if (existProduct.isPresent()) {
            existProduct.get().setNombre(producto.getNombre());
            existProduct.get().setCantidadStock(producto.getCantidadStock());
            existProduct.get().setCategoriaID(producto.getCategoriaID());
            existProduct.get().setEstado(producto.isEstado());
            existProduct.get().setCodigoBarras(producto.getCodigoBarras());
            existProduct.get().setPrecioVenta(producto.getPrecioVenta());
            return productoCrudRepository.save(existProduct.get());
        }

        return productoCrudRepository.save(producto);
    }

    public void deleteProduct(int id) {
        productoCrudRepository.deleteById(id);
    }

}
