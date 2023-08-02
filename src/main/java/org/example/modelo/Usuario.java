package org.example.modelo;

import org.example.validaciones.UsuarioValidacion;

public abstract  class Usuario
{
   private Integer id;
    private String documento;
    private  String nombres;
    private String correo;
    private  Integer ubicacion;
    private final Integer costoAnual=2000000;

    private UsuarioValidacion validacion=new UsuarioValidacion();

    public Usuario() {
    }

    public Usuario(Integer id, String documento, String nombres, String correo, Integer ubicacion) {
        this.id = id;
        this.documento = documento;
        this.nombres = nombres;
        this.correo = correo;
        this.ubicacion = ubicacion;
    }

    public Integer getCostoAnual() {
        return costoAnual;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        try{
            this.validacion.validarNombre(nombres);
        }catch (Exception error){
            System.out.println(error.getMessage());
        }
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Integer ubicacion) {

        try {
            this.validacion.validarUbicacion(ubicacion);
            this.ubicacion=ubicacion;


        }
        catch (Exception error)
        {
            System.out.println(error.getMessage());
        }



    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", documento='" + documento + '\'' +
                ", nombres='" + nombres + '\'' +
                ", correo='" + correo + '\'' +
                ", ubicacion=" + ubicacion +
                ", validacion=" + validacion +
                '}';
    }
    // METODOS ORDINARIOS

    public  abstract Double calcularAnualidades();
}
