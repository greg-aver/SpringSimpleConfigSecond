package org.greg.project;

public class MessageRendererImpl implements MessageRenderer{
    private final MessageProvider provider;

    public MessageRendererImpl(MessageProvider provider) {
        this.provider = provider;
    }

    public void render() {
        System.out.println("getMessage: " + provider.getMessage());
        System.out.println("provider: " + provider);
        System.out.println("toString: " + provider.toString());
    }
}
