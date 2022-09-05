package ru.javalang.item01simple;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * Фабричный класс для извлечения имен классов реализации и получения их экземпляров
 *
 */
public class MessageSupportFactory {
    private static MessageSupportFactory instance;

    private Properties properties;
    private MessageRenderIf messageRender;
    private MessageProviderIf messageProvider;

    static {
        instance = new MessageSupportFactory();
    }

    public static MessageSupportFactory getInstance(){
        return instance;
    }

    public MessageRenderIf getMessageRender(){return messageRender; }
    public MessageProviderIf getMessageProvider() { return messageProvider; }

    private MessageSupportFactory(){
        properties = new Properties();

        try {
            properties.load(
                    new FileInputStream("msf.properties"));
            String rendererClass = properties.getProperty("renderer.class");
            String providerClass = properties.getProperty("provider.class");
            String message = properties.getProperty("message");
            messageRender = (MessageRenderIf) Class.forName(rendererClass).getDeclaredConstructor().newInstance();
            messageProvider = (MessageProviderIf) Class.forName(providerClass).getDeclaredConstructor().newInstance();
            messageProvider.setMessage(message);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
