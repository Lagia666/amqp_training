package lernejo.chat;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ChatMessageRepository {
    private final List<String> messages = new ArrayList<>();

    void addChatMessage(String message) {
        if (messages.size() == 10) {
            messages.remove(0);
            messages.add(message);
        } else {
            messages.add(message);
        }
    }
    List<String> getLastTenMessages(){
        return messages;
    }
}
