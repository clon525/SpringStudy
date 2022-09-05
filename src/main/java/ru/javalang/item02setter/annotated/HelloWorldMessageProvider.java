package ru.javalang.item02setter.annotated;

import org.springframework.stereotype.Component;
import ru.javalang.item01.decoupled.MessageProvider;

@Component("provider")
public class HelloWorldMessageProvider implements MessageProvider {

	@Override
	public String getMessage() {
		return "Hello World!";
	}
}
