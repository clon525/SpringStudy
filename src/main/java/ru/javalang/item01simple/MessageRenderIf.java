package ru.javalang.item01simple;

/**
 * Рендеринг сообщений
 */
public interface MessageRenderIf {
    void render();
    void setMessageProvider(MessageProviderIf messageProviderIf);
    MessageProviderIf getMessageProvider();
}
