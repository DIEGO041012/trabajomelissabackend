package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioValidacionTest {
    // probando objeto usuario validaciones.
    public UsuarioValidacion usuarioValidacion;

    @BeforeEach
    public void UsuarioValidacion () {


    }

    @Test
    public void validarNombreUsuarioCorrecto()
    {
      String nombreValido="Melissa Mantilla"; //preparando

      //ejecutar la validacion.
        Assertions.assertDoesNotThrow(()->this.usuarioValidacion.validarNombre(nombreValido));
    }


    @Test
    public void validarNombreUsuarioIncorrecto()
    {
        String nombreInvalido="35446759895 Mantilla "; //preparando
        //ejecuto y verifico con la ASSERTIONS.
        Exception exception=Assertions.assertThrows(Exception.class,()->this.usuarioValidacion.validarNombre(nombreInvalido));
        Assertions.assertEquals(Mensajes.NOMBRE_SOLO_LETRAS.getMensajes(),exception.getMessage());


    }


}

