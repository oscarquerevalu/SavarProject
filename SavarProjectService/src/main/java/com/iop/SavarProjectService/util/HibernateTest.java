package com.iop.SavarProjectService.util;

import java.util.List;

import org.hibernate.*;

import com.iop.SavarProjectService.dao.Almacen;
import com.iop.SavarProjectService.dao.Control;
import com.iop.SavarProjectService.dao.Resultado;
import com.iop.SavarProjectService.dao.Vehiculo;
 
public class HibernateTest {
 
public static void main(String[] args) {
          
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
 
//        Almacen department = new Almacen();
//        department.setIdAlmacen("01");
//        
//        session.save(department);
 
//        session.save(new Employee("Jakab Gipsz",department));
//        session.save(new Employee("Captain Nemo",department));
      
//        session.getTransaction().commit();
 
        Query q = session.createQuery("From Almacen ");
                 
        List<Almacen> resultList = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Almacen next : resultList) {
            System.out.println("next employee: " + next);
        }
        
        q = session.createQuery("From Resultado ");
        
        List<Resultado> resultList2 = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Resultado next : resultList2) {
            System.out.println("next employee: " + next);
        }
        
        q = session.createQuery("From Vehiculo ");
        
        List<Vehiculo> resultList3 = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Vehiculo next : resultList3) {
            System.out.println("next employee: " + next);
        }
        
        q = session.createQuery("From Control ");
        
        List<Control> resultList4 = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Control next : resultList4) {
            System.out.println("next employee: " + next);
        }
 
    }
    
}
