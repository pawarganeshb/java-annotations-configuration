package com.main.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.Students;
import com.app.config.ConfigurationFig;

// Main class to run the application
public class Main {

    // Main method
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Create application context using the configuration class
        AnnotationConfigApplicationContext acp = new AnnotationConfigApplicationContext(ConfigurationFig.class);
        
        // Retrieve the student bean from the application context
        Students student1 = (Students) acp.getBean("student");
        
        // Print the student object
        System.out.println(student1);
        
        Students student2 = (Students) acp.getBean("student");
        System.out.println(student2); //Will print same hash code
    }
}