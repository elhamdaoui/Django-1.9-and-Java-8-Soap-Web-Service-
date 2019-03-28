
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour showsDevloppersResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="showsDevloppersResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="showsDevloppersResult" type="{etudiantService}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showsDevloppersResponse", propOrder = {
    "showsDevloppersResult"
})
public class ShowsDevloppersResponse {

    @XmlElementRef(name = "showsDevloppersResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> showsDevloppersResult;

    /**
     * Obtient la valeur de la propriété showsDevloppersResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getShowsDevloppersResult() {
        return showsDevloppersResult;
    }

    /**
     * Définit la valeur de la propriété showsDevloppersResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setShowsDevloppersResult(JAXBElement<StringArray> value) {
        this.showsDevloppersResult = value;
    }

}
