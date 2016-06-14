package primefaces.spring.web.mbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.iop.SavarProjectService.dto.Producto;
import com.iop.SavarProjectService.service.AlmacenService;
import com.iop.SavarProjectService.service.ProductoService;

@Component
public class Mydemo {


	@Autowired(required=true)
	@Qualifier(value="almacenService")
    private AlmacenService  myService; 
	
	@Autowired(required=true)
	@Qualifier(value="productoService")
    private ProductoService  productoService; 
	
	@Autowired(required=true)
	@Qualifier(value="almacenService")
    private AlmacenService  almacenService; 

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
//        
//        Producto producto = new Producto();
//        producto.setProducto("1");
//        producto.setVolumen_m3(22.2);
//        producto.setAlm_maximo(22.2);
//        producto.setAlm_minimo(22.2);
//        producto.setEnvio_minimo(22.2);;
//        producto.setCantidad_producto(20);
//        
//        productoService.addProducto(producto);
//        productoService.getProductoById("1");
        
        almacenService.listAlmacens();
//        System.out.println("NextId>>> "+myService.getNextId());
        
        

    }

}
