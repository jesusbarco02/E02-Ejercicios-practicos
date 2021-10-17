package com.salesianostriana.dam.Ej2;


import javax.persistence.*;
@Entity
@Table(name = "PRODUCT")
public class Producto {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @Basic(optional=false)
    @Column(name="NAME", nullable=false)
    private String nombre;
    @Basic(optional=false)
    @Column(name="PRICE", nullable=false)
    private double precio;
    @Column(name="IMAGE")
    private String imagen;
    @Column(name="DESCRIPTION")
    private String descripcion;


}
