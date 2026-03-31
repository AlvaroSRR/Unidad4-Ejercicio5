package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.util.List;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;

public class PlanCreateDTO {

    @Size(min = 100, max = 200)
    private String objetivo;

    @Min(1)
    @Max(7)
    private Integer frecuenciaSemanal;

    @DecimalMin("30.00")
    @DecimalMax("250.00")
    private Double pesoInicial;

    @DecimalMin("1.0")
    @DecimalMax("2.5")
    private Double altura;

    @NotEmpty
    @Size(min = 3)
    private List<String> listaEjercicios;

}
