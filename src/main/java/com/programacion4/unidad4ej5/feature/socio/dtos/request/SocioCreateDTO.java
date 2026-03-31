package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.time.LocalDate;

import com.programacion4.unidad4ej5.config.MayorDeEdad;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class SocioCreateDTO {

    @NotBlank
    @NotNull
    private String nombre;

    @NotBlank
    @NotNull
    private String apellido;

    @Email
    private String email;

    @Size(min = 8, max = 8)
    private Integer dni;

    @Past
    @MayorDeEdad
    private LocalDate fechaNacimiento;

    @Pattern(regexp = "^\\+\\d+")
    private String telefono;
}