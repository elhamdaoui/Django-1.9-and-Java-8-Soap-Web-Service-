
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_all_inscriptionsResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_all_inscriptionsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_all_inscriptionsResult" type="{studyapp.wsmodels}WsInscriptionArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_all_inscriptionsResponse", propOrder = {
    "getAllInscriptionsResult"
})
public class GetAllInscriptionsResponse {

    @XmlElementRef(name = "get_all_inscriptionsResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsInscriptionArray> getAllInscriptionsResult;

    /**
     * Obtient la valeur de la propriété getAllInscriptionsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}
     *     
     */
    public JAXBElement<WsInscriptionArray> getGetAllInscriptionsResult() {
        return getAllInscriptionsResult;
    }

    /**
     * Définit la valeur de la propriété getAllInscriptionsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}
     *     
     */
    public void setGetAllInscriptionsResult(JAXBElement<WsInscriptionArray> value) {
        this.getAllInscriptionsResult = value;
    }

}
