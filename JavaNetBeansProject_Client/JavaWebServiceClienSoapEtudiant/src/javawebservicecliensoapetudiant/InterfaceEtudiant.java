/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebservicecliensoapetudiant;

import com.etudiant.WsInscription;
import com.etudiant.WsProfesseur;
import com.etudiant.WsEtudiant;
import com.etudiant.WsModule;
import com.etudiant.StringArray;
import PackageHomeMachine.PaneCenter;
import PackageHomeMachine.MenuPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.plaf.BorderUIResource;
import javax.swing.border.Border;
import java.awt.RenderingHints;
import java.awt.Component;
import java.awt.BasicStroke;

/**
 *
 * @author abdelmajid
 */
public class InterfaceEtudiant extends JFrame implements ActionListener, Runnable {

    /**
     *
     */
    private Etudiant etudiant;
    /**
     * Widgets pour la connection.
     */

    private JPanel container;
    private JTextField cneField;
    private JPasswordField passwordField;
    private JButton connexion;
    /**
     * Les widgets pour la modifications
     */
    private JButton envoyer;
    private JTextField adresseUp, emailUp, telephoneUp;
    private JPasswordField passwdEsUp, passwordUp;
    private JCheckBox adresseCheck, emailCheck, telephoneCheck, passwedCheck;
    /**
     * Des widgets pour les changées après une modification.
     */
    private JLabel adrs, eml, telp;
    //private JTabbedPane tabbedPane;
    private JPanel infos;
    private JPanel modulesActs;
    private JPanel situationPedag;
    private JPanel professeurs;
    private JPanel modification;
    private JPanel contenu;
    //private JPanel paneconx;
    /**
     * composants
     */
    private PaneCenter paneCentre;
    private MenuPanel paneMenu;
    private PaneContainer paneContainer;
    private Thread thread;
    public boolean cacherPaneDroite = true;

