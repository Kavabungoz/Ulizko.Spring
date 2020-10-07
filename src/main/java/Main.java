import model.Client;
import model.Stallholder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ServiceStallholder;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        Client client = (Client)context.getBean("client1");
        Stallholder stallholder = (Stallholder)context.getBean("stallHolder1");
        ServiceStallholder serviceStallholder = (ServiceStallholder)context.getBean("serviceStallholder");
        System.out.println(client.toString());
        System.out.println(stallholder.toString());
        serviceStallholder.addStallholder(stallholder);
    }
}
