
package com.etudiant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsEtudiantArray complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsEtudiantArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsEtudiant" type="{studyapp.wsmodels}WsEtudiant" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsEtudiantArray", namespace = "studyapp.wsmodels", propOrder = {
    "wsEtudiant"
})
public class WsEtudiantArray {

    @XmlElement(name = "WsEtudiant", nillable = true)
    protected List<WsEtudiant> wsEtudiant;

    /**
     * Gets the value of the wsEtudiant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsEtudiant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsEtudiant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsEtudiant }
     * 
     * 
     */
    public List<WsEtudiant> getWsEtudiant() {
        if (wsEtudiant == null) {
            wsEtudiant = new ArrayList<WsEtudiant>();
        }
        return this.wsEtudiant;
    }

}
