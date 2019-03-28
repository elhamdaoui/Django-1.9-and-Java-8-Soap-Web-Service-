
package com.etudiant;

import java.math.BigInteger;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsEtudiant complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsEtudiant">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_inscription" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prenom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mdp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeLicence" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="anneUniver" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="cin" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telephone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="orderAdmis" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="cne" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="ddn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="date_ajt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsEtudiant", namespace = "studyapp.wsmodels", propOrder = {
    "numInscription",
    "nom",
    "prenom",
    "mdp",
    "typeLicence",
    "anneUniver",
    "adresse",
    "cin",
    "telephone",
    "orderAdmis",
    "cne",
    "ddn",
    "dateAjt",
    "email",
    "description"
})
public class WsEtudiant {

    @XmlElementRef(name = "num_inscription", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> numInscription;
    @XmlElementRef(name = "nom", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nom;
    @XmlElementRef(name = "prenom", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prenom;
    @XmlElementRef(name = "mdp", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> mdp;
    @XmlElementRef(name = "typeLicence", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> typeLicence;
    @XmlElementRef(name = "anneUniver", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> anneUniver;
    @XmlElementRef(name = "adresse", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> adresse;
    @XmlElementRef(name = "cin", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cin;
    @XmlElementRef(name = "telephone", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> telephone;
    @XmlElementRef(name = "orderAdmis", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> orderAdmis;
    @XmlElementRef(name = "cne", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<BigInteger> cne;
    @XmlElementRef(name = "ddn", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> ddn;
    @XmlElementRef(name = "date_ajt", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> dateAjt;
    @XmlElementRef(name = "email", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "description", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;

    /**
     * Obtient la valeur de la propriété numInscription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getNumInscription() {
        return numInscription;
    }

    /**
     * Définit la valeur de la propriété numInscription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setNumInscription(JAXBElement<BigInteger> value) {
        this.numInscription = value;
    }

    /**
     * Obtient la valeur de la propriété nom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getNom() {
        return nom;
    }

    /**
     * Définit la valeur de la propriété nom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setNom(JAXBElement<String> value) {
        this.nom = value;
    }

    /**
     * Obtient la valeur de la propriété prenom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrenom() {
        return prenom;
    }

    /**
     * Définit la valeur de la propriété prenom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrenom(JAXBElement<String> value) {
        this.prenom = value;
    }

    /**
     * Obtient la valeur de la propriété mdp.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMdp() {
        return mdp;
    }

    /**
     * Définit la valeur de la propriété mdp.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMdp(JAXBElement<String> value) {
        this.mdp = value;
    }

    /**
     * Obtient la valeur de la propriété typeLicence.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTypeLicence() {
        return typeLicence;
    }

    /**
     * Définit la valeur de la propriété typeLicence.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTypeLicence(JAXBElement<String> value) {
        this.typeLicence = value;
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
     * Obtient la valeur de la propriété adresse.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAdresse() {
        return adresse;
    }

    /**
     * Définit la valeur de la propriété adresse.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAdresse(JAXBElement<String> value) {
        this.adresse = value;
    }

    /**
     * Obtient la valeur de la propriété cin.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCin() {
        return cin;
    }

    /**
     * Définit la valeur de la propriété cin.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCin(JAXBElement<String> value) {
        this.cin = value;
    }

    /**
     * Obtient la valeur de la propriété telephone.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTelephone() {
        return telephone;
    }

    /**
     * Définit la valeur de la propriété telephone.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTelephone(JAXBElement<String> value) {
        this.telephone = value;
    }

    /**
     * Obtient la valeur de la propriété orderAdmis.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getOrderAdmis() {
        return orderAdmis;
    }

    /**
     * Définit la valeur de la propriété orderAdmis.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setOrderAdmis(JAXBElement<BigInteger> value) {
        this.orderAdmis = value;
    }

    /**
     * Obtient la valeur de la propriété cne.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public JAXBElement<BigInteger> getCne() {
        return cne;
    }

    /**
     * Définit la valeur de la propriété cne.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     *     
     */
    public void setCne(JAXBElement<BigInteger> value) {
        this.cne = value;
    }

    /**
     * Obtient la valeur de la propriété ddn.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDdn() {
        return ddn;
    }

    /**
     * Définit la valeur de la propriété ddn.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDdn(JAXBElement<String> value) {
        this.ddn = value;
    }

    /**
     * Obtient la valeur de la propriété dateAjt.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDateAjt() {
        return dateAjt;
    }

    /**
     * Définit la valeur de la propriété dateAjt.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDateAjt(JAXBElement<String> value) {
        this.dateAjt = value;
    }

    /**
     * Obtient la valeur de la propriété email.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Définit la valeur de la propriété email.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Obtient la valeur de la propriété description.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDescription() {
        return description;
    }

    /**
     * Définit la valeur de la propriété description.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDescription(JAXBElement<String> value) {
        this.description = value;
    }

}
