/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walletcontrol;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

 public class ControlCompras{
 

 private File fichero=new File("C:\\ProgramData\\WalletControl.dat");


    public void agregarPersona(String usuario,String origen,String procesador, String nombre, 
            String apellido, String documento, String correo, String ID, String monto,String fecha){
            
        ArrayList<Persona> arraylist=new ArrayList<>();
        //se recibe como para parametro las variables de la clase principal
        try {
            //se llena el array con un objeto de dicha clase
            arraylist.add(new Persona(usuario,origen,procesador,nombre,apellido,documento,correo,ID,monto,fecha));
            
            if (fichero.exists()) { //si ya existe el fichero, añade el arraylist despues de array existente sin sobreecribir el header

                //se llama a la clase modificada de ObjetOutputStream llamada MiObjectOutputStream
                MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                moos.writeObject(arraylist);
                moos.close();
            } else { //sino, crea un nuevo archivo y añada el header
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(arraylist);
                oos.close();
            }

        } catch (EOFException e) {
            System.out.println("fin");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

 @SuppressWarnings("unchecked")
    public ArrayList<Persona> retornaPersona() throws IOException, ClassNotFoundException{
        
        ArrayList<Persona> estesi=new ArrayList<>();
        ArrayList<Persona> arraylist2=new ArrayList<>();
        
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            try {
                //se repite el ciclo hasta que se llegue al final del archivo y arroja EOFException
                while (true) {

                    arraylist2 = (ArrayList) ois.readObject();
                    for (Persona p : arraylist2) { //se llena un nuevo arraylist con cada Array del fichero
                        estesi.add(new Persona(p.getUsuario(),p.getOrigen(),p.getProcesador(),
                                p.getNombre(),p.getApellido(),p.getDocumento(),p.getCorreo(),
                                p.getID(),p.getMonto(),p.getFecha()));  
                    }

                }
            }catch (EOFException e){
                ois.close();
                return estesi;
            }
    }
    

    public void borrar(File fichero){
        //se recibe el fichero como parametro

        if (fichero.delete()){//si se borra muestra el mensaje
            JOptionPane.showMessageDialog(null,"Borrado con exito");
        }else {//sino se puede borrar muestra el mensaje
            JOptionPane.showMessageDialog(null,"no hay nada que borrar");
        }
    }
}

