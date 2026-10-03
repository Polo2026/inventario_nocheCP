package org.example.inventario_noche2.application.services.impl;

import org.example.inventario_noche2.application.services.MovimientoService;
import org.example.inventario_noche2.domain.model.Movimiento;
import org.example.inventario_noche2.infraestructura.repository.MovimientoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovimientoServicesImpl implements MovimientoService {

    private final MovimientoRepository movimientoRepository;


    public MovimientoServicesImpl(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }


    @Override
    public void save(Movimiento movimiento) {
        movimientoRepository.save(movimiento);
    }

    @Override
    public List<Movimiento> findAll() {
        return movimientoRepository.findAll();
    }

    @Override
    public Optional<Movimiento> findById(Long id) {
        return movimientoRepository.findById(id);
    }

    @Override
    public void delete(Long id) {
        movimientoRepository.deleteById(id);
    }

    @Override
    public void update(Movimiento movimiento) {
        movimientoRepository.save(movimiento);



    }
}
