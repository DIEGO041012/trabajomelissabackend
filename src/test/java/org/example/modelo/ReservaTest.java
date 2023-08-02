package org.example.modelo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class ReservaTest {
    private Reserva reserva;

    @BeforeEach
    public void setReserva() {
        this.reserva = new Reserva();
    }

    @Test
    public void setfechaInicial()
    {
        String fechaReserva="02/08/2023";
        this.reserva.setFechaReserva(fechaReserva);
        System.out.println(reserva.getFechaReserva());
        //Assertions.assertEquals(fechaInicialValida,reserva.getFechaReserva());
    }


}