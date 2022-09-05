package ru.javalang.item01simple;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationMessage {

    @Bean
    public MessageProviderIf provider(){
        MessageProviderIf provider = new MessageProvider();
        provider.setMessage("Hello!");
        return provider;
    }

    @Bean
    public MessageRenderIf render(){
        MessageRenderIf render = new StandartOutMessageRenderer();
        render.setMessageProvider(provider());
        return render;
    }
}
