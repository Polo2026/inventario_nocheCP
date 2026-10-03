package org.example.inventario_noche2.application.services.impl;

import org.example.inventario_noche2.application.services.MovimientoService;
import org.example.inventario_noche2.application.services.ProductoService;
import org.example.inventario_noche2.domain.model.Producto;
import org.example.inventario_noche2.infraestructura.repository.ProductoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServiceImpl implements ProductoService {

    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(ProductoRepository productoRepository) {
        this.productoRepository = productoRepository;
    }

    @Override
    public void save(Producto producto) {
        productoRepository.save(producto);

    }

    @Override
    public List<Producto> findAll() {
        return productoRepository.findAll();
    }

    @Override
    public Optional<Producto> findById(Long id) {
        return productoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        productoRepository.deleteById(id);

    }



    @Override
    public void update(Producto producto) {
        productoRepository.save(producto);

    }
}
