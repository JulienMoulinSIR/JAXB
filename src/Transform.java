import java.io.FileInputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import enchere.xml.*;

public class Transform {
    public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance("enchere.xml");
            Unmarshaller u = jc.createUnmarshaller();
            EnchereType en =
                (EnchereType)u.unmarshal(new FileInputStream("test.xml"));
            
            System.out.println("Enchere: "+en.getTitre()+
    			"\nDescription: "+en.getDescriptif()+
    			"\nPrix: "+en.getPrix()+
    			"\nMeilleurPrix: "+en.getMeilleurPrix()+
    			"\nEtat: "+en.getEtat()+
    			"\nProprio: "+en.getPropriétaire().getNom()+" "+en.getPropriétaire().getPrenom());
            
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}