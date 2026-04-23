package com.recupera.examen.model.dto;


import com.fasterxml.jackson.annotation.JsonGetter;
import com.recupera.examen.model.ModelJugador;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


public class dtojugador {

    public Long id;
    public boolean activo;
    public String nombre;

    public long getid(){
        return id;}
    public boolean getactivo(){
        return activo;
    }
    public String getNombre(){
        return nombre;
    }
    @ManyToOne
    @JoinColumn(name = "usario_id")
    public ModelJugador usuario;




}
