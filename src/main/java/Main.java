import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.ServiceStallholder;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");

        ServiceStallholder serviceStallholder = (ServiceStallholder)context.getBean("serviceStallholder");
        System.out.println(serviceStallholder.toString());
    }
}
