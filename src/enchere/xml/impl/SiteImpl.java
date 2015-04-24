//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.04.24 à 01:28:01 PM CEST 
//


package enchere.xml.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import enchere.xml.EnchereType;
import enchere.xml.Site;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enchere"
})
@XmlRootElement(name = "Site")
public class SiteImpl
    implements Site
{

    @XmlElement(name = "Enchere", required = true, type = EnchereTypeImpl.class)
    protected List<EnchereType> enchere;

    public List<EnchereType> getEnchere() {
        if (enchere == null) {
            enchere = new ArrayList<EnchereType>();
        }
        return this.enchere;
    }

}
