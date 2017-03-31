package com.jsf.test;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import entities.Plantrinom;
import services.PlansTriService;

@ManagedBean(name = "helloWorld", eager = true)
@RequestScoped
public class HelloWorld {
   
	public PlansTriService plansTriService;
	
	
	
   public PlansTriService getPlansTriService() {
		return plansTriService;
	}

	public void setPlansTriService(PlansTriService plansTriService) {
		this.plansTriService = plansTriService;
	}

public HelloWorld() {
      System.out.println("HelloWorld started!");
   }
	
   public String getMessage() {
      return "Hello World! by CCH";
   }
   
   public List<Plantrinom> getAllPlans(){
	  
	   return plansTriService.AllPlans();
   }
}