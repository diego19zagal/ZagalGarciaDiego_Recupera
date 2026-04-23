package com.recupera.examen.controller;

import com.recupera.examen.model.dto.dtojugador;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class ControllerTiro {




    @PostMapping("{id}/lanzartiros")
    public dtojugador ControllerTiro.lanzartiro(@RequestBody
                                                dtojugador dto){return service.ServicePartida(dto)}
