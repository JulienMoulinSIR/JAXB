//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.11 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2015.04.24 � 01:28:01 PM CEST 
//


package enchere.xml;



/**
 * <p>Classe Java pour EnchereType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="EnchereType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="prix" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="propri�taire" type="{}PersonneType"/&gt;
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
     * Obtient la valeur de la propri�t� prix.
     * 
     */
    int getPrix();

    /**
     * D�finit la valeur de la propri�t� prix.
     * 
     */
    void setPrix(int value);

    /**
     * Obtient la valeur de la propri�t� propri�taire.
     * 
     * @return
     *     possible object is
     *     {@link PersonneType }
     *     
     */
    PersonneType getPropri�taire();

    /**
     * D�finit la valeur de la propri�t� propri�taire.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonneType }
     *     
     */
    void setPropri�taire(PersonneType value);

    /**
     * Obtient la valeur de la propri�t� meilleurPrix.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getMeilleurPrix();

    /**
     * D�finit la valeur de la propri�t� meilleurPrix.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setMeilleurPrix(String value);

    /**
     * Obtient la valeur de la propri�t� titre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitre();

    /**
     * D�finit la valeur de la propri�t� titre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitre(String value);

    /**
     * Obtient la valeur de la propri�t� descriptif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescriptif();

    /**
     * D�finit la valeur de la propri�t� descriptif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescriptif(String value);

    /**
     * Obtient la valeur de la propri�t� etat.
     * 
     * @return
     *     possible object is
     *     {@link EtatEnchere }
     *     
     */
    EtatEnchere getEtat();

    /**
     * D�finit la valeur de la propri�t� etat.
     * 
     * @param value
     *     allowed object is
     *     {@link EtatEnchere }
     *     
     */
    void setEtat(EtatEnchere value);

}
