
package com.etudiant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsInscriptionArray complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsInscriptionArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsInscription" type="{studyapp.wsmodels}WsInscription" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsInscriptionArray", namespace = "studyapp.wsmodels", propOrder = {
    "wsInscription"
})
public class WsInscriptionArray {

    @XmlElement(name = "WsInscription", nillable = true)
    protected List<WsInscription> wsInscription;

    /**
     * Gets the value of the wsInscription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsInscription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsInscription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsInscription }
     * 
     * 
     */
    public List<WsInscription> getWsInscription() {
        if (wsInscription == null) {
            wsInscription = new ArrayList<WsInscription>();
        }
        return this.wsInscription;
    }

}
