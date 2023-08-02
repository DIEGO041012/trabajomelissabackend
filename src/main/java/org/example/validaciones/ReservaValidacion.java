package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class ReservaValidacion
{


    public ReservaValidacion() {
    }

    protected Util util = new Util();

   public Boolean validarCantidadPersona(Integer cantidadpersona) throws  Exception
   {
       if (cantidadpersona > 4)
       {
           throw new Exception(Mensajes.Cantidad_Personas.getMensajes());
       }
       else
       {
           return true;
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

}

