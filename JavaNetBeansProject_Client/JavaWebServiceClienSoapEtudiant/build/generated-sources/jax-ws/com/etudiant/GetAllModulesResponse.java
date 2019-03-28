
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_all_modulesResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_all_modulesResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_all_modulesResult" type="{studyapp.wsmodels}WsModuleArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_all_modulesResponse", propOrder = {
    "getAllModulesResult"
})
public class GetAllModulesResponse {

    @XmlElementRef(name = "get_all_modulesResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsModuleArray> getAllModulesResult;

    /**
     * Obtient la valeur de la propriété getAllModulesResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsModuleArray }{@code >}
     *     
     */
    public JAXBElement<WsModuleArray> getGetAllModulesResult() {
        return getAllModulesResult;
    }

    /**
     * Définit la valeur de la propriété getAllModulesResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsModuleArray }{@code >}
     *     
     */
    public void setGetAllModulesResult(JAXBElement<WsModuleArray> value) {
        this.getAllModulesResult = value;
    }

}
