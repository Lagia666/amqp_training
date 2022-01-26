package fr.lernejo.chat.fr.lernejo.chat;

import org.springframework.stereotype.Component;

@Component
public class ChatMessageListener {

    public void onMessage(String mess){
        System.out.print(mess);
    }
}


