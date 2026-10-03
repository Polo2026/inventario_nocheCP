package org.example.inventario_noche2.application.services;

import org.example.inventario_noche2.domain.model.Movimiento;
import org.example.inventario_noche2.domain.model.Producto;

import java.util.List;
import java.util.Optional;

public interface MovimientoService {

    void save (Movimiento movimiento);
    List<Movimiento> findAll();
    Optional<Movimiento> findById(Long id);
    void delete(Long id);
    void update(Movimiento movimiento);


}
