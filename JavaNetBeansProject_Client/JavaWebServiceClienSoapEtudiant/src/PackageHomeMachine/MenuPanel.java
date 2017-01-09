/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageHomeMachine;

import javawebservicecliensoapetudiant.InterfaceEtudiant;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import sun.awt.VariableGridLayout;

/**
 *
 * @author abdelmajid
 */
public class MenuPanel extends JPanel {

    private Boutton[] listeBtns;
    private InterfaceEtudiant monProjet;
    private int nbrMenus = 7;
/**
 * 
 * @param monProjet 
 */
    public MenuPanel(InterfaceEtudiant monProjet) {
        this.monProjet = monProjet;
        listeBtns = new Boutton[nbrMenus];

        //setBackground(new Color(120, 40, 40));
        setPreferredSize(new Dimension(monProjet.getWidth() / 5, monProjet.getHeight()));
        setOpaque(false);
        this.setLayout(new VariableGridLayout(nbrMenus, 1));
        remplirListeBtns();
        addBtnsInPanel();
    }
/**
 * 
 */
    private void remplirListeBtns() {
        listeBtns[0] = new Boutton("Informations personnelles",monProjet.getInfos() ,null, null, null,monProjet.getPaneCentre(),"BDSaS: Informations personnelles");
        //exemple 
        //pan.setToolTipText("exemple d'un interface");
        listeBtns[1] = new Boutton("Mes modules actuels",monProjet.getModulesActs(), null, null, null,monProjet.getPaneCentre(),"BDSaS: Mes modules actuels");
        listeBtns[2] = new Boutton("Ma situation pédagogique",monProjet.getSituationPedag(), null, null, null,monProjet.getPaneCentre(),"BDSaS: Ma situation pédagogique");
        listeBtns[3] = new Boutton("Mes Professeurs actuels",monProjet.getProfesseurs(), null, null, null,monProjet.getPaneCentre(),"BDSaS: Mes Professeurs actuels");
        listeBtns[4] = new Boutton("Modification",monProjet.getModification(), null, null, null,monProjet.getPaneCentre(),"BDSaS: Contenu de la formation");
        listeBtns[5] = new Boutton("Contenu de la formation",monProjet.getContenu(), null, null, null,monProjet.getPaneCentre(),"BDSaS: Modification");
        listeBtns[6] = new Boutton("Déconnexion",new JPanel(), null, null, null,monProjet.getPaneCentre(),"BDSaS: Déconnexion");
    }
/**
 * 
 */
    private void addBtnsInPanel() {
        for (int i = 0; i < listeBtns.length; i++) {
            //listeBtns.get(i).setPreferredSize(new Dimension(getWidth(),(monProjet.getHeight()/nbrMenus)-5));
            if (listeBtns[i] != null) {
                this.add(listeBtns[i]);
            }
        }
    }
}
