
package com.etudiant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsSemestreArray complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsSemestreArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsSemestre" type="{studyapp.wsmodels}WsSemestre" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsSemestreArray", namespace = "studyapp.wsmodels", propOrder = {
    "wsSemestre"
})
public class WsSemestreArray {

    @XmlElement(name = "WsSemestre", nillable = true)
    protected List<WsSemestre> wsSemestre;

    /**
     * Gets the value of the wsSemestre property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsSemestre property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsSemestre().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsSemestre }
     * 
     * 
     */
    public List<WsSemestre> getWsSemestre() {
        if (wsSemestre == null) {
            wsSemestre = new ArrayList<WsSemestre>();
        }
        return this.wsSemestre;
    }

}
