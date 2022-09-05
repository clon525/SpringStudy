package ru.javalang.item02setter;

import org.springframework.context.support.GenericXmlApplicationContext;
import ru.javalang.item01.decoupled.MessageRenderer;

public class LazyConfigBeans {

	public static void main(String... args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:spring/app-context-lazy-xml.xml");
		ctx.refresh();
		MessageRenderer messageRenderer = ctx.getBean("renderer",
				MessageRenderer.class);
		messageRenderer.render();
		ctx.close();
	}

}
