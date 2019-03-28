
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_all_semestresResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_all_semestresResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="get_all_semestresResult" type="{studyapp.wsmodels}WsSemestreArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_all_semestresResponse", propOrder = {
    "getAllSemestresResult"
})
public class GetAllSemestresResponse {

    @XmlElementRef(name = "get_all_semestresResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsSemestreArray> getAllSemestresResult;

    /**
     * Obtient la valeur de la propriété getAllSemestresResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsSemestreArray }{@code >}
     *     
     */
    public JAXBElement<WsSemestreArray> getGetAllSemestresResult() {
        return getAllSemestresResult;
    }

    /**
     * Définit la valeur de la propriété getAllSemestresResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsSemestreArray }{@code >}
     *     
     */
    public void setGetAllSemestresResult(JAXBElement<WsSemestreArray> value) {
        this.getAllSemestresResult = value;
    }

}
