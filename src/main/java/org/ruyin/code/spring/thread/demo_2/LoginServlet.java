package org.ruyin.code.spring.thread.demo_2;

public class LoginServlet {

	private static String usernameRef;
	private static String passwordRef;
	
	synchronized public static void doPost(String username,String password){
		try {
			usernameRef = username;
			if(username.equals("a")){
				Thread.sleep(2000);
			}
			passwordRef = password;
			System.out.println("username = "+usernameRef+"  password= "+password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
