package org.example.inventario_noche2.presentation.Controller;

import jakarta.persistence.Id;
import org.example.inventario_noche2.application.services.ProductoService;
import org.example.inventario_noche2.domain.model.Producto;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/productos")
public class ProductoController {
    private final ProductoService productoService;

    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping
    public List<Producto> findAll(){
        return productoService.findAll();
    }
    @GetMapping
    public Optional<Producto> findById(@PathVariable long id){
        return productoService.findById();
    }

    @PostMapping
    public void save(@RequestBody Producto producto){
        productoService.save(producto);
    }

    @DeleteMapping("/{id}")
    public void delete(PathVariable long id){
        productoService.delete(id);

    }

    @PutMapping
    public void update(PathVariable long id, @RequestBody Producto producto){
        productoService.update(producto);
    }



}
