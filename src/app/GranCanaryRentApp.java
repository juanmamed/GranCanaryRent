/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import model.GranCanaryRent;
import model.Oficina;
import model.TarjetaCredito;
import model.TipoCambio;
import model.Usuario;
import org.json.simple.parser.ParseException;
/**
 *
 * @author Juanma
 */
public class GranCanaryRentApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, FileNotFoundException, ParseException {
        // TODO code application logic here
        GranCanaryRent model = new GranCanaryRent();
        String filePath_oficinas = new File("src/data/oficinas.json").getAbsolutePath();
        String filePath_usuarios = new File("src/data/usuarios.json").getAbsolutePath();

        model.loadOficinas(filePath_oficinas);
        model.loadUsuarios(filePath_usuarios);
        
        ArrayList<Oficina> oficinas = model.getOficinas();
        ArrayList<Usuario> usuarios = model.getUsuarios();
        
        for(int i=0; i<usuarios.size(); i++){
            System.out.println(usuarios.get(i).toString() + ":");
            ArrayList<TarjetaCredito> tarjetas = usuarios.get(i).getTarjetas();
            for(int x=0; x<tarjetas.size(); x++){
                System.out.println(tarjetas.get(x).toString());
            }
        }
        TipoCambio readyStatus = TipoCambio.valueOf("MANUAL");
        System.out.println(readyStatus.getTipoCambio());
        
    }
    
}
