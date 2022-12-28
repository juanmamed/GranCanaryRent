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
import java.util.ArrayList;
import model.Cobertura;
import model.GranCarnaryRent;
import model.Oficina;
import model.Seguro;
import model.Servicio;
import model.TarjetaCredito;
import model.TipoCambio;
import model.Usuario;
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
        
        String filePath_oficinas = new File("src/data/oficinas.json").getAbsolutePath();
        String filePath_usuarios = new File("src/data/usuarios.json").getAbsolutePath();
        String filePath_servicios = new File("src/data/servicios.json").getAbsolutePath();
        String filePath_seguros = new File("src/data/seguros.json").getAbsolutePath();

        model.loadOficinas(filePath_oficinas);
        model.loadServicios(filePath_servicios);
        model.loadSeguros(filePath_seguros);
        model.loadUsuarios(filePath_usuarios);
        
        PantallaInicio pi = new PantallaInicio(model);
        pi.setVisible(true);         
    }
}
