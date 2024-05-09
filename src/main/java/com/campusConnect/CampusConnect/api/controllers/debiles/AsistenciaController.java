package com.campusConnect.CampusConnect.api.controllers.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IAsistenciaService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/asistencia")
@AllArgsConstructor
public class AsistenciaController {
    /* Inyección de dependencias*/
    @Autowired
    private final IAsistenciaService asistenciaService;
}
