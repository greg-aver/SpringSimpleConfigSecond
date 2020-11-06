package org.greg.project;

import org.springframework.stereotype.Component;

@Component
public class MessageProviderImpl implements MessageProvider {
    public String getMessage() {
        return "Hello World";
    }
}
