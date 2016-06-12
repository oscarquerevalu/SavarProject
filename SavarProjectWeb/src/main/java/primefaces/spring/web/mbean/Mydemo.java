package primefaces.spring.web.mbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.iop.SavarProjectService.service.AlmacenService;

@Component
public class Mydemo {


	@Autowired(required=true)
	@Qualifier(value="almacenService")
    private AlmacenService  myService; 

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
            System.out.println("test");
            ApplicationContext ctx=new ClassPathXmlApplicationContext("spring-web-config.xml");
            System.out.println("ctx>>"+ctx);

            Mydemo myDemo=ctx.getBean(Mydemo.class);
            System.out.println(myDemo);
            myDemo.callService(ctx);


    }

    public void callService(ApplicationContext ctx) {
        // TODO Auto-generated method stub
        System.out.println("---callService---");
        System.out.println(myService);
        myService.getAlmacenById("");

    }

}
