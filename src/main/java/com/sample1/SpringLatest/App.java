package com.sample1.SpringLatest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
/**
 * Hello world!
 */

public class App {
	
	private Sim sim;
	public void useSim() {
		
		sim.calling();
		sim.data();
	}
		public static void main(String[] args) {
	
        System.out.println("Hello World!");
       ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
      // App app= context.getBean(App.class);
       /***Sim s=(Sim) context.getBean("airtel");
        s.calling();
        s.data();******/
       // app.useSim();
       Model m= (Model) context.getBean("sims");
       System.out.println(m);
       //m.setMode("3G");
       //m.getMode();
    }
    
}
