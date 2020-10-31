package org.cap.apps.customer;

import org.cap.apps.customer.ui.ProjectUi;
import org.cap.apps.customer.ProjectMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class ProjectMain {
	
	 public static void main(String args[]) {
	        ConfigurableApplicationContext context = SpringApplication.run(ProjectMain.class, args);
	        ProjectUi ui = context.getBean(ProjectUi.class);
	        ui.runUi();
	        context.close();
	    }

}
