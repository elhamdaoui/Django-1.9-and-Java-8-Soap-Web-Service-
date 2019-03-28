
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour get_actual_inscriptions complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="get_actual_inscriptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cne_e" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="passwd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "get_actual_inscriptions", propOrder = {
    "cneE",
    "passwd"
})
public class GetActualInscriptions {

    @XmlElementRef(name = "cne_e", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> cneE;
    @XmlElementRef(name = "passwd", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<String> passwd;

    /**
     * Obtient la valeur de la propriété cneE.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getCneE() {
        return cneE;
    }

    /**
     * Définit la valeur de la propriété cneE.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setCneE(JAXBElement<String> value) {
        this.cneE = value;
    }

    /**
     * Obtient la valeur de la propriété passwd.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPasswd() {
        return passwd;
    }

    /**
     * Définit la valeur de la propriété passwd.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPasswd(JAXBElement<String> value) {
        this.passwd = value;
    }

}
