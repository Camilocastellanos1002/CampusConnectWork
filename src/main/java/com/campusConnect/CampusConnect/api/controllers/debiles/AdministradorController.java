package com.campusConnect.CampusConnect.api.controllers.debiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campusConnect.CampusConnect.infrastructure.abstract_services.debiles.IAdministradorService;

import lombok.AllArgsConstructor;
import lombok.Data;

@RestController
@RequestMapping("/administrador")
@Data
@AllArgsConstructor
public class AdministradorController {
    /* Inyección de dependencias*/
    @Autowired
    private final IAdministradorService administradorService;
}
