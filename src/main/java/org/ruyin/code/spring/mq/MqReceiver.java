package org.ruyin.code.spring.mq;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;

public class MqReceiver {

	public void receiveMsg() throws Exception{
		ConnectionFactory factory = new ActiveMQConnectionFactory();
		Connection connection = factory.createConnection();
		
		connection.start();
		
		Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
		Destination destination = session.createQueue("my-queue");
		MessageConsumer consumer = session.createConsumer(destination);
		
		int i =0;
		while(i<3){
			i++;
			TextMessage message = (TextMessage) consumer.receive();
			session.commit();
			System.out.println("Received message :"+message.getText());
		}
		
		session.close();
		connection.close();
	}
	
	public static void main(String[] args) throws Exception {
		new MqReceiver().receiveMsg();
	}
}
