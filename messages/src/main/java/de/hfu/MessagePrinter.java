package de.hfu;

import de.hfu.messages.domain.model.Message;
import de.hfu.messages.domain.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class MessagePrinter {
	
	@Autowired
	private MessageService messageService;
	
	
	
	
	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(
			MessageService messageService) {
			this.messageService = messageService;
			}

	public void outputMessages(String author) {
	for (Message message : messageService.findMessages()) {
		if (message.getAuthor().equals(author)) {
			System.out.println(message);
			}
	}
	}
	
	
}
