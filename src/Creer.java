

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;

import enchere.xml.EtatEnchere;
import enchere.xml.ObjectFactory;
import enchere.xml.impl.EnchereTypeImpl;
import enchere.xml.impl.PersonneTypeImpl;

public class Creer {   
    public static void main( String[] args ) {
        try {
            JAXBContext jc = JAXBContext.newInstance( "enchere.xml" );
            ObjectFactory factory = new ObjectFactory();
            
            PersonneTypeImpl proprio = (PersonneTypeImpl) factory.createPersonneType();
            proprio.setNom("NomProprio");
            proprio.setPrenom("PrenomProprio");
            proprio.setLogin("proprio");
            proprio.setMail("proprio@mail.com");
            
            EnchereTypeImpl enchere = (EnchereTypeImpl) factory.createEnchereType();
            enchere.setPrix(50);
            enchere.setPropriétaire(proprio);
            enchere.setMeilleurPrix("50");
            enchere.setTitre("TitreEnchere");
            enchere.setDescriptif("DescriptionEnchere");
            enchere.setEtat(EtatEnchere.OUVERT);
            
            Marshaller m = jc.createMarshaller();
            m.setProperty( Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(enchere, System.out);
            File f = new File("test.xml");
            m.marshal(enchere, f);
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}