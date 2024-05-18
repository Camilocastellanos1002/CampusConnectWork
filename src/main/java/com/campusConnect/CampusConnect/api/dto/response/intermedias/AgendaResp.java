package com.campusConnect.CampusConnect.api.dto.response.intermedias;

import java.sql.Date;
import java.sql.Time;

import com.campusConnect.CampusConnect.api.dto.response.fuertes.EventoResp;
import com.campusConnect.CampusConnect.api.dto.response.fuertes.GrupoResp;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AgendaResp {
    private Long idAgenda;
    private Date eventTitle;
    private Date eventStartDate;
    private Date eventEndDate;
    private Time eventStartTime;
    private Time eventEndTime;
    private String eventLocation;
    private EventoResp evento;
    private GrupoResp grupo;
}
