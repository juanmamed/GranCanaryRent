/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import gui.PantallaInicio;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import model.GranCarnaryRent;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Juanma
 */
public class GranCarnaryRentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException, java.text.ParseException {
        // TODO code application logic here
        GranCarnaryRent model = new GranCarnaryRent();

        model.loadOficinas("./src/data/oficinas.json");
        model.loadServicios("./src/data/servicios.json");
        model.loadSeguros("./src/data/seguros.json");
        model.loadUsuarios("./src/data/usuarios.json");
        
        PantallaInicio pi = new PantallaInicio(model);
        pi.setVisible(true);         
    }
}
