
package com.etudiant;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsInscription complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsInscription">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description_prof" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="prof_prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prof_nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noteN" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="anneUniver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="id_m" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nb_inscrit" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nom_module" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cne_etudiant" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsInscription", namespace = "studyapp.wsmodels", propOrder = {
    "semestre",
    "descriptionProf",
    "noteR",
    "profPrenom",
    "profNom",
    "noteN",
    "anneUniver",
    "idM",
    "nbInscrit",
    "nomModule",
    "cneEtudiant"
})
public class WsInscription {

    @XmlElementRef(name = "semestre", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> semestre;
    @XmlElementRef(name = "description_prof", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> descriptionProf;
    @XmlElementRef(name = "noteR", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> noteR;
    @XmlElementRef(name = "prof_prenom", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profPrenom;
    @XmlElementRef(name = "prof_nom", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> profNom;
    @XmlElementRef(name = "noteN", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> noteN;
    @XmlElementRef(name = "anneUniver", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anneUniver;
    @XmlElementRef(name = "id_m", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idM;
    @XmlElementRef(name = "nb_inscrit", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> nbInscrit;
    @XmlElementRef(name = "nom_module", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nomModule;
    @XmlElementRef(name = "cne_etudiant", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cneEtudiant;

    /**
     * Obtient la valeur de la propriété semestre.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSemestre() {
        return semestre;
    }

    /**
     * Définit la valeur de la propriété semestre.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSemestre(JAXBElement<String> value) {
        this.semestre = value;
    }

    /**
     * Obtient la valeur de la propriété descriptionProf.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescriptionProf() {
        return descriptionProf;
    }

    /**
     * Définit la valeur de la propriété descriptionProf.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescriptionProf(JAXBElement<String> value) {
        this.descriptionProf = value;
    }

    /**
     * Obtient la valeur de la propriété noteR.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNoteR() {
        return noteR;
    }

    /**
     * Définit la valeur de la propriété noteR.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNoteR(JAXBElement<BigDecimal> value) {
        this.noteR = value;
    }

    /**
     * Obtient la valeur de la propriété profPrenom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfPrenom() {
        return profPrenom;
    }

    /**
     * Définit la valeur de la propriété profPrenom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfPrenom(JAXBElement<String> value) {
        this.profPrenom = value;
    }

    /**
     * Obtient la valeur de la propriété profNom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProfNom() {
        return profNom;
    }

    /**
     * Définit la valeur de la propriété profNom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProfNom(JAXBElement<String> value) {
        this.profNom = value;
    }

    /**
     * Obtient la valeur de la propriété noteN.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public JAXBElement<BigDecimal> getNoteN() {
        return noteN;
    }

    /**
     * Définit la valeur de la propriété noteN.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     *     
     */
    public void setNoteN(JAXBElement<BigDecimal> value) {
        this.noteN = value;
    }

    /**
     * Obtient la valeur de la propriété anneUniver.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAnneUniver() {
        return anneUniver;
    }

    /**
     * Définit la valeur de la propriété anneUniver.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAnneUniver(JAXBElement<String> value) {
        this.anneUniver = value;
    }

    /**
     * Obtient la valeur de la propriété idM.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdM() {
        return idM;
    }

    /**
     * Définit la valeur de la propriété idM.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdM(JAXBElement<String> value) {
        this.idM = value;
    }

    /**
     * Obtient la valeur de la propriété nbInscrit.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNbInscrit() {
        return nbInscrit;
    }

    /**
     * Définit la valeur de la propriété nbInscrit.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNbInscrit(JAXBElement<BigInteger> value) {
        this.nbInscrit = value;
    }

    /**
     * Obtient la valeur de la propriété nomModule.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNomModule() {
        return nomModule;
    }

    /**
     * Définit la valeur de la propriété nomModule.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNomModule(JAXBElement<String> value) {
        this.nomModule = value;
    }

    /**
     * Obtient la valeur de la propriété cneEtudiant.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCneEtudiant() {
        return cneEtudiant;
    }

    /**
     * Définit la valeur de la propriété cneEtudiant.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCneEtudiant(JAXBElement<String> value) {
        this.cneEtudiant = value;
    }

}
