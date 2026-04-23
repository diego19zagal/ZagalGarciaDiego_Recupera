package com.recupera.examen.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Jugador")
public class ModelTiro {

    @Id
    private Integer id;
    private String nombre;
    private Long saldo;
    private Boolean activo;
}
