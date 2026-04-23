package com.recupera.examen.service;

import com.recupera.examen.controller.ControllerTiro;
import com.recupera.examen.repository.RepositoryJugador;
import com.recupera.examen.repository.RepositoryPartida;
import com.recupera.examen.repository.RepositoryTiro;
import org.springframework.stereotype.Service;


@Service
public class ServicePartida {
    public final RepositoryPartida repositoryPartida;

    private final RepositoryPartida repositoryPartida;
    private final RepositoryJugador repositoryJugador;
    private final RepositoryTiro repositoryTiro;

    public ServicePartida(RepositoryPartida repositoryPartida,RepositoryJugador repositoryJugador, RepositoryTiro repositoryTiro){
        this.repositoryPartida = repositoryPartida;
        this.repositoryJugador = repositoryJugador;
        this.repositoryTiro = repositoryTiro;
    }








}
