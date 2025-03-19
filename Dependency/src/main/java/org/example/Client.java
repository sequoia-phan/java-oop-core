package org.example;

public class Client implements InjectionMessage {
    private MessageService messageService;

//    Constructor Injection
//    Client(MessageService messageService) {
//        this.messageService = messageService;
//    }

    //    Setter Injection
//    void setMessageService(MessageService messageService) {
//        this.messageService = messageService;
//    }

//    interface injection
    @Override
    public void setMessage(MessageService messageService) {
        this.messageService = messageService;
    }

    void processMessage(String string) {
        messageService.sendMessage(string);
    }


}
