package com.crud.demo;

import com.crud.demo.UI.UI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        context = SpringApplication.run(DemoApplication.class, args);
       System.setProperty("java.awt.headless", "false");
        // Launch Swing UI
        java.awt.EventQueue.invokeLater(() -> new UI().setVisible(true));
    }

    // Getter so UI can access beans
    public static ConfigurableApplicationContext getContext() {
        return context;
	}

}
