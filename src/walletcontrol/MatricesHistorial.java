package walletcontrol;

import java.io.IOException;
import java.util.ArrayList;


public class MatricesHistorial {
    private ArrayList<Persona> arrayTablaVentas=new ArrayList<>();
    private ArrayList<Persona> arrayTablaCompras=new ArrayList<>();
    
    //Este metodo carga una matriz usando el Array de ventas deserializado
    public String[][] cargarArrayTablaVentas() throws IOException, ClassNotFoundException{
        
        ControlVentas array=new ControlVentas();
        arrayTablaVentas=array.retornaPersonaVentas();
    
    
        String[][] matrizTablaVentas=new String[arrayTablaVentas.size()][8];
            for (int i = 0; i < arrayTablaVentas.size(); i++) {
                matrizTablaVentas[i][0]=arrayTablaVentas.get(i).getUsuario();//---> Usuario
                matrizTablaVentas[i][1]=arrayTablaVentas.get(i).getNombre();//----> Origen
                matrizTablaVentas[i][2]=arrayTablaVentas.get(i).getOrigen();//----> Nombre
                matrizTablaVentas[i][3]=arrayTablaVentas.get(i).getApellido();//--> Apellido           
                matrizTablaVentas[i][4]=arrayTablaVentas.get(i).getCorreo();//----> Correo
                matrizTablaVentas[i][5]=arrayTablaVentas.get(i).getMonto();//-----> ID
                matrizTablaVentas[i][6]=arrayTablaVentas.get(i).getFecha();//-----> Monto
                matrizTablaVentas[i][7]=arrayTablaVentas.get(i).getID();//------- > Fecha            
            }
        return matrizTablaVentas;    
    }

    //Este metodo carga una matriz usando el Array de compras deserializado
    public String[][] cargarArrayTablaCompras() throws IOException, ClassNotFoundException, ClassNotFoundException{
        
        ControlCompras arrayCompras=new ControlCompras();
        arrayTablaCompras=arrayCompras.retornaPersona();
        
        String[][] matrizTablaCompras=new String[arrayTablaCompras.size()][10];
            for (int i = 0; i < arrayTablaCompras.size(); i++) {
                matrizTablaCompras[i][0]=arrayTablaCompras.get(i).getUsuario();
                matrizTablaCompras[i][1]=arrayTablaCompras.get(i).getOrigen();
                matrizTablaCompras[i][2]=arrayTablaCompras.get(i).getProcesador();
                matrizTablaCompras[i][3]=arrayTablaCompras.get(i).getNombre();
                matrizTablaCompras[i][4]=arrayTablaCompras.get(i).getApellido();                
                matrizTablaCompras[i][5]=arrayTablaCompras.get(i).getID();
                matrizTablaCompras[i][6]=arrayTablaCompras.get(i).getCorreo();
                matrizTablaCompras[i][7]=arrayTablaCompras.get(i).getMonto();
                matrizTablaCompras[i][8]=arrayTablaCompras.get(i).getFecha();
                matrizTablaCompras[i][9]=arrayTablaCompras.get(i).getDocumento();
                System.err.print(arrayTablaCompras.get(i).getOrigen());
                System.err.print(" ");
                System.err.println(arrayTablaCompras.get(i).getProcesador());
                
                
            }            
    return matrizTablaCompras;
}
}

