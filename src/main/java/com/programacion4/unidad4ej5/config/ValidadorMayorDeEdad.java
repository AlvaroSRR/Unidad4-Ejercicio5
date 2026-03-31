package com.programacion4.unidad4ej5.config;

import java.time.LocalDate;
import java.time.Period;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ValidadorMayorDeEdad implements ConstraintValidator<MayorDeEdad, LocalDate> {
    @Override
    public boolean isValid(LocalDate fecha, ConstraintValidatorContext context) {
        if (fecha == null) return false;

        int edad = Period.between(fecha, LocalDate.now()).getYears();
        return edad >= 18;
    }
}
