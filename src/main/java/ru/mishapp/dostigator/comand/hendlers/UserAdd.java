package ru.mishapp.dostigator.comand.hendlers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import ru.mishapp.dostigator.dao.UserRepository;

import java.util.List;

@Component
public class UserAdd implements CommandHandler {

    private final UserRepository userRepository;

    public UserAdd(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<SendMessage> handle(String message) {
        return null;
    }

    @Override
    public Command getCommand() {
        return Command.ADD;
    }
}
