package com.salesianostriana.dam.Ej1;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "COUNTRY")
public class Pais {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Column(name="NAME",nullable = false)
    @Basic(optional=false)
    private String nombre;
}
