//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.04.24 à 01:28:01 PM CEST 
//


package enchere.xml.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import enchere.xml.PersonneType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonneType", propOrder = {
    "nom",
    "prenom",
    "login",
    "mail"
})
public class PersonneTypeImpl
    implements PersonneType
{

    @XmlElement(name = "Nom", required = true)
    protected String nom;
    @XmlElement(name = "Prenom", required = true)
    protected String prenom;
    @XmlElement(name = "Login", required = true)
    protected String login;
    @XmlElement(name = "Mail", required = true)
    protected String mail;

    public String getNom() {
        return nom;
    }

    public void setNom(String value) {
        this.nom = value;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String value) {
        this.prenom = value;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String value) {
        this.login = value;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String value) {
        this.mail = value;
    }

}
