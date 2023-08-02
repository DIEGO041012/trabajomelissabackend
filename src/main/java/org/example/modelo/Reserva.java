package org.example.modelo;

import org.example.validaciones.ReservaValidacion;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Reserva
{
  private Integer id;
  private Integer idUsuario;
  private Double costoTotal;
  private LocalDate fechaReserva;

  private Integer cantidadpersona;

  private Double Iva=0.19;

  private ReservaValidacion validar= new ReservaValidacion();


    public Reserva() {
    }

    public Reserva(Integer id, Integer idUsuario, Double costoTotal, LocalDate fechaReserva) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.costoTotal = costoTotal;
        this.fechaReserva = fechaReserva;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(Double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public LocalDate getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(String fechaReserva)
    {
        try
        {
            this.validar.validarFormato(fechaReserva);
            DateTimeFormatter reserva= DateTimeFormatter.ofPattern("(dd/MM/yyyy)");
            LocalDate formatoActual = LocalDate.parse(fechaReserva,reserva);
            System.out.println( "aquiii");
            this.fechaReserva=formatoActual;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public Integer getCantidadpersona() {
        return cantidadpersona;
    }

    public void setCantidadpersona(Integer cantidadpersona) {
        try
        {
            this.validar.validarCantidadPersona(cantidadpersona);

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }

    }

    public Double getIva() {
        return Iva;
    }

    public void setIva(Double iva) {
        Iva = iva;
    }
}
