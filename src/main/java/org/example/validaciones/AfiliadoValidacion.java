package org.example.validaciones;

import org.example.utilidades.Mensajes;
import org.example.utilidades.Util;

public class AfiliadoValidacion {
    // el valor de la membresia no puede ser menor a 20.000
    // ni mayor a 150.000
    // cedula del referido solo puede tener numeros.


    public AfiliadoValidacion() {
    }
    private  Util util=new Util();

    public Boolean validarMembresia (Integer membresia) throws  Exception
    {
        if (membresia < 20000 || membresia >150000)
        {
          throw new Exception("señor usuario el valor no puede ser menor del indicado");
        }
        else
        {
            return true;
        }
    }



        public Boolean validarCedula(String cedula) throws Exception
        {
            String exprecionRegular="\\d+";
            if (!util.buscarConcidencia(exprecionRegular,cedula))
            {
                throw new Exception(Mensajes.Numero_cedula_invalido.getMensajes());
            } else
            {
                return true;
            }
        }
}
