package org.ruyin.code.spring.mq;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class ConformitySender {

	private static Logger logger = LoggerFactory.getLogger(ConformitySender.class);
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		JmsTemplate template = (JmsTemplate)context.getBean("jmsTemplate");
		Destination destination = (Destination) context.getBean("destination");
		logger.info("Send start...");
		template.send(destination, new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("测试信息");
			}
		});
	}
}
