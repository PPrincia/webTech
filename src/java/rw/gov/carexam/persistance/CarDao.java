/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.persistance;

import java.util.List;
import net.sf.ehcache.hibernate.HibernateUtil;
import org.hibernate.Session;
import rw.gov.carexam.domain.Car;

/**
 *
 * @author Princia Pascale
 */
public class CarDao {
    
    public void create(Car car){
        Session ss = NewHibernateUtil.getSession();
        ss.beginTransaction();
        ss.save(car);
        ss.beginTransaction().commit();
        ss.close();
       
    }
    
    public void update(Car car){
        Session ss = NewHibernateUtil.getSession();
        ss.beginTransaction();
        ss.update(car);
        ss.beginTransaction().commit();
        ss.close();
    }
    
    public void delete(Car car){
        Session ss = NewHibernateUtil.getSession();
        ss.beginTransaction();
        ss.delete(car);
        ss.beginTransaction().commit();
        ss.close();
    }
    
    public Car findByPlateNo(String plateNo) {
        Session ss = NewHibernateUtil.getSession();
        Car car = (Car) ss.get(Car.class, plateNo);
        ss.close();
        return car;
    }

    public List<Car> findAll() {
        Session ss = NewHibernateUtil.getSession();
        List<Car> carList = ss.createQuery("from Car a").list();
        ss.close();
        return carList;
    }
}
