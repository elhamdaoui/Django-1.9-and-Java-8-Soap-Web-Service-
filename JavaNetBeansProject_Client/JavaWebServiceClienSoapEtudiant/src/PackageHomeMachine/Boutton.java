/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PackageHomeMachine;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author abdelmajid
 */
public class Boutton extends JButton implements ActionListener {

    private JPanel paneCorrespondante = null;
    private PaneCenter panecentre;
    private ImageIcon background_image;
    private ImageIcon pressedIcon;
    private Color background_Color;
    private String textBoutton = "";
    private String tiltleFenetre;

    public Boutton(String textBoutton, JPanel paneCorrespandante, ImageIcon background_image,
            ImageIcon pressedIcon, Color background_Color, PaneCenter panecentre, String titleFenetre) {
        if (background_Color == null) {
            background_Color = new Color(70, 180, 80);
        }
        if (pressedIcon == null) {
            pressedIcon = new ImageIcon("images/back_btn.png");
        }
        if (textBoutton == null) {
            textBoutton = "";
        }
        if (titleFenetre == null) {
            titleFenetre = "projet AMH";
        }
        setText(textBoutton);
        setBackground(background_Color);
        setPressedIcon(pressedIcon);
        addActionListener(this);

        this.textBoutton = textBoutton;
        this.background_image = background_image;
        this.pressedIcon = pressedIcon;
        this.background_Color = background_Color;
        this.panecentre = panecentre;
        this.tiltleFenetre = titleFenetre;
        paneCorrespondante = paneCorrespandante;
        if (paneCorrespandante != null) {
            //paneCorrespondante.setBackground(background_Color);
            paneCorrespondante.setOpaque(false);
        }

    }

    /**
     *
     * @param newPaneCorrespondante
     */
    public void setPaneCorrespondante(JPanel newPaneCorrespondante) {
        paneCorrespondante = newPaneCorrespondante;
    }

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D surface = (Graphics2D) g;
        if (background_image != null) {
            surface.drawImage(background_image.getImage(), 0, 0, getWidth(), getHeight(), this);
        }
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Déconnexion")) {
            if (!(JOptionPane.showConfirmDialog(this.panecentre.monProjet, "Voulez-vous déconnecter ?",
                    "Confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)) {
                return;
            }
            this.panecentre.monProjet.getContentPane().removeAll();
            this.panecentre.monProjet.getContentPane().add(this.panecentre.monProjet.getContainer());
            this.panecentre.monProjet.getContainer().setOpaque(false);
            this.panecentre.monProjet.getContentPane().paintAll(this.panecentre.monProjet.getContentPane().getGraphics());
            return;
        }
        //panecentre.remove(PaneCenter.paneCorrespondanteButton);
        panecentre.removeAll();
        PaneCenter.paneCorrespondanteButton = paneCorrespondante;
        String[] texs = {"Mes modules actuels", "Ma situation pédagogique", "Mes Professeurs actuels"};
        ArrayList<String> texts = new ArrayList<>();
        texts.add(texs[0]);
        texts.add(texs[1]);
        texts.add(texs[2]);
        panecentre.add(paneCorrespondante);
        panecentre.monProjet.setTitle(tiltleFenetre);
        //ces Trois lignes just pour repaint , parce que ne fait pas sans ceci .je ss pas prq!!.
        //Dimension size=panecentre.monProjet.getSize();
        //panecentre.monProjet.setSize((int)size.getWidth()+1,(int)size.getHeight()+1);
        this.panecentre.getParent().paintAll(this.panecentre.getParent().getGraphics());
        //this.panecentre.paintAll(this.panecentre.getGraphics());

    }
}
