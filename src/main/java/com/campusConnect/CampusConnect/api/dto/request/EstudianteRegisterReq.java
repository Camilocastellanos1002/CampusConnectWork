package com.campusConnect.CampusConnect.api.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper=true)
@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteRegisterReq extends RegisterReq {
    @NotBlank(message = "El nombre es requerido")
    private String firstName;
    @NotBlank(message = "El apellido es requerido")
    private String lastName;
    @Size(
        min = 10, 
        max = 20, 
        message = "El teléfono debe tener entre 10 y 20 caracteres"
    )
    private String phone;
    @Email(message = "El email no es válido")
    @Size(
        min = 5, 
        max = 100,
        message = "El email debe tener entre 5 y 100 caracteres"
    )
    private String email; 
}
