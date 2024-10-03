package com.petshop.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class ComprasProductoPK implements Serializable {

    @Column(name = "id_compra")
    private int compraID;

    @Column(name = "id_producto")
    private int productoID;

    public int getCompraID() {
        return compraID;
    }

    public void setCompraID(int compraID) {
        this.compraID = compraID;
    }

    public int getProductoID() {
        return productoID;
    }

    public void setProductoID(int productoID) {
        this.productoID = productoID;
    }
}
