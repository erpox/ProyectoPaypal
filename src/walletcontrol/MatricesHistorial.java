package walletcontrol;

import java.io.IOException;
import java.util.ArrayList;


public class MatricesHistorial {
    private ArrayList<Persona> arrayTablaVentas=new ArrayList<>();
    private ArrayList<Persona> arrayTablaCompras=new ArrayList<>();
    private ArrayList<Persona> arrayTablaExchange=new ArrayList<>();
    
    //Este metodo carga una matriz usando el Array de ventas deserializado
    public String[][] cargarArrayTablaVentas() throws IOException, ClassNotFoundException{
        
        ControlVentas array=new ControlVentas();
        arrayTablaVentas=array.retornaPersonaVentas();
    
    
        String[][] matrizTablaVentas=new String[arrayTablaVentas.size()][8];
            for (int i = 0; i < arrayTablaVentas.size(); i++) {
                matrizTablaVentas[i][0]=arrayTablaVentas.get(i).getUsuario();
                matrizTablaVentas[i][1]=arrayTablaVentas.get(i).getOrigen();
                matrizTablaVentas[i][2]=arrayTablaVentas.get(i).getProcesador(); 
                matrizTablaVentas[i][3]=arrayTablaVentas.get(i).getMonto();
                matrizTablaVentas[i][4]=arrayTablaVentas.get(i).getID();
                matrizTablaVentas[i][5]=arrayTablaVentas.get(i).getCorreo();              
                matrizTablaVentas[i][6]=arrayTablaVentas.get(i).getFecha();
                matrizTablaVentas[i][7]=arrayTablaVentas.get(i).getDocumento();
            }
        return matrizTablaVentas;    
    }

    //Este metodo carga una matriz usando el Array de compras deserializado
    public String[][] cargarArrayTablaCompras() throws IOException, ClassNotFoundException, ClassNotFoundException{
        
        ControlCompras arrayCompras=new ControlCompras();
        arrayTablaCompras=arrayCompras.retornaPersona();
        int j=0;
        String[][] matrizTablaCompras=new String[arrayTablaCompras.size()][8];
            for (int i=arrayTablaCompras.size()-1; i >=0; i--) {
                matrizTablaCompras[j][0]=arrayTablaCompras.get(i).getUsuario();
                matrizTablaCompras[j][1]=arrayTablaCompras.get(i).getOrigen();
                matrizTablaCompras[j][2]=arrayTablaCompras.get(i).getProcesador();
                matrizTablaCompras[j][3]=arrayTablaCompras.get(i).getMonto();
                matrizTablaCompras[j][4]=arrayTablaCompras.get(i).getID();
                matrizTablaCompras[j][5]=arrayTablaCompras.get(i).getCorreo();            
                matrizTablaCompras[j][6]=arrayTablaCompras.get(i).getFecha();
                matrizTablaCompras[j][7]=arrayTablaCompras.get(i).getDocumento();
                j++;
            }
             
    return matrizTablaCompras;
}
    public String[][]cargarArrayTablaExchange() throws IOException, ClassNotFoundException{
        ControlExchange arrayExchange=new ControlExchange();
        arrayTablaExchange=arrayExchange.retornaPersonaExchange();
        
        int j=0;
        String[][] matrizTablaExchange=new String[arrayTablaExchange.size()][10];
        for (int i =0;i< arrayTablaExchange.size(); i++) {
           matrizTablaExchange[i][0]=arrayTablaExchange.get(i).getUsuario();
           matrizTablaExchange[i][1]=arrayTablaExchange.get(i).getOrigen();
           matrizTablaExchange[i][2]=arrayTablaExchange.get(i).getProcesador();
           matrizTablaExchange[i][3]=arrayTablaExchange.get(i).getProcesadorRecibido();
           matrizTablaExchange[i][4]=arrayTablaExchange.get(i).getMonto();
           matrizTablaExchange[i][5]=arrayTablaExchange.get(i).getMontoRecibido();
           matrizTablaExchange[i][6]=arrayTablaExchange.get(i).getID();
           matrizTablaExchange[i][7]=arrayTablaExchange.get(i).getCorreo();
           matrizTablaExchange[i][8]=arrayTablaExchange.get(i).getFecha();
           matrizTablaExchange[i][9]=arrayTablaExchange.get(i).getDocumento();
            System.err.println(arrayTablaExchange.get(i).getDocumento());
        }
        return matrizTablaExchange;
    }
}

