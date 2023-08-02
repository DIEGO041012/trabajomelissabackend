package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservaValidacionTest {
    private ReservaValidacion reservaValidacion;

    @BeforeEach

    public void reservaValidacion(){
        this.reservaValidacion=new ReservaValidacion();
    }

    @Test
    public void validarCantidadPersonacorrecto(){
        Integer cantidadPersonaValido= 3;
        Assertions.assertDoesNotThrow(()->this.reservaValidacion.validarCantidadPersona(cantidadPersonaValido));
    }
    @Test
    public void validarCantidadPersonaIncorrecto(){
        Integer cantidadPersonasInvalido=7;
        Exception excepcion=Assertions.assertThrows(Exception.class,()->this.reservaValidacion.validarCantidadPersona(cantidadPersonasInvalido));
        Assertions.assertEquals(Mensajes.Cantidad_Personas.getMensajes(),excepcion.getMessage());

    }


}