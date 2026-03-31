package com.programacion4.unidad4ej5.feature.socio.dtos.request;

import java.time.LocalDate;

import com.programacion4.unidad4ej5.config.TipoPago;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotNull;

public class PagoRequestDTO {

    @DecimalMin("1000.00")
    private Double monto;

    @Pattern(regexp = "^PAY-[A-Za-z0-9]{4}-[A-Za-z0-9]{4}$")
    private String codigoTransaccion;

    @Future
    private LocalDate fechaVencimiento;

    @NotNull
    private TipoPago tipoPago;
    
}
