import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import generated.ObjectFactory;
import generated.Shiporder;

public class Main {

    public static void main(String[] args) throws JAXBException {

        ObjectFactory factory = new ObjectFactory();

        Shiporder expense = factory.createShiporder();
        expense.setOrderid("1232");


        JAXBContext context = JAXBContext.newInstance("generated");
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty("jaxb.formatted.output",Boolean.TRUE);
        marshaller.marshal(expense,System.out);
    }
}
