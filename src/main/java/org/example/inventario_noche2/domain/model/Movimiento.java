package org.example.inventario_noche2.domain.model;

public class Movimiento {
    private Long id;
    private Producto producto;
    private Integer cantidad;
    private TipoMovimiento tipo;

    public Movimiento(){
    }

    public Movimiento(Long id, Producto producto, Integer cantidad, TipoMovimiento tipo) {
        this.id = id;
        this.producto = producto;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public TipoMovimiento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimiento tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Movimiento{" +
                "id=" + id +
                ", producto=" + producto +
                ", cantidad=" + cantidad +
                ", tipo=" + tipo +
                '}';
    }
}
