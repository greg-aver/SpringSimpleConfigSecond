package org.greg.project;

public class Main {
    public static void main(String[] args) {
//        MessageProvider provider = new MessageProviderImpl();
        MessageProvider provider = MessageFactory.getProvider();

        MessageRenderer renderer = MessageFactory.getRenderer();
        renderer.render();
    }
}
