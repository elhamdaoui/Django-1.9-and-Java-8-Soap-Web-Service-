
package com.etudiant;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour WsModuleArray complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="WsModuleArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WsModule" type="{studyapp.wsmodels}WsModule" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsModuleArray", namespace = "studyapp.wsmodels", propOrder = {
    "wsModule"
})
public class WsModuleArray {

    @XmlElement(name = "WsModule", nillable = true)
    protected List<WsModule> wsModule;

    /**
     * Gets the value of the wsModule property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the wsModule property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWsModule().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WsModule }
     * 
     * 
     */
    public List<WsModule> getWsModule() {
        if (wsModule == null) {
            wsModule = new ArrayList<WsModule>();
        }
        return this.wsModule;
    }

}
