
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modification complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="modification">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="keys" type="{etudiantService}stringArray" minOccurs="0"/>
 *         &lt;element name="vals" type="{etudiantService}stringArray" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modification", propOrder = {
    "keys",
    "vals"
})
public class Modification {

    @XmlElementRef(name = "keys", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> keys;
    @XmlElementRef(name = "vals", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<StringArray> vals;

    /**
     * Obtient la valeur de la propriété keys.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getKeys() {
        return keys;
    }

    /**
     * Définit la valeur de la propriété keys.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setKeys(JAXBElement<StringArray> value) {
        this.keys = value;
    }

    /**
     * Obtient la valeur de la propriété vals.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public JAXBElement<StringArray> getVals() {
        return vals;
    }

    /**
     * Définit la valeur de la propriété vals.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link StringArray }{@code >}
     *     
     */
    public void setVals(JAXBElement<StringArray> value) {
        this.vals = value;
    }

}
