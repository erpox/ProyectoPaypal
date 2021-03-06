/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walletcontrol;

import java.io.Serializable;

public class Persona implements Serializable {

    private static final long serialVersionUID = 1185940963547149254L;

private String usuario;
private String origen;
private String nombre;
private String apellido;
private String documento;
private String correo;
private String monto;
private String montoRecibido;
private String fecha;
private String ID;
private String procesador;
private String procesadorRecibido;

        public Persona(String usuario,String origen,String procesador, String nombre, String apellido, 
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
        this.procesador=procesador;
    }

    public Persona(String usuario, String origen, String procesador, 
            String correo, String monto, String fecha, String ID,String documento) {
        this.usuario = usuario;
        this.origen = origen;
        this.correo = correo;
        this.monto = monto;
        this.ID = ID;
        this.fecha = fecha;
        this.procesador=procesador;
        this.documento=documento;
        
    }

    public Persona(String usuario, String origen, String correo, String monto, 
            String montoRecibido, String fecha, String ID, String procesador,
            String procesadorRecibido,String documento,String nombre) {
        this.usuario = usuario;
        this.origen = origen;
        this.correo = correo;
        this.monto = monto;
        this.fecha = fecha;
        this.ID = ID;
        this.procesador = procesador;
        this.montoRecibido=montoRecibido;
        this.procesadorRecibido=procesadorRecibido;
        this.documento=documento;
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

    public String getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(String montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    public String getProcesadorRecibido() {
        return procesadorRecibido;
    }

    public void setProcesadorRecibido(String procesadorRecibido) {
        this.procesadorRecibido = procesadorRecibido;
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

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    @Override
    public String toString() {
        return "Persona{" + "usuario=" + usuario + ", origen=" + origen + 
                ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + 
                documento + ", correo=" + correo + ", monto=" + monto + ", fecha=" + 
                fecha + ", ID=" + ID + ", procesador=" + procesador + '}';
    }

   
    


}
