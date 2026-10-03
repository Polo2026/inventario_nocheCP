package org.example.inventario_noche2.presentation.Controller;

import jakarta.persistence.Id;
import org.example.inventario_noche2.application.services.MovimientoService;
import org.example.inventario_noche2.domain.model.Movimiento;
import org.example.inventario_noche2.domain.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MovimientoController {
    private final MovimientoService movimientoService;


    public MovimientoController(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }


    @GetMapping
    public List<Movimiento> findAll(){
        return movimientoService.findAll();
    }

    @GetMapping
    public Optional<Movimiento> findById(@PathVariable long id){
        return movimientoService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Movimiento movimiento){
        movimientoService.save(movimiento);
    }
    @DeleteMapping("/{id}")
    public void delete(PathVariable Long id){
        movimientoService.delete(id);

    }

    @PutMapping
    public void update(@RequestBody Movimiento movimiento){
        movimientoService.update(movimiento);
    }



}
