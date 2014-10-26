package com;

import org.springframework.boot.SpringApplication;

/**
 * Created by Aaron Fleckenstein on 10/25/2014.
 */
public class Main {
    public static void main(final String args[]) {
        final SpringApplication app = new SpringApplication(Main.class);
        app.setShowBanner(false);
        app.run(SpringConfiguration.class, args);
    }
}
