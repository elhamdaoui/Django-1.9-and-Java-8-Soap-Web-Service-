/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageHomeMachine;

import javawebservicecliensoapetudiant.InterfaceEtudiant;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author abdelmajid
 */
public class PaneCenter extends JPanel {

    public InterfaceEtudiant monProjet;
    protected ImageIcon imgBackground;
    public static JPanel paneCorrespondanteButton = null;/*quand on click sur une des bouttons on
     affecte à cette panel l'interface correspondante.*/


    public PaneCenter(InterfaceEtudiant monProjet) {
        this.monProjet = monProjet;
        setLayout(new BorderLayout());
        imgBackground = new ImageIcon("images/fsdm1.jpg");
        paneCorrespondanteButton = monProjet.getInfos();
        paneCorrespondanteButton.setOpaque(false);
        //paneCorrespondanteButton.setBackground(Color.red);
        add(paneCorrespondanteButton, BorderLayout.CENTER);

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D surface = (Graphics2D) g;
        surface.drawImage(imgBackground.getImage(), 0, 0, getWidth(), getHeight(), this);

    }
}
