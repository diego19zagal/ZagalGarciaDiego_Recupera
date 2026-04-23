package com.recupera.examen.controller;

import com.recupera.examen.model.dto.dtojugador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ControllerJugador {


   @PostMapping
    public ResponseEntity<?> create(
            @RequestBody dtojugador dto
   ){

   }




}
