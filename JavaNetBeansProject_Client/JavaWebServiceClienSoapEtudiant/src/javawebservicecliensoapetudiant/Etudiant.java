/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javawebservicecliensoapetudiant;

import com.etudiant.WsEtudiant;
import com.etudiant.WsEtudiantArray;
import com.etudiant.WsInscription;
import com.etudiant.WsInscriptionArray;
import com.etudiant.WsModule;
import com.etudiant.WsModuleArray;
import com.etudiant.WsProfesseur;
import com.etudiant.WsProfesseurArray;
import com.etudiant.WsSemestre;
import com.etudiant.WsSemestreArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author abdelmajid
 */
public class Etudiant {

    /**
     * Le mot de passe de l'étudiant qui est le tapé pour le connecter, et pour
     * accès a tout méthode appelée à distant.
     */
    private String password;
    /**
     * Cne de l'étudiant, même chose pour le passwd.
     */
    private String cne;
    /**
     * un objet de notre service, contient tous les infos de l'étudiants.
     */
    private WsEtudiant etudiantws;
    /**
     * Liste des inscriptions actuels par semestre de l'étudiants.
     */
    private HashMap<String, ArrayList<WsInscription>> inscriptionsActuels;
    /**
     * Liste des inscriptions aux modules validé par le responsable (situation
     * pédagogique de l'étudiant).
     */
    private HashMap<String, ArrayList<WsInscription>> situationsPedagogique;
    /**
     * Liste des profs des modules actuels de l'étudiant
     */
    private List<WsProfesseur> professeursActuels;
    /**
     * Dictionnaire des modules par semestre.
     */
    private HashMap<String, ArrayList<WsModule>> contenu;
    /**
     * liste de toutes les semstres de la formations.
     */
    private List<WsSemestre> allSemestres;
    /**
     * liste de tous les modules de la formations.
     */
    private List<WsModule> allModules;

    /**
     * Le constructeur de la classe, a deux paramètres cne et password, appelé
     * lors de la connection.
     *
     * @param password
     * @param cne
     */
    public Etudiant(String cne, String password) throws Exception {
        this.password = password;
        this.cne = cne;
        this.allSemestres = Etudiant.getAllSemestres().getWsSemestre();
        this.allModules = Etudiant.getAllModules().getWsModule();
        this.inscriptionsActuels = new HashMap<>();
        this.situationsPedagogique = new HashMap<>();
        this.contenu = new HashMap<>();
        /*On va commencer*/
        if (!this.remplirEtudiantws()) {
            throw new Exception("Erreur: Informations incorrectes.\n Ressayer ");
        }
        this.remplirContenu();
        this.remplirInscriptionsActuels();
        this.remplirSituationsPedagogique();
        this.remplirProfesseursActuels();
    }

    /**
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     *
     * @return
     */
    public String getCne() {
        return cne;
    }

    /**
     *
     * @return
     */
    public WsEtudiant getEtudiantws() {
        return etudiantws;
    }
    public void setEtudiantWsPwd(WsEtudiant etd,String passwd){
        this.etudiantws=etd;
        this.password=passwd;
    }
    /**
     *
     * @return
     */
    public HashMap<String, ArrayList<WsInscription>> getInscriptionsActuels() {
        return inscriptionsActuels;
    }

    /**
     *
     * @return
     */
    public HashMap<String, ArrayList<WsInscription>> getSituationsPedagogique() {
        return situationsPedagogique;
    }

    /**
     *
     * @return
     */
    public List<WsProfesseur> getProfesseursActuels() {
        return professeursActuels;
    }

    /**
     *
     * @return
     */
    public HashMap<String, ArrayList<WsModule>> getContenu() {
        return contenu;
    }

    /**
     * Méthode qui permet de récupérer le contenu du formation, et classer les
     * modules par semstres.
     */
    public void remplirContenu() {
        for (WsSemestre sm : this.allSemestres) {
            this.contenu.put(sm.getIdsem().getValue(), new ArrayList<WsModule>());
        }
        for (WsModule mdl : this.allModules) {
            this.contenu.get(mdl.getSemestre().getValue()).add(mdl);
        }
    }

    /**
     * Méthode qui permet de récupérer tous les inscriptions actuels, et les
     * classer par semstre.
     */
    public void remplirInscriptionsActuels() {
        for (WsSemestre sm : this.allSemestres) {
            this.inscriptionsActuels.put(sm.getIdsem().getValue(), new ArrayList<WsInscription>());
        }
        List<WsInscription> inscrs = Etudiant.getActualInscriptions(cne, password).getWsInscription();
        for (WsInscription ins : inscrs) {
            this.inscriptionsActuels.get(ins.getSemestre().getValue()).add(ins);
        }
        /*supprimer les semstres vides*/
        for (WsSemestre sm : this.allSemestres) {
            String idsem = sm.getIdsem().getValue();
            if (this.inscriptionsActuels.get(idsem).isEmpty()) {
                this.inscriptionsActuels.remove(idsem);
            }
        }
    }

