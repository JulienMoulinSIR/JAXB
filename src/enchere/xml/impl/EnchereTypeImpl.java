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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import enchere.xml.EnchereType;
import enchere.xml.EtatEnchere;
import enchere.xml.PersonneType;

@XmlRootElement(name="EnchereType")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnchereType", propOrder = {
    "prix",
    "propri\u00e9taire",
    "meilleurPrix",
    "titre",
    "descriptif",
    "etat"
})
public class EnchereTypeImpl
    implements EnchereType
{

    protected int prix;
    @XmlElement(required = true, type = PersonneTypeImpl.class)
    protected PersonneTypeImpl propriétaire;
    @XmlElement(name = "MeilleurPrix", required = true)
    protected String meilleurPrix;
    @XmlElement(name = "Titre", required = true)
    protected String titre;
    @XmlElement(name = "Descriptif", required = true)
    protected String descriptif;
    @XmlElement(name = "Etat", required = true)
    @XmlSchemaType(name = "string")
    protected EtatEnchere etat;

    public int getPrix() {
        return prix;
    }

    public void setPrix(int value) {
        this.prix = value;
    }

    public PersonneType getPropriétaire() {
        return propriétaire;
    }

    public void setPropriétaire(PersonneType value) {
        this.propriétaire = ((PersonneTypeImpl) value);
    }

    public String getMeilleurPrix() {
        return meilleurPrix;
    }

    public void setMeilleurPrix(String value) {
        this.meilleurPrix = value;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String value) {
        this.titre = value;
    }

    public String getDescriptif() {
        return descriptif;
    }

    public void setDescriptif(String value) {
        this.descriptif = value;
    }

    public EtatEnchere getEtat() {
        return etat;
    }

    public void setEtat(EtatEnchere value) {
        this.etat = value;
    }

}
