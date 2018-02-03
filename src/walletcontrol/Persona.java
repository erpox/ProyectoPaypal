/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walletcontrol;

import java.io.Serializable;
import java.time.LocalDate;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1185940963547149254L;


    
private String usuario;
private String origen;
private String nombre;
private String apellido;
private String documento;
private String correo;
private String monto;
private String fecha;
private String ID;

        public Persona(String usuario,String origen, String nombre, String apellido, 
                String documento, String correo, String ID, String monto,String fecha) {
            
        this.usuario = usuario;
        this.origen=origen;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.correo = correo;
        this.monto = monto;
        this.ID = ID;
        this.fecha=fecha;
    }

    public Persona(String usuario, String origen, String nombre, String apellido, 
            String correo, String monto, String fecha, String ID) {
        this.usuario = usuario;
        this.origen = origen;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.monto = monto;
        this.ID = ID;
        this.fecha = fecha;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMonto() {
        return monto;
    }

    public void setMonto(String monto) {
        this.monto = monto;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

   
    


}
