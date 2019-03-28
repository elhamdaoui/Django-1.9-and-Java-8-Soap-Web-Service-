
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_all_etudiantsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_all_etudiantsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_all_etudiantsResult" type="{studyapp.wsmodels}WsEtudiantArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_all_etudiantsResponse", propOrder = {
    "getAllEtudiantsResult"
})
public class GetAllEtudiantsResponse {

    @XmlElementRef(name = "get_all_etudiantsResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsEtudiantArray> getAllEtudiantsResult;

    /**
     * Obtient la valeur de la propriété getAllEtudiantsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsEtudiantArray }{@code >}
     *     
     */
    public JAXBElement<WsEtudiantArray> getGetAllEtudiantsResult() {
        return getAllEtudiantsResult;
    }

    /**
     * Définit la valeur de la propriété getAllEtudiantsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsEtudiantArray }{@code >}
     *     
     */
    public void setGetAllEtudiantsResult(JAXBElement<WsEtudiantArray> value) {
        this.getAllEtudiantsResult = value;
    }

}
