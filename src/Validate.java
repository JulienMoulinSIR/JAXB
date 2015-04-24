import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.UnmarshalException;
import javax.xml.bind.Unmarshaller;

import enchere.xml.*;

public class Validate {
	public static void main(String[] args) {
        try {
            JAXBContext jc = JAXBContext.newInstance("enchere.xml");
            Unmarshaller u = jc.createUnmarshaller();
            EnchereType en = (EnchereType)u.unmarshal(new File("test.xml"));
            System.out.println( "validation reussie !");                       
        } catch( UnmarshalException ue ) {
            System.out.println("mauvaise validation ! " + ue.getMessage());
        } catch( Exception e ) {
            e.printStackTrace();
        }
    }
}