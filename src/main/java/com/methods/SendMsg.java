package com.methods;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;

public class SendMsg {
	
	
	public void sendMessage(){
		String accountSid = "ACaec046cb3928343183abde07d6c99fbb"; // Your Account SID from www.twilio.com/user/account
		String authToken = "b733d3f6b7242fc2316d055f5ab7c344"; // Your Auth Token from www.twilio.com/user/account

		Twilio.init(accountSid, authToken);

		final String msg = "Hello from YAOBIN LIANG CS643 Fall 2017";
		final String toNum = "19173490168"; // 1 917 349 0168
		Message message = Message.creator(new com.twilio.type.PhoneNumber(toNum) ,
				new com.twilio.type.PhoneNumber("14087586821"), msg).create();

		System.out.println(message.getSid());
	}

}
