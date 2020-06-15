package com.task2.Task2_Challenge;
import org.kie.api.KieServices;

import model.*;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class App {

    public static void main(String []args) {
        try {
	        // Launch the knowledge base 
        	
        	KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	// Declare the important variables to verify the correct usage of the drools rules engine
        	
        	User user1 = new User(1,"Lara",21,false,65);// false corresponds to prepaid card type
        	Prepaid p = new Prepaid().newPrepaid(user1);
        	p.setMaxQty(700);
        	p.setMinQty(100);
        	p.setId(55678); // predit card id
        	p.setCvv2("5678"); // verification code
        	User user2 = new User(2,"Loai", 23,true,235 ); // true corresponds to credit card type
        	Credit c = new Credit().newCredit(user2);
        	c.setMinQty(100);
        	c.setMaxQty(2500);
        	c.setMonthlyFees(3);
        	c.setId(12543);// credit card id
        	c.setCvv2("2543"); // verification code
//        	kSession.insert(user1);
        	kSession.insert(p);
//        	kSession.insert(user2);
        	kSession.insert(c);
        	
        	System.out.println("Fire All Rules!\n");
        	System.out.println("----------");
            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

  

}
