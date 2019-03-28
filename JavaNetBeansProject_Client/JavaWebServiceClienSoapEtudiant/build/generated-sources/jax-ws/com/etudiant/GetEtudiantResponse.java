
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_etudiantResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_etudiantResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_etudiantResult" type="{studyapp.wsmodels}WsEtudiant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_etudiantResponse", propOrder = {
    "getEtudiantResult"
})
public class GetEtudiantResponse {

    @XmlElementRef(name = "get_etudiantResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsEtudiant> getEtudiantResult;

    /**
     * Obtient la valeur de la propriété getEtudiantResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}
     *     
     */
    public JAXBElement<WsEtudiant> getGetEtudiantResult() {
        return getEtudiantResult;
    }

    /**
     * Définit la valeur de la propriété getEtudiantResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}
     *     
     */
    public void setGetEtudiantResult(JAXBElement<WsEtudiant> value) {
        this.getEtudiantResult = value;
    }

}
