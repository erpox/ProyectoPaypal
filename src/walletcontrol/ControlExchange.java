package walletcontrol;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControlExchange {

 private File fichero=new File("C:\\ProgramData\\WalletControlExchange.dat");


    public void agregarExchgange(String usuario, String origen, String correo, String monto, 
            String montoRecibido, String fecha, String ID, String procesador,
            String procesadorRecibido,String documento,String nombre){
            
        ArrayList<Persona> listaExchange=new ArrayList<>();
        //se recibe como para parametro las variables de la clase principal
        try {

            listaExchange.add(new Persona(usuario,origen,correo,monto, montoRecibido,
                    fecha,ID,procesador,procesadorRecibido,documento,nombre));
            if (fichero.exists()) { //si ya existe el fichero, añade el listaVentas despues de array existente sin sobreecribir el header

                //se llama a la clase modificada de ObjetOutputStream llamada MiObjectOutputStream
                MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                moos.writeObject(listaExchange);
                moos.close();
            } else { //sino, crea un nuevo archivo y añada el header
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(listaExchange);
                oos.close();
            }

        } catch (EOFException e) {
            System.out.println("fin");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Persona> retornaPersonaExchange() throws IOException, ClassNotFoundException{
        
        ArrayList<Persona> listaExchangeReturn=new ArrayList<>();
        ArrayList<Persona> listaExchanges=new ArrayList<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            try {
                //se repite el ciclo hasta que se llegue al final del archivo y arroja EOFException
                while (true) {
                    
                    listaExchanges = (ArrayList) ois.readObject();
                    for (Persona p : listaExchanges) { //se llena un nuevo listaVentas con cada Array del fichero
                        listaExchangeReturn.add(new Persona(p.getUsuario(),
               p.getOrigen(), p.getCorreo(), p.getMonto(), p.getMontoRecibido(),
               p.getFecha(), p.getID(),p.getProcesador(),p.getProcesadorRecibido(),
               p.getDocumento(),p.getNombre()));
                    }
                   

                }
            }catch (EOFException e){
                ois.close();
                return listaExchangeReturn;
            }
    }

    public void borrar(File fichero){
        //se recibe el fichero como parametro

        if (fichero.delete()){//si se borra muestra el mensaje
            JOptionPane.showMessageDialog(null,"Borrado con exito");
        }else {//sino se puede borrar muestra el mensaje
            JOptionPane.showMessageDialog(null,"No hay nada que borrar");
        }
    }
}