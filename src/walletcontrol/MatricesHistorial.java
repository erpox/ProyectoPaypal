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
    
    
        String[][] matrizTablaVentas=new String[arrayTablaVentas.size()][7];
            for (int i = 0; i < arrayTablaVentas.size(); i++) {
                matrizTablaVentas[i][0]=arrayTablaVentas.get(i).getUsuario();
                matrizTablaVentas[i][1]=arrayTablaVentas.get(i).getOrigen();
                matrizTablaVentas[i][2]=arrayTablaVentas.get(i).getProcesador(); 
                matrizTablaVentas[i][3]=arrayTablaVentas.get(i).getMonto();
                matrizTablaVentas[i][4]=arrayTablaVentas.get(i).getID();
                matrizTablaVentas[i][5]=arrayTablaVentas.get(i).getCorreo();              
                matrizTablaVentas[i][6]=arrayTablaVentas.get(i).getFecha();
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
}

