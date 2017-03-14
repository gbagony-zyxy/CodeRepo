package org.ruyin.code.spring;

import com.qianzhui.jishulink.domain.model.trade.model.PaymentCallback;
import org.apache.activemq.protobuf.BufferInputStream;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.util.List;

public class XmlParseTest {

	public static void main(String[] args) throws Exception {
		SAXReader sr = new SAXReader();
		Document doc = sr.read(new BufferInputStream("<?xml version='1.0' encoding='UTF-8' standalone='no'?><Request><Head><TxCode>1318</TxCode></Head><Body><InstitutionID>002330</InstitutionID><PaymentNo>201610131647088383741465726</PaymentNo><Amount>3000</Amount><Status>20</Status><BankNotificationTime>20161013164731</BankNotificationTime></Body></Request>".getBytes()));
		Element root = doc.getRootElement();
		List<Element> elements = root.elements();
		PaymentCallback bCallback = new PaymentCallback();
		for(Element e : elements){
			bCallback.setAmount(e.elementText("Amount"));
			bCallback.setInstitutionId(e.elementText("InstitutionID"));
			bCallback.setBankNotificationTime(e.elementText("BankNotificationTime"));
			bCallback.setStatus(e.elementText("Status"));
			bCallback.setTradeId(e.elementText("PaymentNo"));
		}
		
		System.out.println(bCallback);
	}
}
