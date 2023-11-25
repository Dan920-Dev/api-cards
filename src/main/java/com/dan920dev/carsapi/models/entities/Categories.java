package com.dan920dev.carsapi.models.entities;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@Table(name = "Categorias")
public class Categories {

    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cat_id;

    @Column(name = "nombre")
    private String nombre;

    public Categories(Long cat_id, String nombre) {
        this.cat_id = cat_id;
        this.nombre = nombre;
    }

}
