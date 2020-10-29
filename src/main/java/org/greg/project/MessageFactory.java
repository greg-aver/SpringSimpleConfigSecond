package org.greg.project;

import lombok.Getter;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;


public class MessageFactory {
    private static MessageRenderer renderer;
    private static MessageProvider provider;

    static {
        Properties properties = new Properties();
        try (InputStream in = MessageFactory.class.getClassLoader().getResourceAsStream("app.properties")) {
            properties.load(in);
            String messageProviderClass = properties.getProperty("messageProviderClass");
            String messageRenderClass = properties.getProperty("messageRenderClass");
            provider = (MessageProvider) Class.forName(messageProviderClass).newInstance();
            renderer = (MessageRenderer) Class.forName(messageRenderClass)
                    .getConstructor(MessageProvider.class).newInstance(provider);
        } catch (IOException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static MessageRenderer getRenderer() {
        return renderer;
    }

    public static MessageProvider getProvider() {
        return provider;
    }
}
