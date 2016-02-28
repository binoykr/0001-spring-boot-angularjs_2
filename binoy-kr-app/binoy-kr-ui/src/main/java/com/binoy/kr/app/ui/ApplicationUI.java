/**
 * Binoy K R Applications
 * This application development for studying and understanding the latest releasing spring 
 * application.
 */
package com.binoy.kr.app.ui;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * ApplicationUI is class is used to boot the UI application
 * 
 * @author Binoy K. R.
 * @since 1.0.0
 *
 */
@SpringBootApplication
public class ApplicationUI extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ApplicationUI.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ApplicationUI.class, args);
    }

}
