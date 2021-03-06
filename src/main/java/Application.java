import gour.indrajeet.service.CustomerService;
import gour.indrajeet.service.CustomerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {

//        CustomerService customerService = new CustomerServiceImpl();

//        define the application context for read the application xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        CustomerService customerService = applicationContext.getBean("customerService",CustomerService.class);

        System.out.println(customerService.findAll().get(0).getFirstname());
        System.out.println(customerService.findAll().get(0).getLastname());

    }
}
