package com.knoldus;

public class MessagePrinter {
    private MessageService messageService;

    public MessageService getMessageService() {
        return messageService;
    }

    public void setMessageService(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage(){
        System.out.println(messageService.getMessage());
    }
}
