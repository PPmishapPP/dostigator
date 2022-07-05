package ru.mishapp.dostigator.comand.hendlers;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.List;

public interface CommandHandler {

    List<SendMessage> handle(String message);

    Command getCommand();
}
