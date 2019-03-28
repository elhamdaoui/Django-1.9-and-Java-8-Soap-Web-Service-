
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_all_professeursResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_all_professeursResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_all_professeursResult" type="{studyapp.wsmodels}WsProfesseurArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_all_professeursResponse", propOrder = {
    "getAllProfesseursResult"
})
public class GetAllProfesseursResponse {

    @XmlElementRef(name = "get_all_professeursResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsProfesseurArray> getAllProfesseursResult;

    /**
     * Obtient la valeur de la propriété getAllProfesseursResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}
     *     
     */
    public JAXBElement<WsProfesseurArray> getGetAllProfesseursResult() {
        return getAllProfesseursResult;
    }

    /**
     * Définit la valeur de la propriété getAllProfesseursResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsProfesseurArray }{@code >}
     *     
     */
    public void setGetAllProfesseursResult(JAXBElement<WsProfesseurArray> value) {
        this.getAllProfesseursResult = value;
    }

}
