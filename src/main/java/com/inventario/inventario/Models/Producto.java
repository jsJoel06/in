package com.inventario.inventario.Models;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "inventario")
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private String precio; // si quieres operaciones con precio, mejor usar BigDecimal
    private Integer cantidad; // <-- cambiar a Integer
}
