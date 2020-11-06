package org.greg.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

//Analogue context.xml
public class SpringConfig {
    @Bean
    public MessageProvider provider() {
        return new MessageProviderImpl();
    }

    @Bean
    public MessageRenderer renderer(@Autowired MessageProvider provider) {
        return new MessageRendererImpl(provider);
    }
}
