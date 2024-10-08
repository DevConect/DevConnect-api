package com.andrenique.repository;
import com.andrenique.model.entity.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
