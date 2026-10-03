package org.example.inventario_noche2.infraestructura.repository;

import org.example.inventario_noche2.domain.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoRepository extends JpaRepository<Producto, Long> {



}
