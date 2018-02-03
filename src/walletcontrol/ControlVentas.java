package walletcontrol;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;

 public class ControlVentas{
 
 
 private File fichero=new File("C:\\ProgramData\\WalletControlVentas.dat");


    public void agregarVenta(String usuario, String origen, String nombre, String apellido, 
            String correo, String ID, String monto, String fecha){
        ArrayList<Persona> listaVentas=new ArrayList<>();
        //se recibe como para parametro las variables de la clase principal
        try {
            //se llena el array con un objeto de dicha clase
            listaVentas.add(new Persona(usuario,origen,nombre,apellido,correo,ID,monto,fecha));

            if (fichero.exists()) { //si ya existe el fichero, añade el listaVentas despues de array existente sin sobreecribir el header

                //se llama a la clase modificada de ObjetOutputStream llamada MiObjectOutputStream
                MiObjectOutputStream moos = new MiObjectOutputStream(new FileOutputStream(fichero, true));
                moos.writeObject(listaVentas);
                moos.close();
            } else { //sino, crea un nuevo archivo y añada el header
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero));
                oos.writeObject(listaVentas);
                oos.close();
            }

        } catch (EOFException e) {
            System.out.println("fin");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<Persona> retornaPersonaVentas() throws IOException, ClassNotFoundException{
        
        ArrayList<Persona> listaVentasReturn=new ArrayList<>();
        ArrayList<Persona> listaVentas=new ArrayList<>();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero));
            try {
                //se repite el ciclo hasta que se llegue al final del archivo y arroja EOFException
                while (true) {

                    listaVentas = (ArrayList) ois.readObject();
                    for (Persona p : listaVentas) { //se llena un nuevo listaVentas con cada Array del fichero
                        listaVentasReturn.add(new Persona(p.getUsuario(),p.getNombre(),p.getOrigen(),
                                p.getApellido(),p.getDocumento(),p.getCorreo(),p.getID(),p.getMonto(),p.getFecha()));
                    }
                   

                }
            }catch (EOFException e){
                ois.close();
                return listaVentasReturn;
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