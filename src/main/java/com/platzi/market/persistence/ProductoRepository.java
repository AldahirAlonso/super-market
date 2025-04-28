package com.platzi.market.persistence;

import com.platzi.market.persistence.crud.ProductoCrudReporitory;
import com.platzi.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudReporitory productoCrudReporitory;

    public List<Producto> getAll() {
        return (List<Producto>) productoCrudReporitory.findAll();
    }
}
