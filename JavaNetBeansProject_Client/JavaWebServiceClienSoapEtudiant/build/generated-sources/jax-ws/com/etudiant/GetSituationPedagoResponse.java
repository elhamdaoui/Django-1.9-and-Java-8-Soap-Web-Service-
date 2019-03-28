
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_situation_pedagoResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_situation_pedagoResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_situation_pedagoResult" type="{studyapp.wsmodels}WsInscriptionArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_situation_pedagoResponse", propOrder = {
    "getSituationPedagoResult"
})
public class GetSituationPedagoResponse {

    @XmlElementRef(name = "get_situation_pedagoResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsInscriptionArray> getSituationPedagoResult;

    /**
     * Obtient la valeur de la propriété getSituationPedagoResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}
     *     
     */
    public JAXBElement<WsInscriptionArray> getGetSituationPedagoResult() {
        return getSituationPedagoResult;
    }

    /**
     * Définit la valeur de la propriété getSituationPedagoResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsInscriptionArray }{@code >}
     *     
     */
    public void setGetSituationPedagoResult(JAXBElement<WsInscriptionArray> value) {
        this.getSituationPedagoResult = value;
    }

}
