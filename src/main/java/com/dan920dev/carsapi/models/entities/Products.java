package com.dan920dev.carsapi.models.entities;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "Productos")
public class Products {

    @Id
    @Column(name = "pro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "pro_nombre")
    private String proNombre;

    @Column(name = "pro_descripcion")
    private String proDescripcion;

    @Column(name = "pro_precio")
    private Double proPrecio;

    @Column(name = "imagen")
    private byte[] imagen;

    @Column(name = "estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "cat_id", referencedColumnName = "cat_id")
    private Categories categoria;


    public Products(Long id, String proNombre, String proDescripcion, Double proPrecio, byte[] imagen, Boolean estado, Categories categoria) {
       super();
        this.id = id;
        this.proNombre = proNombre;
        this.proDescripcion = proDescripcion;
        this.proPrecio = proPrecio;
        this.imagen = imagen;
        this.estado = estado;
        this.categoria = categoria;
    }


}
