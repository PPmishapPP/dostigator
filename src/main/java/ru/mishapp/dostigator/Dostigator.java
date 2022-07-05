package ru.mishapp.dostigator;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import ru.mishapp.dostigator.comand.hendlers.Command;
import ru.mishapp.dostigator.comand.hendlers.CommandHandler;

import java.util.Map;

@Service
@RequiredArgsConstructor
public class Dostigator extends TelegramLongPollingBot {

    private final Map<Command, CommandHandler> map;
    private final String token = "";
    private final String name = "";
    private final long myChatId = 800669509L;

    @Override
    public String getBotToken() {
        return token;
    }

    @Override
    @SneakyThrows
    public void onUpdateReceived(Update update) {
        String[] args = update.getMessage().getText().split(" ");



        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(update.getMessage().getChatId().toString());
        sendMessage.setText("Привет Мир!");
        execute(sendMessage);
    }

    @Override
    public String getBotUsername() {
        return name;
    }
}
