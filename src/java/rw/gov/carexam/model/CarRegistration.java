/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rw.gov.carexam.model;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import rw.gov.carexam.domain.Car;
import rw.gov.carexam.persistance.CarDao;

/**
 *
 * @author Princia Pascale
 */
@ManagedBean(name = "creg" )
public class CarRegistration {
    
    private Car car = new Car();
    private CarDao carDao = new CarDao();
    private String action = "register";
    
    public String registerCar(){
       try{
            //if(action.equals("register"))
            carDao.create(car);
            FacesMessage msg = new FacesMessage("Thank you for registering " +car.getModel()+" "+car.getPlateNo());
            FacesContext.getCurrentInstance().addMessage(null, msg);
            return "registerCarList";
        }catch(Exception ex){
            FacesMessage msg = new FacesMessage("failed to register " +car.getPlateNo());
            FacesContext.getCurrentInstance().addMessage(null, msg);           
            return "carRegistrationForm";
        }
    }
    
    public String deleteCar(Car car){
        this.car = car;
        this.action = "delete";
        return "carRegistrationForm";
    }
    
    public String updateCar(Car car){
        this.car = car;
        this.action = "update";
        return "carRegistrationForm";
    }
    
    public Car getCar(){
        return car;
    }

    public CarDao getCarDao() {
        return carDao;
    }

    public void setCarDao(CarDao carDao) {
        this.carDao = carDao;
    }
    
    public List<Car> getCarList() {
        return carDao.findAll();
    }

    public String getAction() {
        return action;
    }
    
   

}
