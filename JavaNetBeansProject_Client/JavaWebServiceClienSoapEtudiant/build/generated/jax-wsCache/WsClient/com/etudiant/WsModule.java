
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsModule complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsModule">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="semestre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idm_eq" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="idm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="prof" type="{studyapp.wsmodels}WsProfesseur" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsModule", namespace = "studyapp.wsmodels", propOrder = {
    "semestre",
    "nom",
    "description",
    "idmEq",
    "idm",
    "prof"
})
public class WsModule {

    @XmlElementRef(name = "semestre", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> semestre;
    @XmlElementRef(name = "nom", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> nom;
    @XmlElementRef(name = "description", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> description;
    @XmlElementRef(name = "idm_eq", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idmEq;
    @XmlElementRef(name = "idm", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<String> idm;
    @XmlElementRef(name = "prof", namespace = "studyapp.wsmodels", type = JAXBElement.class, required = false)
    protected JAXBElement<WsProfesseur> prof;

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

    /**
     * Obtient la valeur de la propriété idmEq.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdmEq() {
        return idmEq;
    }

    /**
     * Définit la valeur de la propriété idmEq.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdmEq(JAXBElement<String> value) {
        this.idmEq = value;
    }

    /**
     * Obtient la valeur de la propriété idm.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getIdm() {
        return idm;
    }

    /**
     * Définit la valeur de la propriété idm.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setIdm(JAXBElement<String> value) {
        this.idm = value;
    }

    /**
     * Obtient la valeur de la propriété prof.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsProfesseur }{@code >}
     *     
     */
    public JAXBElement<WsProfesseur> getProf() {
        return prof;
    }

    /**
     * Définit la valeur de la propriété prof.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsProfesseur }{@code >}
     *     
     */
    public void setProf(JAXBElement<WsProfesseur> value) {
        this.prof = value;
    }

}
