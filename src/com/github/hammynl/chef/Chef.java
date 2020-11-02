package com.github.hammynl.chef;

import java.awt.Color;

import org.javacord.api.DiscordApi;
import org.javacord.api.DiscordApiBuilder;
import org.javacord.api.entity.message.embed.EmbedBuilder;

import com.github.hammynl.chef.commands._8ball;

public class Chef {
	
	public String prefix = "c.";
	
	public static void main(String[] args) {
		//Logging in the bot so he is actually online and ready to do stuff
		DiscordApi api = new DiscordApiBuilder()
				.setToken("NzY5OTk1MzgzMDcyODgyNjg4.X5XIFQ.GBzsLWCawaigPl9GSyvOZcoEtYQ")
				.login().join();
		
		// Adding a message creation listener
		api.addListener(new _8ball());
		
		api.addMessageCreateListener(event -> {
			if(event.getMessageContent().equalsIgnoreCase("c.ping")) {
				EmbedBuilder embed = new EmbedBuilder()
						.setTitle("Pong!")
						.setColor(Color.GREEN)
						.setDescription("This bot is being developed by Lars#0008");
				event.getChannel().sendMessage(embed);
				
			}
		});
		System.out.println(api.createBotInvite());
		
		
		
		
	}
	
	public EmbedBuilder createErrorMessage(String message) {
		EmbedBuilder embedAnwser = new EmbedBuilder()
				.setTitle("Error! :no_entry_sign:")
				.setDescription(message)
				.setColor(Color.RED);
		return embedAnwser;
	}
}
