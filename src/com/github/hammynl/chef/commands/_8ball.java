package com.github.hammynl.chef.commands;

import java.awt.Color;

import org.javacord.api.entity.message.embed.EmbedBuilder;
import org.javacord.api.event.message.MessageCreateEvent;
import org.javacord.api.listener.message.MessageCreateListener;

import com.github.hammynl.chef.Chef;
import com.github.hammynl.chef.utilities.RandomizerUtils;

public class _8ball implements MessageCreateListener {
	
	RandomizerUtils random = new RandomizerUtils();
	Chef chef = new Chef();
	
	@Override
	public void onMessageCreate(MessageCreateEvent event) {
		if(event.getMessageContent().startsWith(chef.prefix + "8ball") && event.getMessageContent().length() >= 8) {
			String[] eightball = {"Yes.", "Maybe, Ask again later.", "I assume so.", "That is a clear no.", "No.",
					"Ask somebody else.", "Ask me later.", "Decide yourself.", "I don't think so, But Yes.",
					"I do think so, But No.", "Too lazy to give an anwser.", "Thou message has been declared as incorrect", 
					"Thou message has been declared as correct", "Heck no", "Today is Wednesday. I have a 'No on Wednesday' policy.", "N0P3" };
			
			String anwser = eightball[random.generateRandomIntInRange(0, eightball.length - 1)];
			
			EmbedBuilder embedAnwser = new EmbedBuilder()
					.setTitle(":8ball: The 8ball has decided!")
					.setDescription(anwser)
					.setColor(Color.GREEN);
			event.getChannel().sendMessage(embedAnwser);
		} else if(event.getMessageContent().startsWith(chef.prefix + "8ball") && event.getMessageContent().length() <= 8) {
			event.getChannel().sendMessage(chef.createErrorMessage("Please provide a question for the magic 8ball!"));
		}
	}
}
