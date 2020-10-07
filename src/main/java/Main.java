import model.Client;
import model.Rollercoaster;
import model.Stallholder;
import model.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ServiceStallholder;
import service.ServiceStallholderImpl;
import service.ServiceTicket;

import java.util.ArrayList;
import java.util.List;

/*
    Amusement park:
    Клиент(client) => Кассир(stallholder) => Билет(ticket) => Американские горки(rollercoaster)
*/

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        Client client = new Client();
        Stallholder stallholder = new Stallholder();
        Ticket ticket1 = new Ticket();
        Ticket ticket2 = new Ticket();
        Rollercoaster rollercoaster = new Rollercoaster();
        List<Rollercoaster> rollercoasterList = new ArrayList<Rollercoaster>();
        List<Ticket> ticketList = new ArrayList<Ticket>();

        /* Конфигурируем "Американские горки" */
        rollercoaster.setAgeRating(18);
        rollercoaster.setWeightRating(150);
        rollercoasterList.add(rollercoaster);

        /*  Конфигурируем билет1 */
        ticket1.setDateOfSale("06.10.2020");
        ticket1.setId(1000000000000001L);
        ticket1.setListOfAttractions(rollercoasterList);
        ticketList.add(ticket1);

        /*  Конфигурируем билет2 */
        ticket2.setDateOfSale("05.10.2020");
        ticket2.setId(1000000000000002L);
        ticket2.setListOfAttractions(rollercoasterList);
        ticketList.add(ticket2);

        /*  Конфигурируем кассира */
        stallholder.setName("Galina");
        stallholder.setListOfTickets(ticketList);

        /*  Конфигурируем клиента */
        client.setName("Robert");
        client.setAge(27);
        client.setWeight(74);

        ServiceStallholder serviceStallholder = (ServiceStallholderImpl) context.getBean("serviceStallholder");
        ServiceTicket serviceTicket = (ServiceTicket) context.getBean("serviceTicket");

        System.out.println(client.toString());
        serviceStallholder.addStallholder(stallholder);
        serviceStallholder.getStallholder(stallholder);
        ticket1.setListOfAttractions(rollercoasterList);
        ticket2.setListOfAttractions(rollercoasterList);
        serviceTicket.addTicket(ticket1);
        serviceTicket.getTicket(ticket1);
        System.out.println(ticket2.toString());
        serviceTicket.getTicket(ticket2);
        System.out.println(ticket1.toString());
    }
}
