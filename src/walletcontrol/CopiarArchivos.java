/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walletcontrol;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


/**
 *
 * @author Eduardo Perfecto
 */
public class CopiarArchivos {
    
    
    public CopiarArchivos(String sourceFile, String destinationFile) throws IOException {

            Path origenPath = Paths.get(sourceFile);
            Path destinoPath = Paths.get(destinationFile);
            //sobreescribir el fichero de destino si existe y lo copia
            Files.copy(origenPath, destinoPath, StandardCopyOption.REPLACE_EXISTING);


}
}