package org.ruyin.code.spring.mq;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class MyMsgListener implements MessageListener{

	@Override
	public void onMessage(Message msg) {
		TextMessage message = (TextMessage) msg;
		
		try {
			System.out.println("Is this?"+message.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

}
