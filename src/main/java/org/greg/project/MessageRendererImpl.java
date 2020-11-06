package org.greg.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("MessageRendererImpl")
public class MessageRendererImpl implements MessageRenderer{
    private final MessageProvider provider;

    @Autowired
    public MessageRendererImpl(MessageProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println("getMessage: " + provider.getMessage());
        System.out.println("provider: " + provider);
        System.out.println("toString: " + provider.toString());
    }
}
