package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


interface OnCreate {}
interface OnUpdate {}

public class SocioUpdateDTO {

    @Null(groups = OnCreate.class)
    @NotNull (groups = OnUpdate.class)
    private Integer id;

    @Pattern(regexp = "^https?://.*$", message = "Debe ser una URL válida")
    private String fotoUrl;

    @Size(min = 3, max = 15)
    @Pattern(regexp = "^[^\s]+$", message = "No debe contener espacios")
    private String alias;

}
