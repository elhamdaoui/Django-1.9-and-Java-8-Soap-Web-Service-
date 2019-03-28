
package com.etudiant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsProfesseurArray complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsProfesseurArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsProfesseur" type="{studyapp.wsmodels}WsProfesseur" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsProfesseurArray", namespace = "studyapp.wsmodels", propOrder = {
    "wsProfesseur"
})
public class WsProfesseurArray {

    @XmlElement(name = "WsProfesseur", nillable = true)
    protected List<WsProfesseur> wsProfesseur;

    /**
     * Gets the value of the wsProfesseur property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsProfesseur property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsProfesseur().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsProfesseur }
     * 
     * 
     */
    public List<WsProfesseur> getWsProfesseur() {
        if (wsProfesseur == null) {
            wsProfesseur = new ArrayList<WsProfesseur>();
        }
        return this.wsProfesseur;
    }

}
