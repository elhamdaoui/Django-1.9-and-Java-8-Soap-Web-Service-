
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_professeurs_actuelsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_professeurs_actuelsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_professeurs_actuelsResult" type="{studyapp.wsmodels}WsProfesseurArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_professeurs_actuelsResponse", propOrder = {
    "getProfesseursActuelsResult"
})
public class GetProfesseursActuelsResponse {

    @XmlElementRef(name = "get_professeurs_actuelsResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsProfesseurArray> getProfesseursActuelsResult;

    /**
     * Obtient la valeur de la propriété getProfesseursActuelsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}
     *     
     */
    public JAXBElement<WsProfesseurArray> getGetProfesseursActuelsResult() {
        return getProfesseursActuelsResult;
    }

    /**
     * Définit la valeur de la propriété getProfesseursActuelsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}
     *     
     */
    public void setGetProfesseursActuelsResult(JAXBElement<WsProfesseurArray> value) {
        this.getProfesseursActuelsResult = value;
    }

}