    /**
     * Méthode qui permet de récupérer la situation pédagogique, et classer les
     * inscriptions par semestre.
     */
    public void remplirSituationsPedagogique() {
        for (WsSemestre sm : this.allSemestres) {
            this.situationsPedagogique.put(sm.getIdsem().getValue(), new ArrayList<WsInscription>());
        }
        List<WsInscription> inscrs = Etudiant.getSituationPedago(cne, password).getWsInscription();
        for (WsInscription ins : inscrs) {
            this.situationsPedagogique.get(ins.getSemestre().getValue()).add(ins);
        }
        /*supprimer les semstres vides*/
        for (WsSemestre sm : this.allSemestres) {
            String idsem = sm.getIdsem().getValue();
            if (this.situationsPedagogique.get(idsem).isEmpty()) {
                this.situationsPedagogique.remove(idsem);
            }
        }
    }

    /**
     * Méthode permet de récupérer tous les professeurs actuels (Not None).
     */
    public void remplirProfesseursActuels() {
        this.professeursActuels = Etudiant.getProfesseursActuels(cne, password).getWsProfesseur();
        Vector<WsProfesseur> prfsClean = new Vector<>();
        for (WsProfesseur prf : this.professeursActuels) {
            if (prf.getCin().getValue().equals("None")) {
                prfsClean.add(prf);
            }
        }
        this.professeursActuels.removeAll(prfsClean);
    }

    /**
     * Retourne true si l'étudiant est répérer avec succès, sinon false.
     *
     * @return
     */
    public boolean remplirEtudiantws() {
        WsEtudiant etd = Etudiant.getEtudiant(cne, password);
        String cin = etd.getCin().getValue();
        if (cin.equals("None")) {
            return false;
        }
        this.etudiantws=etd;
        return true;
    }

    /**
     * Méthode du web service pour récupérer l'étudiant à connecter (Consommteur
     * du service).
     *
     * @param cneE
     * @param passwd
     * @return
     */
    public static WsEtudiant getEtudiant(java.lang.String cneE, java.lang.String passwd) {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.getEtudiant(cneE, passwd);
    }

    /**
     * Méthode statique, du web service pour récupérer tous les modules actuels
     * de l'étudiant (Consommteur du service).
     *
     * @param cneE
     * @param passwd
     * @return
     */
    public static WsInscriptionArray getActualInscriptions(java.lang.String cneE, java.lang.String passwd) {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.getActualInscriptions(cneE, passwd);
    }

    /**
     * Méthode statique, du web service pour récupérer tous les professeurs
     * actuels de l'étudiant (Consommteur du service).
     *
     * @param cneE
     * @param passwd
     * @return
     */
    public static WsProfesseurArray getProfesseursActuels(java.lang.String cneE, java.lang.String passwd) {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.getProfesseursActuels(cneE, passwd);
    }

    /**
     * Méthode statique, du web service pour récupérer la situation pédagogique
     * de l'étudiant (Consommteur du service).
     *
     * @param cneE
     * @param passwd
     * @return
     */
    public static WsInscriptionArray getSituationPedago(java.lang.String cneE, java.lang.String passwd) {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.getSituationPedago(cneE, passwd);
    }

    /**
     * Méthode statique, du web service permet à l'étudiant (Consommteur du
     * service) de modifier leurs informations personnels (adresse, téléphone,
     * email et mot de passe.
     *
     * @param keys : tableau des clés à modifier, les deux premiers sont 'cne_e'
     * et mdp.
     * @param vals : tableau des valeurs correspondantes au keys.
     * @return
     */
    public static WsEtudiant modification(com.etudiant.StringArray keys, com.etudiant.StringArray vals) {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.modification(keys, vals);
    }

    /**
     * méthode de web service, permet de récupérer tous les modules de la
     * formations. (utilisé pour afficher à l'étudiant le contenu de sa
     * formation)
     *
     * @return
     */
    public static WsModuleArray getAllModules() {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.getAllModules();
    }

    /**
     * méthode de web service, permet de récupérer tous les semestres de la
     * formations. (utilisé pour regrouper les modules par exemples)
     *
     * @return
     */
    public static WsSemestreArray getAllSemestres() {
        com.etudiant.Application_Service service = new com.etudiant.Application_Service();
        com.etudiant.Application port = service.getApplication();
        return port.getAllSemestres();
    }

 

}
