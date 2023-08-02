package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

import java.time.LocalDate;

public class Ofertavalidaciones
{

    public Ofertavalidaciones() {
    }

    protected Util util = new Util();

    public Boolean validarTitulo (String titulo) throws  Exception
    {
        if(titulo.length()>20)
        {
            throw new Exception("El titulo execede los caracteres : ");
        }
        else
        {
            return true;
        }

    }


    public Boolean validarcostoPersona(Double costoPersona ) throws  Exception
    {
        if (costoPersona  >= 0)
        {
            throw new Exception("El costo por persona es negativo o cero : ");
        }

        else
        {
            return  true;
        }

    }

    public Boolean validarFormato(String formato) throws Exception
    {
        String expresionRegular ="^(0[1-9]|[1-2][0-9]|3[0-1])\\/(0[1-9]|1[0-2])\\/\\d{4}$";

        if(!util.buscarConcidencia(expresionRegular,formato))
        {
            throw new Exception(Mensajes.EL_FORMATO_NO_ES_VALIDO.getMensajes());
        }
        else
        {
            return true;
        }
    }


    public  Boolean validarFecha (LocalDate fecha, LocalDate fechafin) throws Exception
    {
        if ( fechafin.isBefore(fecha))
        {
            throw new Exception(Mensajes.LA_FECHA_DE_INICIO.getMensajes());
        }
        else
        {
            return true;
        }
    }




}
