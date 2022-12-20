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
import model.TipoCambio;
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
        String filePath_oficinas = new File("oficinas.json").getAbsolutePath();
  
        System.out.println(filePath_oficinas);
        model.loadOficinas(filePath_oficinas);
        
        ArrayList<Oficina> oficinas = model.getOficinas();
        
        for(int i=0; i<oficinas.size(); i++){
            System.out.println(oficinas.get(i).toString());
        }
        TipoCambio readyStatus = TipoCambio.valueOf("MANUAL");
        System.out.println(readyStatus.getTipoCambio());
    }
    
}
