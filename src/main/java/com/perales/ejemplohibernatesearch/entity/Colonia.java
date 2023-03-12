package com.perales.ejemplohibernatesearch.entity;


import jakarta.persistence.*;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.FullTextField;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;

import java.io.Serializable;
@Entity(name = "colonia")
@Indexed
public class Colonia  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( generator = "sequence_colonia", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence_colonia", allocationSize = 10)
    @Column(name = "id")
    private Long id;

    @FullTextField
    @Column(name = "nombre", nullable = false)
    private String nombre;

    public Colonia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
