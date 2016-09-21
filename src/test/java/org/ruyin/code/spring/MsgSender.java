package org.ruyin.code.spring;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;

public class MsgSender {

	static ApplicationContext context;
	static JmsTemplate template;
	static Destination destination;
	
	static{
		context = new ClassPathXmlApplicationContext("application-context.xml");
		template = (JmsTemplate) context.getBean("jmsTemplate");
		destination = (Destination) context.getBean("destination");
	}
	
	@Test
	public void sendMsg(){
		template.send(destination,new MessageCreator() {
			
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage("This just test!");
			}
		});
	}
	
	@Test
	public void receiveMsg() throws JMSException{
		TextMessage msg = (TextMessage) template.receive(destination);
		System.out.println("Received msg is:"+msg.getText());
	}
}
