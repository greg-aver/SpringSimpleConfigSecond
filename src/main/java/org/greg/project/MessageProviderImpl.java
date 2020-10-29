package org.greg.project;

import lombok.NoArgsConstructor;

//@NoArgsConstructor
public class MessageProviderImpl implements MessageProvider {
    public String getMessage() {
        return "Hello World";
    }
}
