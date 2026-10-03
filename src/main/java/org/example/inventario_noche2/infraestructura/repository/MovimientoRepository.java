package org.example.inventario_noche2.infraestructura.repository;

import jakarta.persistence.Entity;
import org.example.inventario_noche2.domain.model.Movimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimientoRepository extends JpaRepository<Movimiento, Long> {






}
