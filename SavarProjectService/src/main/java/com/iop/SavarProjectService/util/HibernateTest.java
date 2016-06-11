package com.iop.SavarProjectService.util;

import java.util.List;

import org.hibernate.*;

import com.iop.SavarProjectService.dao.Almacen;
 
public class HibernateTest {
 
public static void main(String[] args) {
          
        Session session = HibernateUtil.getSessionFactory().openSession();
  
        session.beginTransaction();
 
        Almacen department = new Almacen();
        department.setIdAlmacen("01");
        
        session.save(department);
 
//        session.save(new Employee("Jakab Gipsz",department));
//        session.save(new Employee("Captain Nemo",department));
      
        session.getTransaction().commit();
 
        Query q = session.createQuery("From Almacen ");
                 
        List<Almacen> resultList = q.list();
        System.out.println("num of employess:" + resultList.size());
        for (Almacen next : resultList) {
            System.out.println("next employee: " + next);
        }
 
    }
    
}
