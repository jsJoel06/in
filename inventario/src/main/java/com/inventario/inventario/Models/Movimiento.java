package com.inventario.inventario.Models;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "movimiento")
public class Movimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Producto producto;

    private int cantidad;

    @Enumerated(EnumType.STRING)
    private TipoMovimiento tipo;

    private LocalDateTime fecha;

    private String descripcion;
}

