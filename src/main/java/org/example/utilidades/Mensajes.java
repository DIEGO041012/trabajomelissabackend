package org.example.utilidades;

public enum Mensajes {
    NOMBRE_SOLO_LETRAS("El nombre de usuario solo puede tener letras o espacios"),

    NOMBRES_MUY_CORTO("señor usuario revise la cantidad de caracteres es muy pequeña"),

    CORREO_INVALIDO("señor usuario el correo q ha ingresado no es valido :"),

    LA_ZONA_NO_ES_VALIDA("la zonaingresada no es valida :"),

    EL_FORMATO_NO_ES_VALIDO("El formato no es el correcto :"),

    LA_FECHA_DE_INICIO("La fecha final  debe ser mayoy a la de inicio :"),
    Numero_cedula_invalido("El numero ingresado es invalido"),
    Cantidad_Personas("la cantidad de personas por reserva no púede ser mayor a 4");


    private  String mensajes;

    Mensajes(String mensajes) {
        this.mensajes = mensajes;
    }

    public String getMensajes() {
        return mensajes;
    }
}
