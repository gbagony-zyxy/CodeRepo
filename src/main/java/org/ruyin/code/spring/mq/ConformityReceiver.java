package org.ruyin.code.spring.mq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;

public class ConformityReceiver {

	private static Logger logger = LoggerFactory.getLogger(ConformityReceiver.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) throws JMSException {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

		JmsTemplate template = (JmsTemplate) context.getBean("jmsTemplate");
		Destination destination = (Destination) context.getBean("destination");

		logger.info("Receive start...");
		TextMessage message = (TextMessage) template.receive(destination);
		System.out.println("消息:" + message.getText());
	}
}
