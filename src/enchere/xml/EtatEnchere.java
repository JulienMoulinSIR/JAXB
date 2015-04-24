//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.04.24 � 01:28:01 PM CEST 
//


package enchere.xml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour EtatEcnchere.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="EtatEcnchere"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ouvert"/&gt;
 *     &lt;enumeration value="ferm�"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "EtatEcnchere")
@XmlEnum
public enum EtatEnchere {

    @XmlEnumValue("ouvert")
    OUVERT("ouvert"),
    @XmlEnumValue("ferm\u00e9")
    FERM�("ferm\u00e9");
    private final String value;

    EtatEnchere(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EtatEnchere fromValue(String v) {
        for (EtatEnchere c: EtatEnchere.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
