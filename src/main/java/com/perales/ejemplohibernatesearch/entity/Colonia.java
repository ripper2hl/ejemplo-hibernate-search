package com.perales.ejemplohibernatesearch.entity;


import jakarta.persistence.*;
import java.io.Serializable;

import org.hibernate.search.engine.backend.types.Projectable;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.Indexed;
import org.hibernate.search.mapper.pojo.mapping.definition.annotation.KeywordField;
@Entity(name = "colonia")
@Indexed
public class Colonia  implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue( generator = "sequence_colonia", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequence_colonia", allocationSize = 10)
    @Column(name = "id")
    private Long id;

    @KeywordField(name = "nombre", projectable = Projectable.YES)
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
