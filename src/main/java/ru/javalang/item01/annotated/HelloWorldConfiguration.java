package ru.javalang.item01.annotated;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.javalang.item01.decoupled.HelloWorldMessageProvider;
import ru.javalang.item01.decoupled.MessageProvider;
import ru.javalang.item01.decoupled.MessageRenderer;
import ru.javalang.item01.decoupled.StandardOutMessageRenderer;

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public MessageProvider provider() {
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer renderer(){
		MessageRenderer renderer = new StandardOutMessageRenderer();
		renderer.setMessageProvider(provider());
		return renderer;
	}
}
