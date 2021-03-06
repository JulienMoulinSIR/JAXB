//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.04.24 � 01:28:01 PM CEST 
//


package enchere.xml;

import javax.xml.bind.annotation.XmlRegistry;
import enchere.xml.impl.EnchereTypeImpl;
import enchere.xml.impl.PersonneTypeImpl;
import enchere.xml.impl.SiteImpl;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the enchere.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static Void _useJAXBProperties = null;

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: enchere.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Site }
     * 
     */
    public Site createSite() {
        return new SiteImpl();
    }

    /**
     * Create an instance of {@link EnchereType }
     * 
     */
    public EnchereType createEnchereType() {
        return new EnchereTypeImpl();
    }

    /**
     * Create an instance of {@link PersonneType }
     * 
     */
    public PersonneType createPersonneType() {
        return new PersonneTypeImpl();
    }

}
