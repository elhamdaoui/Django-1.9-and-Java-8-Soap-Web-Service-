/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebservicecliensoapetudiant;

import com.etudiant.WsEtudiant;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abdelmajid
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*try {
            Etudiant etd=new Etudiant("1129258678","abdelmajid");
            System.err.println("Nom: "+etd.getEtudiantws().getNom().getValue());
            
            System.out.println(etd.getInscriptionsActuels());
        } catch (Exception ex) {
            System.out.println("!!!!! "+ex.getMessage());
        }*/
        new InterfaceEtudiant().setVisible(true); 
    }

    
}
