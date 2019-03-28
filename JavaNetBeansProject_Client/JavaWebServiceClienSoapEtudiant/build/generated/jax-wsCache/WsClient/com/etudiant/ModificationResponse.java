
package com.etudiant;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour modificationResponse complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="modificationResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="modificationResult" type="{studyapp.wsmodels}WsEtudiant" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "modificationResponse", propOrder = {
    "modificationResult"
})
public class ModificationResponse {

    @XmlElementRef(name = "modificationResult", namespace = "etudiantService", type = JAXBElement.class, required = false)
    protected JAXBElement<WsEtudiant> modificationResult;

    /**
     * Obtient la valeur de la propriété modificationResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}
     *     
     */
    public JAXBElement<WsEtudiant> getModificationResult() {
        return modificationResult;
    }

    /**
     * Définit la valeur de la propriété modificationResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link WsEtudiant }{@code >}
     *     
     */
    public void setModificationResult(JAXBElement<WsEtudiant> value) {
        this.modificationResult = value;
    }

}
