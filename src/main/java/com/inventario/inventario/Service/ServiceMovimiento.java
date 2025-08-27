package com.inventario.inventario.Service;

import com.inventario.inventario.Models.Movimiento;
import java.util.List;

public interface ServiceMovimiento {
    List<Movimiento> findAll();
    Movimiento findById(Long id);
    Movimiento save(Movimiento movimiento);
    Movimiento update(Long id, Movimiento movimiento);
    void delete(Long id);
}
