//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2015.04.24 à 01:28:01 PM CEST 
//


package enchere.xml;



/**
 * <p>Classe Java pour EnchereType complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnchereType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="propriétaire" type="{}PersonneType"/&gt;
 *         &lt;element name="MeilleurPrix" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Titre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Descriptif" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Etat" type="{}EtatEcnchere"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface EnchereType {


    /**
     * Obtient la valeur de la propriété prix.
     * 
     */
    int getPrix();

    /**
     * Définit la valeur de la propriété prix.
     * 
     */
    void setPrix(int value);

    /**
     * Obtient la valeur de la propriété propriétaire.
     * 
     * @return
     *     possible object is
     *     {@link PersonneType }
     *     
     */
    PersonneType getPropriétaire();

    /**
     * Définit la valeur de la propriété propriétaire.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneType }
     *     
     */
    void setPropriétaire(PersonneType value);

    /**
     * Obtient la valeur de la propriété meilleurPrix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getMeilleurPrix();

    /**
     * Définit la valeur de la propriété meilleurPrix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setMeilleurPrix(String value);

    /**
     * Obtient la valeur de la propriété titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitre();

    /**
     * Définit la valeur de la propriété titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitre(String value);

    /**
     * Obtient la valeur de la propriété descriptif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescriptif();

    /**
     * Définit la valeur de la propriété descriptif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescriptif(String value);

    /**
     * Obtient la valeur de la propriété etat.
     * 
     * @return
     *     possible object is
     *     {@link EtatEnchere }
     *     
     */
    EtatEnchere getEtat();

    /**
     * Définit la valeur de la propriété etat.
     * 
     * @param value
     *     allowed object is
     *     {@link EtatEnchere }
     *     
     */
    void setEtat(EtatEnchere value);

}
