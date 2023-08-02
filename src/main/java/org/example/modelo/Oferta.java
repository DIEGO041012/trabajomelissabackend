package org.example.modelo;

import org.example.validaciones.Ofertavalidaciones;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Oferta
{
  private  Integer id;
  private String titulo;
  private LocalDate fechadeinicio;
  private  LocalDate fecchafin;
  private  Double costoPersonal;
  private  Integer idLocal;

  private Ofertavalidaciones validar=new Ofertavalidaciones();


    public Oferta() {
    }

    public Oferta(Integer id, String titulo, LocalDate fechadeinicio, LocalDate fecchafin, Double costoPersonal, Integer idLocal) {
        this.id = id;
        this.titulo = titulo;
        this.fechadeinicio = fechadeinicio;
        this.fecchafin = fecchafin;
        this.costoPersonal = costoPersonal;
        this.idLocal = idLocal;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        try
        {
        this.validar.validarTitulo(titulo);
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Ofertavalidaciones getValidar() {
        return validar;
    }

    public void setValidar(Ofertavalidaciones validar) {
        this.validar = validar;
    }

    public LocalDate getFechadeinicio() {
        return fechadeinicio;
    }

    public void setFechadeinicio( String fechadeinicio)
    {
        try
        {
            this.validar.validarFormato(fechadeinicio);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate formatoActual= LocalDate.parse(fechadeinicio,formatter);
            this.fechadeinicio=formatoActual;

        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public LocalDate getFecchafin() {
        return fecchafin;
    }

    public void setFecchafin(String fecchafin)
    {
       try
       {
         this.validar.validarFormato((fecchafin));
         DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd/MM/yyyy");
         LocalDate formatoActual= LocalDate.parse(fecchafin,formatter);
           this.validar.validarFecha(this.fechadeinicio,formatoActual);
         this.fecchafin=formatoActual;

       }
       catch (Exception error)
       {
           System.out.println(error.getMessage());
       }
    }

    public Double getCostoPersonal() {
        return costoPersonal;
    }

    public void setCostoPersonal(Double costoPersonal){
        try
        {
            this.validar.validarcostoPersona( costoPersonal );
        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }
    }

    public Integer getIdLocal() {
        return idLocal;
    }

    public void setIdLocal(Integer idLocal) {
        this.idLocal = idLocal;
    }
}
