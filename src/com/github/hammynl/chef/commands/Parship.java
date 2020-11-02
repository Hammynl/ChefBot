package com.github.hammynl.chef.commands;

import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import com.github.hammynl.chef.Chef;

public class Parship implements MessageCreateListener{

	Chef chef = new Chef();
	
	@Override
	public void onMessageCreate(MessageCreateEvent event) {
		//if(event.getMessageContent().startsWith(chef.prefix + "shipme") && event.getMessage().getmen) {
			
		//}
		
	}

}
