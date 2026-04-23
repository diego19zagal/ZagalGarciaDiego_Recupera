package com.recupera.examen.controller;


import com.recupera.examen.model.dto.dtojugador;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class ControllerPartida {



    @PostMapping("{id}/lanzartiros")
    public dtojugador ControllerTiro.lanzartiro(@RequestBody
    dtojugador dto){return service.ServicePartida(dto)}


    @PostMapping("{id}/partidas")
    public dtojugador ControllerTiro.lanzartiro(@RequestBody
                                                dtojugador dto){return service.ServicePartida(dto)}





}
