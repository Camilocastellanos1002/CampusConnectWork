package com.campusConnect.CampusConnect.domain.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity(name = "grupo")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grupo {
    /* Atributos */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idGrupo;

    @Column(nullable = false)
    private String nombre;

    /* Relación con tabla Estudiante */
    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Estudiante> estudiantes;

    /* Relación con tabla Agenda */
    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Agenda> agendas;

    /* Relación con tabla Clase */
    @OneToMany(mappedBy = "grupo", cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private List<Clase> clases;
}
