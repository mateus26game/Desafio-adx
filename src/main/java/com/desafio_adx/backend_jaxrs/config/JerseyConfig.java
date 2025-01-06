package com.desafio_adx.backend_jaxrs.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig(){
        packages("com.desafio_adx.backend_jaxrs.controller");

        property("jersey.config.server.provider.packages", "com.desafio_adx.backend_jaxrs.controller");
        packages("org.glassfish.jersey.media.multipart");
    }
}