    public MouseAdapter eventSouris;
    /**
     *
     */
    public InterfaceEtudiant() {

        try {

            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            System.out.println("prob de lookand feel");
        };
        this.setTitle("BDSas Web Service of student");
        ImageIcon img = new ImageIcon("images/icon.png");
        setIconImage(img.getImage());
        /*Begin importants*/
        final InterfaceEtudiant pnthis=this;//référence à utiliser au sein d'une instanciation (MouseAdapter).
        this.eventSouris=new MouseAdapter() {
                @Override
                public void mouseEntered(MouseEvent e) {
                    System.out.println("HelloContainer: entred");
                    pnthis.cacherPaneDroite = true;
                }
                @Override
                public void mouseExited(MouseEvent e) {
                    System.out.println("HelloContainer: entred");
                    pnthis.cacherPaneDroite = false;
                }
            };
        
        this.container = new JPanel();
        this.cneField = new JTextField();
        this.passwordField = new JPasswordField();
        this.connexion = new JButton("Connexion");

        this.envoyer = new JButton("Envoyer");
        this.adresseUp = new JTextField();
        this.emailUp = new JTextField();
        this.telephoneUp = new JTextField();
        this.passwdEsUp = new JPasswordField();
        this.passwordUp = new JPasswordField();
        this.adresseCheck = new JCheckBox();
        this.emailCheck = new JCheckBox();
        this.telephoneCheck = new JCheckBox();
        this.passwedCheck = new JCheckBox();

        this.adrs = new JLabel();
        this.eml = new JLabel();
        this.telp = new JLabel();

        Font fntbtn = new Font("Andalus", Font.BOLD, 15);
        Color colbtn = new Color(56, 207, 52);
        this.envoyer.setFont(fntbtn);
        this.envoyer.setBackground(colbtn);
        this.envoyer.setPreferredSize(new Dimension(150, 40));

        this.connexion.addActionListener(this);
        this.envoyer.addActionListener(this);

        //this.tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM);
        this.reinitialiserPanels();
        //this.tabbedPane.add("Informations personnelles", this.infos);
        //this.tabbedPane.add("Mes modules actuels", new JScrollPane(this.modulesActs));
        //this.tabbedPane.add("Ma situation pédagogique", new JScrollPane(this.situationPedag));
        //this.tabbedPane.add("Mes Professeurs actuels", new JScrollPane(this.professeurs));
        //this.tabbedPane.add("Modification", this.modification);

        //this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(this.container);
        this.container.setOpaque(false);

        this.container.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
        gbc.gridx = gbc.gridy = 0;//position en x dans le grille.
        gbc.gridwidth = 1;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;//nombre de lignes occupées par le composant.
        int line = 0;

        JLabel lab1 = new JLabel(" Cne: "), lab2 = new JLabel(" Mot de passe: ");
        Font fntlab = new Font("Arial black", Font.BOLD, 14);
        Color collabc = new Color(0, 149, 213);
        lab1.setFont(fntlab);
        lab2.setFont(fntlab);
        lab1.setForeground(collabc);
        lab2.setForeground(collabc);
        lab1.setBorder(new MyBorder(2, 2, 2, 2, 20, colbtn, 1));
        lab2.setBorder(new MyBorder(2, 2, 2, 2, 20, colbtn, 1));

        Dimension dimfield = new Dimension(200, 30);
        this.cneField.setPreferredSize(dimfield);
        this.passwordField.setPreferredSize(dimfield);
        this.passwordField.setBorder(new MyBorder(2, 2, 2, 2, 20, colbtn, 1));
        this.cneField.setBorder(new MyBorder(2, 2, 2, 2, 20, colbtn, 1));
        this.connexion.setFont(fntbtn);
        this.connexion.setBorder(new MyBorder(2, 2, 2, 2, 15, colbtn, 1));
        this.connexion.setBackground(colbtn);
        gbc.gridx = gbc.gridy = 0;
        this.container.add(lab1, gbc);
        gbc.gridx = 1;
        this.container.add(this.cneField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.container.add(lab2, gbc);
        gbc.gridx = 1;
        this.container.add(this.passwordField, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        this.container.add(this.connexion, gbc);

        //this.container.add(this.tabbedPane,BorderLayout.CENTER);
        this.infos.setOpaque(false);
        this.modulesActs.setOpaque(false);
        this.situationPedag.setOpaque(false);
        this.professeurs.setOpaque(false);
        this.modification.setOpaque(false);
        this.contenu.setOpaque(false);
        /*End importants*/
        this.setSize(1100, 700);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                dispose();
                System.exit(0);
            }
        });
    }

    /**
     *
     */
    public void reinitialiserPanels() {
        this.infos = new JPanel();
        this.modulesActs = new JPanel();
        this.situationPedag = new JPanel();
        this.professeurs = new JPanel();
        this.modification = new JPanel();
        this.contenu = new JPanel();
        /*events*/
        this.infos.addMouseListener(this.eventSouris);
        this.modulesActs.addMouseListener(this.eventSouris);
        this.situationPedag.addMouseListener(this.eventSouris);
        this.professeurs.addMouseListener(this.eventSouris);
        this.modification.addMouseListener(this.eventSouris);
        this.contenu.addMouseListener(this.eventSouris);
    }

    /**
     *
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.connexion) {
            try {
                String cne_e = this.cneField.getText(), pawd_e = this.passwordField.getText();
                this.etudiant = new Etudiant(cne_e, pawd_e);

                this.getContentPane().remove(this.container);
                //this.container.setLayout(new BorderLayout());
                this.reinitialiserPanels();
                //this.container.add(this.tabbedPane, BorderLayout.CENTER);
                //this.container.paintAll(this.container.getGraphics());
                paneContainer = new PaneContainer(this);
                paneCentre = new PaneCenter(this);
                paneMenu = new MenuPanel(this);

                thread = new Thread(this);
                thread.start();
                //

                /*
                 this.addMouseMotionListener(new MouseAdapter() {
                 @Override
                 public void mouseMoved(MouseEvent e) {
                 System.err.println("Width:" + paneContainer.getWidth() + ", X: " + e.getX() + ", Cacher:" + cacherPaneDroite);
                 if (e.getX() > paneContainer.getWidth()) {
                 cacherPaneDroite = true;
                 } else {
                 cacherPaneDroite = false;
                 }
                 }
                 });*/
                paneContainer.add(paneMenu);
                this.getContentPane().setLayout(new BorderLayout(1, 0));
                //JScrollBar bar_v=new JScrollBar(JScrollBar.VERTICAL, 30, 40, 0, 300);
                //bar_v.setBackground(Color.red);
                //paneCentre.add(bar_v,BorderLayout.EAST);
                this.getContentPane().add(new JScrollPane(paneCentre), BorderLayout.CENTER);
                this.getContentPane().add(paneContainer, BorderLayout.WEST);
                this.remplirAllPanels();//remplir les panels par les données récupérées.
                this.paintAll(this.getGraphics());

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur de connexion", JOptionPane.ERROR_MESSAGE, null);
            }
        }
        /**
         * Le gestionnaire de l'événement clique sur le boutton "envoyer" pour
         * la modification.
         */
        if (e.getSource() == this.envoyer) {
            try {
                HashMap<String, String> modfs = new HashMap<>();
                if (!this.passwdEsUp.getText().equals(this.etudiant.getPassword())) {
                    throw new Exception("Votre mot passe est incorrect!\n \t Ressayer");
                }
                String message = "";
                int test = 0;
                if (this.adresseCheck.isSelected()) {
                    message += "Adresse\n";
                    String vala = this.adresseUp.getText();
                    if (vala.trim().equals("")) {
                        throw new Exception("Champ d'adresse vide !!");
                    }
                    test++;
                    modfs.put("adresse", vala);
                }
                if (this.emailCheck.isSelected()) {
                    message += "Email\n";
                    String vale = this.emailUp.getText();
                    if (vale.trim().equals("")) {
                        throw new Exception("Champ d'email vide !!");
                    }
                    test++;
                    modfs.put("email", vale);
                }
                if (this.telephoneCheck.isSelected()) {
                    message += "Téléphone\n";
                    String valt = this.telephoneUp.getText();
                    if (valt.trim().equals("")) {
                        throw new Exception("Champ de téléphone vide !!");
                    }
                    test++;
                    modfs.put("telephone", valt);
                }
                if (this.passwedCheck.isSelected()) {
                    message += "Mot de passe\n";
                    String valp = this.passwordUp.getText();
                    if (valp.trim().equals("") || valp.length() < 4) {
                        throw new Exception("Le nouveau mot de passe doit comporter\n plus de 4 caracères !!");
                    }
                    test++;
                    modfs.put("mdp", valp);
                }
                if (test == 0) {
                    throw new ClassFormatError("Il faut cocher les champs à modifier !");
                }
                StringArray keys = new StringArray(), vals = new StringArray();
                keys.getString().add("cne_e");
                keys.getString().add("passwd");
                vals.getString().add(this.etudiant.getCne());
                vals.getString().add(this.etudiant.getPassword());
                for (String ky : modfs.keySet()) {
                    keys.getString().add(ky);
                    vals.getString().add(modfs.get(ky));
                }
                if (!(JOptionPane.showConfirmDialog(this, "Voulez-vous vraiment modifier votre:\n" + message,
                        "Confirmation", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION)) {
                    return;
                }
                WsEtudiant etd = Etudiant.modification(keys, vals);
                if (etd.getCin().getValue().equals("None")) {
                    throw new ClassFormatError("Pas de modification !!");
                } else {
                    String pass = this.etudiant.getPassword();
                    if (modfs.containsKey("mdp")) {
                        pass = modfs.get("mdp");
                    }
                    this.etudiant.setEtudiantWsPwd(etd, pass);
                    /*Modifier l'affichage*/
                    this.remplirChampsModifiee();
                    JOptionPane.showMessageDialog(this, "Modification avec succès de votre:\n" + message, "Erreur", JOptionPane.INFORMATION_MESSAGE, null);
                }
            } catch (ClassFormatError ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.INFORMATION_MESSAGE, null);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }

    /**
     *
     */
    private void remplirChampsModifiee() {
        this.adresseUp.setText(this.etudiant.getEtudiantws().getAdresse().getValue());
        this.emailUp.setText(this.etudiant.getEtudiantws().getEmail().getValue());
        this.telephoneUp.setText(this.etudiant.getEtudiantws().getTelephone().getValue());
        this.passwdEsUp.setText("");
        this.passwordUp.setText("");
        this.adresseCheck.setSelected(false);
        this.emailCheck.setSelected(false);
        this.telephoneCheck.setSelected(false);
        this.passwedCheck.setSelected(false);

        System.out.println("Passs: " + this.etudiant.getPassword());
        this.adrs.setText(this.etudiant.getEtudiantws().getAdresse().getValue());
        this.eml.setText(this.etudiant.getEtudiantws().getEmail().getValue());
        this.telp.setText(this.etudiant.getEtudiantws().getTelephone().getValue());
    }

    /**
     * Méthode qui va remplir tous les widgets par les données récupérées.
     */
    private void remplirAllPanels() {
        this.remplirInfosPanel();
        this.remplirModulesActsPanel();
        this.remplirSituationPanel();
        this.remplirProfesseursPanel();
        this.remplirModificationPanel();
        this.remplirContenuPanel();
    }

    /**
     * Remplir le panel de informaions personnelles
     */
    private void remplirInfosPanel() {
        String nom = this.etudiant.getEtudiantws().getNom().getValue() + "  ",
                prenom = this.etudiant.getEtudiantws().getPrenom().getValue() + "  ",
                cin = this.etudiant.getEtudiantws().getCin().getValue() + "  ",
                cne = "" + this.etudiant.getEtudiantws().getCne().getValue() + "  ",
                ddn = this.etudiant.getEtudiantws().getDdn().getValue() + "  ",
                numins = "" + this.etudiant.getEtudiantws().getNumInscription().getValue() + "  ",
                email = this.etudiant.getEtudiantws().getEmail().getValue() + "  ",
                dateAjt = this.etudiant.getEtudiantws().getDateAjt().getValue() + "  ",
                telephone = this.etudiant.getEtudiantws().getTelephone().getValue() + "  ",
                typeLic = this.etudiant.getEtudiantws().getTypeLicence().getValue() + "  ",
                adresse = this.etudiant.getEtudiantws().getAdresse().getValue() + "  ",
                anneeUniver = this.etudiant.getEtudiantws().getAnneUniver().getValue() + "  ";
        JPanel paneGauche = new JPanel(new GridLayout(0, 1, 0, 10)),
                paneName = new JPanel(),
                paneDroit = new JPanel(new GridLayout(0, 1, 0, 10)),
                paneNomPrenom = new JPanel();

        JLabel labnom = new JLabel(" " + nom + " "), labprenom = new JLabel(" " + prenom + " ");
        //labvide.setOpaque(false);
        Font fnt = new Font("Andalus", Font.BOLD, 20);

        JLabel[] labsGauche = new JLabel[10], labsDroite = new JLabel[10];
        String[] textsGauche = {" CIN: ", cin, " Date de naissance: ", ddn, " Email: ", email, " Téléphone: ", telephone, " Adresse: ", adresse},
                textsDroite = {" CNE: ", cne, " N° inscription: ", numins, " Date d'ajout: ", dateAjt, " Type de licence: ", typeLic, " Année universitaire: ", anneeUniver};
        for (int i = 0; i < textsGauche.length; i++) {
            if (i % 2 != 0) {

                labsGauche[i] = new JLabel(textsGauche[i]);
                labsDroite[i] = new JLabel(textsDroite[i]);
                if (i == 5) {
                    labsGauche[i] = this.eml;
                    labsGauche[i].setText(textsGauche[i]);
                }
                if (i == 7) {
                    labsGauche[i] = this.telp;
                    labsGauche[i].setText(textsGauche[i]);
                }
                if (i == 9) {
                    labsGauche[i] = this.adrs;
                    labsGauche[i].setText(textsGauche[i]);
                }
                paneDroit.add(labsDroite[i]);
                paneGauche.add(labsGauche[i]);
                labsDroite[i].setToolTipText(textsDroite[i]);
                labsGauche[i].setToolTipText(textsGauche[i]);
                labsGauche[i].setBorder(new BorderUIResource.TitledBorderUIResource(
                        new BorderUIResource.MatteBorderUIResource(
                                5, 5, 5, 5, new Color(0, 120, 120)), textsGauche[i - 1],
                        BorderUIResource.TitledBorderUIResource.DEFAULT_JUSTIFICATION, BorderUIResource.TitledBorderUIResource.TOP, fnt, Color.blue));
                labsDroite[i].setBorder(new BorderUIResource.TitledBorderUIResource(
                        new BorderUIResource.MatteBorderUIResource(
                                5, 5, 5, 5, new Color(0, 120, 120)), textsDroite[i - 1],
                        BorderUIResource.TitledBorderUIResource.DEFAULT_JUSTIFICATION, BorderUIResource.TitledBorderUIResource.TOP, fnt, Color.blue));

            }
        }

        paneNomPrenom.setLayout(new GridBagLayout());
        paneName.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
        gbc.gridx = 0;//position en x dans le grille.
        gbc.gridwidth = 1;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;
        gbc.gridy = 0;

        labnom.setFont(fnt);
        labprenom.setFont(fnt);
        labnom.setVerticalTextPosition(JLabel.CENTER);
        labnom.setHorizontalTextPosition(JLabel.CENTER);
        labprenom.setVerticalTextPosition(JLabel.CENTER);
        labprenom.setHorizontalTextPosition(JLabel.CENTER);
        //JLabel labvide2 = new JLabel("~~~~~~~~~~~~"), labvide3 = new JLabel("~~~~~~~~~~~~");
        //labvide2.setOpaque(false);
        //labvide2.setFont(fnt);
        //labvide3.setFont(fnt);
        Color cllb = new Color(153, 244, 15);
        //labvide2.setForeground(cllb);
        //labvide3.setForeground(cllb);
        //paneNomPrenom.add(labvide2);
        paneNomPrenom.add(labnom, gbc);
        gbc.gridy = 1;
        paneNomPrenom.add(labprenom, gbc);
        //paneNomPrenom.add(labvide3);
        labnom.setOpaque(false);
        labprenom.setOpaque(false);
        paneName.setBackground(Color.red);
        paneName.setOpaque(false);
        paneNomPrenom.setBackground(new Color(126, 188, 211));//new Color(84, 188, 143));
        paneNomPrenom.setBorder(new MyBorder(15, 15, 15, 15, 20, cllb, 6));
        paneName.add(paneNomPrenom, gbc);
        BoxLayout box2 = new BoxLayout(this.infos, BoxLayout.LINE_AXIS);
        //this.infos.setLayout(new BorderLayout());
        int wd = (int) (this.getWidth() * 0.78), he = this.getHeight();
        paneGauche.setPreferredSize(new Dimension((int) (0.35 * wd) - 10, (int) (he * 0.9) - 50));
        paneName.setPreferredSize(new Dimension((int) (0.25 * wd) - 10, (int) (he * 0.9)));
        paneDroit.setPreferredSize(new Dimension((int) (0.35 * wd) - 10, (int) (he * 0.9) - 50));
        this.infos.add(paneGauche);
        this.infos.add(paneName);
        this.infos.add(paneDroit);
    }

    /**
     * Remplir le panel de Situation Pédagogique.
     */
    private void remplirSituationPanel() {
        HashMap<String, ArrayList<WsInscription>> insacts = this.etudiant.getSituationsPedagogique();
        //BoxLayout box3=new BoxLayout(this.situationPedag,BoxLayout.PAGE_AXIS);
        //this.situationPedag.setLayout(flow);
        this.situationPedag.setLayout(new GridBagLayout());
        int line = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
        gbc.gridx = 0;//position en x dans le grille.
        gbc.gridwidth = 1;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;
        gbc.gridy = 0;

        Font fnt = new Font("Andalus", Font.BOLD, 20);
        ArrayList<String> keys = new ArrayList<>(insacts.keySet());
        Collections.sort(keys);
        for (String sm : keys) {
            String semestre = "Semestre " + sm;
            JPanel pane = new JPanel(new GridLayout(0, 7, 8, 3));
            pane.setBorder(new BorderUIResource.TitledBorderUIResource(
                    new BorderUIResource.MatteBorderUIResource(
                            5, 5, 5, 5, new Color(0, 120, 120)), semestre,
                    BorderUIResource.TitledBorderUIResource.DEFAULT_JUSTIFICATION, BorderUIResource.TitledBorderUIResource.TOP, fnt, Color.blue));
            ArrayList<WsInscription> inscs = insacts.get(sm);
            //String[][] rowData = new String[inscs.size()][7];
            String[] columnNames = {" Id Module", " Nom Module", " Note Normale", " Note Rattrapage", " Année universitaire", " Nombre d'inscription", " Description Profésseur"};
            for (int i = 0; i < 7; i++) {
                JLabel labcol = new JLabel(columnNames[i]);
                labcol.setOpaque(true);
                labcol.setBackground(new Color(249, 30, 117));
                pane.add(labcol);
            }
            for (int i = 0; i < inscs.size(); i++) {
                WsInscription ins = inscs.get(i);
                String[] inscols = {" " + ins.getIdM().getValue(), " " + ins.getNomModule().getValue(), " " + ins.getNoteN().getValue(), " " + ins.getNoteR().getValue(), " " + ins.getAnneUniver().getValue(), " " + ins.getNbInscrit().getValue(), " " + ins.getDescriptionProf().getValue()};
                for (int j = 0; j < 7; j++) {
                    //rowData[i][j] = inscols[j];
                    JLabel labcol = new JLabel(inscols[j]);
                    labcol.setOpaque(false);
                    labcol.setToolTipText(inscols[j]);
                    pane.add(labcol);
                }
            }
            //JTable table = new JTable(rowData, columnNames);
            //pane.add(table, BorderLayout.CENTER);
            gbc.gridy = (line++);
            this.situationPedag.add(pane, gbc);
            //pane.setBackground(Color.red);
            //pane.setOpaque(false);
            pane.setBackground(Color.white);
            int wd = (int) (this.getWidth() * 0.78), he = this.getHeight();
            pane.setPreferredSize(new Dimension(wd - 30, (int) (he * 0.05 * (inscs.size() + 1))));
        }
        //this.paintAll(this.getGraphics());
    }

    /**
     * Remplir le panel des inscriptions actuelles.
     */
    private void remplirModulesActsPanel() {
        HashMap<String, ArrayList<WsInscription>> insacts = this.etudiant.getInscriptionsActuels();
        //BoxLayout box3=new BoxLayout(this.modulesActs,BoxLayout.PAGE_AXIS);
        //this.modulesActs.setLayout(flow);
        this.modulesActs.setLayout(new GridBagLayout());
        int line = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
        gbc.gridx = 0;//position en x dans le grille.
        gbc.gridwidth = 1;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;
        gbc.gridy = 0;

        Font fnt = new Font("Andalus", Font.BOLD, 20);
        ArrayList<String> keys = new ArrayList<>(insacts.keySet());
        Collections.sort(keys);
        for (String sm : keys) {
            String semestre = "Semestre " + sm;
            JPanel pane = new JPanel(new GridLayout(0, 7, 8, 3));
            pane.setBorder(new BorderUIResource.TitledBorderUIResource(
                    new BorderUIResource.MatteBorderUIResource(
                            5, 5, 5, 5, new Color(0, 120, 120)), semestre,
                    BorderUIResource.TitledBorderUIResource.DEFAULT_JUSTIFICATION, BorderUIResource.TitledBorderUIResource.TOP, fnt, Color.blue));
            ArrayList<WsInscription> inscs = insacts.get(sm);
            //String[][] rowData = new String[inscs.size()][7];
            String[] columnNames = {" Id Module", " Nom Module", " Note Normale", " Note Rattrapage", " Année universitaire", " Nombre d'inscription", " Profésseur"};
            for (int i = 0; i < 7; i++) {
                JLabel labcol = new JLabel(columnNames[i]);
                labcol.setOpaque(true);
                labcol.setBackground(new Color(249, 117, 30));
                pane.add(labcol);
            }
            for (int i = 0; i < inscs.size(); i++) {
                WsInscription ins = inscs.get(i);
                String[] inscols = {" " + ins.getIdM().getValue(), " " + ins.getNomModule().getValue(), " " + ins.getNoteN().getValue(), " " + ins.getNoteR().getValue(), " " + ins.getAnneUniver().getValue(), " " + ins.getNbInscrit().getValue(), " " + ins.getProfNom().getValue() + " " + ins.getProfPrenom().getValue()};
                for (int j = 0; j < 7; j++) {
                    //rowData[i][j] = inscols[j];
                    JLabel labcol = new JLabel(inscols[j]);
                    labcol.setOpaque(false);
                    labcol.setToolTipText(inscols[j]);
                    pane.add(labcol);
                }
            }
            //JTable table = new JTable(rowData, columnNames);
            //pane.add(table, BorderLayout.CENTER);
            gbc.gridy = (line++);
            this.modulesActs.add(pane, gbc);
            //pane.setOpaque(false);
            pane.setBackground(Color.white);
            int wd = (int) (this.getWidth() * 0.78), he = this.getHeight();
            pane.setPreferredSize(new Dimension(wd - 30, (int) (he * 0.05 * (inscs.size() + 1))));
        }
        //this.paintAll(this.getGraphics());
        this.modulesActs.setOpaque(false);
    }

    /**
     * Remplir le panel des professeurs actuels.
     */
    private void remplirProfesseursPanel() {
        List<WsProfesseur> profs = this.etudiant.getProfesseursActuels();
        JPanel paneNames = new JPanel();
        String[] names = {"Nom", "Prénom", "Téléphone", "Email"};
        int wd = (int) (this.getWidth() * 0.78), he = this.getHeight();
        Dimension dim = new Dimension((int) (wd * 0.9), 30);
        Dimension dim2 = new Dimension((int) (wd * 0.18), 20);
        paneNames.setPreferredSize(dim);
        //paneNames.setOpaque(false);
        Font fnt = new Font("Arial", Font.BOLD, 20);
        for (int i = 0; i < 4; i++) {
            JLabel lab = new JLabel(names[i]);
            lab.setFont(fnt);
            lab.setForeground(Color.BLUE);
            lab.setBackground(Color.YELLOW);
            lab.setPreferredSize(dim2);
            paneNames.add(lab);
        }
        //BoxLayout box4 = new BoxLayout(this.professeurs, BoxLayout.Y_AXIS);
        this.professeurs.setLayout(new GridBagLayout());
        int line = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
        gbc.gridx = 0;//position en x dans le grille.
        gbc.gridwidth = 1;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;
        gbc.gridy = 0;
        this.professeurs.add(paneNames, gbc);
        for (WsProfesseur prf : profs) {
            JPanel pane = new JPanel();
            String[] cols = {" " + prf.getNom().getValue(), " " + prf.getPrenom().getValue(), " " + prf.getTelephone().getValue(), " " + prf.getEmail().getValue()};
            for (int i = 0; i < 4; i++) {
                final JLabel lab = new JLabel(cols[i]);
                //lab.setFont(ft);
                lab.setForeground(Color.red);
                //lab.setBackground(Color.YELLOW);
                lab.setToolTipText(cols[i]);
                lab.setOpaque(false);
                lab.setPreferredSize(dim2);
                lab.setFont(fnt.deriveFont(Font.ITALIC, 16.0f));
                lab.addMouseListener(new MouseAdapter() {
                    public void mouseClicked(MouseEvent e) {
                        System.out.println("Lab: " + lab.getText());
                    }
                });
                pane.add(lab);
            }
            pane.setPreferredSize(dim);
            //pane.setOpaque(false);
            pane.setBackground(Color.white);
            pane.setBorder(new BorderUIResource.TitledBorderUIResource(
                    new BorderUIResource.MatteBorderUIResource(
                            2, 2, 2, 2, new Color(0, 120, 120)), null,
                    BorderUIResource.TitledBorderUIResource.DEFAULT_JUSTIFICATION, BorderUIResource.TitledBorderUIResource.TOP, fnt, Color.blue));
            //JSeparator sep = new JSeparator(JSeparator.HORIZONTAL);
            //sep.setMaximumSize(new Dimension(dim.width, 20));
            //sep.setBackground(Color.ORANGE);
            //this.professeurs.add(sep);
            gbc.gridy = (line++);
            this.professeurs.add(pane, gbc);

        }

        //this.paintAll(this.getGraphics());
    }

    /**
     * remplir le panel des modification
     */
    private void remplirModificationPanel() {
        /*ajouter les widgets a l'objet*/
        int wd = (int) (this.getWidth() * 0.78), he = this.getHeight();
        //BoxLayout box5=new BoxLayout(this.modification,BoxLayout.Y_AXIS);
        this.modification.setLayout(new GridBagLayout());
        int line = 0;
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 

        JPanel panecont = new JPanel(new GridLayout(4, 3, 5, 5));
        //BoxLayout box6=new BoxLayout(panecont,BoxLayout.PAGE_AXIS);
        //panecont.setLayout(box6);
        Font font1 = new Font("Andalus", Font.ITALIC, 18);
        Color collab = new Color(83, 0, 41);
        JLabel[] labs = new JLabel[5];
        String[] texts = {" Adresse ", " Email ", " Téléphone ", " Nouveau mot de passe ", " Votre mot de passe actuel  "};
        for (int i = 0; i < 5; i++) {
            labs[i] = new JLabel(texts[i]);
            labs[i].setOpaque(false);
            labs[i].setFont(font1);
            labs[i].setForeground(collab);
            //labs[i].setPreferredSize(new Dimension((int) (panecont.getWidth() * 0.3), 30));
        }
        panecont.add(labs[0]);
        panecont.add(this.adresseUp);
        panecont.add(this.adresseCheck);
        panecont.add(labs[1]);
        panecont.add(this.emailUp);
        panecont.add(this.emailCheck);
        panecont.add(labs[2]);
        panecont.add(this.telephoneUp);
        panecont.add(this.telephoneCheck);
        panecont.add(labs[3]);
        panecont.add(this.passwordUp);
        panecont.add(this.passwedCheck);

        JPanel paneBas = new JPanel();
        BoxLayout box6 = new BoxLayout(paneBas, BoxLayout.X_AXIS);
        paneBas.setLayout(box6);

        paneBas.add(labs[4]);
        paneBas.add(this.passwdEsUp);
        paneBas.add(this.envoyer);

        panecont.setPreferredSize(new Dimension((int) (0.75 * wd), (int) (he * 0.3)));
        paneBas.setPreferredSize(new Dimension((int) (0.85 * wd), 30));

        //JLabel labvide = new JLabel();
        //labvide.setOpaque(false);
        //labvide.setPreferredSize(new Dimension(this.getWidth() * 2, (int) (he * 0.25)));
        //this.modification.add(labvide);
        gbc.gridx = 2;//position en x dans le grille.
        gbc.gridwidth = 3;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 4;
        gbc.gridy = 0;
        this.modification.add(panecont, gbc);

        gbc.gridx = 0;//position en x dans le grille.
        gbc.gridwidth = 5;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;
        gbc.gridy = 4;
        this.modification.add(paneBas, gbc);
        //***
        panecont.setBorder(new MyBorder(2, 2, 2, 2, 15, new Color(153, 244, 15), 5));
        paneBas.setBorder(new MyBorder(2, 2, 2, 2, 15, new Color(153, 244, 15), 4));
        /*les valeurs*/
        this.adresseUp.setText(this.etudiant.getEtudiantws().getAdresse().getValue());
        this.emailUp.setText(this.etudiant.getEtudiantws().getEmail().getValue());
        this.telephoneUp.setText(this.etudiant.getEtudiantws().getTelephone().getValue());
    }

    /**
     * Remplir le Panel de contenu du formation
     */
    private void remplirContenuPanel() {
        HashMap<String, ArrayList<WsModule>> insacts = this.etudiant.getContenu();
        //BoxLayout box3=new BoxLayout(this.modulesActs,BoxLayout.PAGE_AXIS);
        //FlowLayout flow = new FlowLayout();
        //flow.setAlignment(FlowLayout.TRAILING);
        this.contenu.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.NONE;//indique comment remplir la cellule si le composant est plus petit que la cellule.(NONE HORIZONTAL VERTICAL BOTH)
        gbc.insets = new Insets(5, 5, 5, 5);//insets définir la marge entre les composant new Insets(margeSupérieure, margeGauche, margeInférieur, margeDroite) 
        gbc.ipady = gbc.anchor = GridBagConstraints.CENTER;//ipady permet de savoir où on place le composant s'il n'occupe pas la totalité de l'espace disponnible 
        gbc.gridx = 0;//position en x dans le grille.
        gbc.gridwidth = 1;//nombre de colonnes occupées par le composant.
        gbc.gridheight = 1;//nombre de lignes occupées par le composant.
        int line = 0;

        Font fnt = new Font("Andalus", Font.BOLD, 20);
        ArrayList<String> keys = new ArrayList<>(insacts.keySet());
        Collections.sort(keys);
        for (String sm : keys) {
            String semestre = "Semestre " + sm;
            JPanel pane = new JPanel(new GridLayout(0, 4, 8, 3));
            pane.setBorder(new BorderUIResource.TitledBorderUIResource(
                    new BorderUIResource.MatteBorderUIResource(
                            5, 5, 5, 5, new Color(0, 120, 120)), semestre,
                    BorderUIResource.TitledBorderUIResource.DEFAULT_JUSTIFICATION, BorderUIResource.TitledBorderUIResource.TOP, fnt, Color.blue));
            ArrayList<WsModule> inscs = insacts.get(sm);
            //String[][] rowData = new String[inscs.size()][7];
            String[] columnNames = {" Id Module", " Nom Module", "Description", " id Module équivalant"};
            for (int i = 0; i < 4; i++) {
                JLabel labcol = new JLabel(columnNames[i]);
                labcol.setOpaque(true);
                labcol.setBackground(new Color(249, 117, 30));
                pane.add(labcol);
            }
            for (int i = 0; i < inscs.size(); i++) {
                WsModule ins = inscs.get(i);
                String[] inscols = {" " + ins.getIdm().getValue(), " " + ins.getNom().getValue(), " " + ins.getDescription().getValue(), " " + ins.getIdmEq().getValue()};
                for (int j = 0; j < 4; j++) {
                    //rowData[i][j] = inscols[j];
                    JLabel labcol = new JLabel(inscols[j]);
                    labcol.setOpaque(false);
                    labcol.setToolTipText(inscols[j]);
                    pane.add(labcol);
                }
            }
            //JTable table = new JTable(rowData, columnNames);
            //pane.add(table, BorderLayout.CENTER);

            gbc.gridy = (line++);
            this.contenu.add(pane, gbc);
            //pane.setOpaque(false);
            pane.setBackground(Color.white);
            int wd = (int) (this.getWidth() * 0.78), he = this.getHeight();
            pane.setPreferredSize(new Dimension(wd - 40, (int) (he * 0.05 * (inscs.size() + 1))));
        }
        this.contenu.setOpaque(false);
        //this.paintAll(this.getGraphics());
    }

    /**
     *
     * @return
     */
    public PaneCenter getPaneCentre() {
        return paneCentre;
    }

    /**
     *
     * @return
     */
    public JPanel getContainer() {
        return container;
    }

    /**
     *
     * @return
     */
    public JPanel getInfos() {
        return infos;
    }

    /**
     *
     * @return
     */
    public JPanel getContenu() {
        return contenu;
    }

    /**
     *
     * @return
     */
    public JPanel getModulesActs() {
        return modulesActs;
    }

    /**
     *
     * @return
     */
    public JPanel getSituationPedag() {
        return situationPedag;
    }

    /**
     *
     * @return
     */
    public JPanel getProfesseurs() {
        return professeurs;
    }

    /**
     *
     * @return
     */
    public JPanel getModification() {
        return modification;
    }

    /**
     * Animation
     */
    @Override
    public void run() {
        try {
            while (true) {
                if (!cacherPaneDroite) {
                    int x = paneMenu.getX();
                    while (x < 5) {
                        paneMenu.setLocation(x, 0);
                        Thread.sleep(1);
                        x += 5;
                    }
                } else {
                    int x = paneMenu.getX(), xMin = -paneMenu.getWidth();
                    while (x > xMin) {
                        paneMenu.setLocation(x, 0);
                        Thread.sleep(2);
                        x -= 2;
                    }
                }
            }
        } catch (InterruptedException ex) {
            System.err.println("erreur dans l'exécution du run de thread\n");
        }

    }

    /**
     * Panel qui va contenir tous tabbed pane.
     */
    private static class PaneContainer extends JPanel {

        /**
         * Pour le JFrame qui va le contenir.
         */
        public InterfaceEtudiant monProjet;

        /**
         *
         * @param monProjet
         */
        public PaneContainer(InterfaceEtudiant monProjet) {
            super();
            this.monProjet = monProjet;
            setBackground(new Color(70, 20, 100));
            setLayout(new GridLayout(1, 1));
        }

        /**
         *
         */
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
            Graphics2D sur = (Graphics2D) g;
            ImageIcon img = new ImageIcon("images/back.jpg");
            g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), this);
        }
    }

    /**
     * bordure spécialisé à notre choix ;)
     */
    private static class MyBorder implements Border {

        private int x1, x2, x3, x4, arc, stroke;
        private Color coleur;

        /**
         *
         */
        public MyBorder(int x1, int x2, int x3, int x4, int arc, Color coleur, int stroke) {
            this.x1 = x1;
            this.x2 = x2;
            this.x3 = x3;
            this.x4 = x4;
            this.arc = arc;
            this.coleur = coleur;
            this.stroke = stroke;
        }

        /**
         *
         * @param c
         * @return
         */
        public Insets getBorderInsets(Component c) {
            return new Insets(x1, x2, x3, x4);//ou autre chose cela dépend de si tu veux rendre parametrable 
        }

        /**
         *
         */
        public boolean isBorderOpaque() {
            return false;//ou autre chose cela dépend de si tu veux rendre parametrable 
        }

        /**
         *
         */
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.setColor(coleur);//ou une autre couleur que tu peux rendre paramétrable //tu peux aussi le rendre configurable 
            int adjustXY = 1;//pour ajuster le dessin en x et y 
            int adjustWH = 2;//idem pour width et height 
            //pour eviter les escalier sur l'arrondi 
            Graphics2D g2 = (Graphics2D) g;
            if (stroke > 1) {
                g2.setStroke(new BasicStroke(stroke));
            }
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.drawRoundRect(x + adjustXY, y + adjustXY, width - adjustWH, height - adjustWH, arc, arc);
        }

    }

    /**
     * méthode statique qui retourne une bordure à notre choix.
     */
    public static MyBorder getBorder(int x1, int x2, int x3, int x4, int arc, Color col, int stroke) {
        return new MyBorder(x1, x2, x3, x4, arc, col, stroke);
    }
}
