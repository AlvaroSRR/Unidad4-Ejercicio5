package com.programacion4.unidad4ej5.config;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = ValidadorMayorDeEdad.class)
public @interface MayorDeEdad {
    String message() default "Debe ser mayor de 18 años";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
