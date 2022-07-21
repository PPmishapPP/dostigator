package ru.mishapp.dostigator;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import ru.mishapp.dostigator.comand.hendlers.Command;
import ru.mishapp.dostigator.comand.hendlers.CommandHandler;

import java.util.Map;

@Service
@PropertySource("classpath:dev.properties")
public class Dostigator extends TelegramLongPollingBot {

    public Dostigator(Map<Command, CommandHandler> map) {
        this.map = map;
    }

    private final Map<Command, CommandHandler> map;


    @Value("${token}")
    private String token;
    @Value("${name}")
    private String name;
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
