package ru.mishapp.dostigator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.mishapp.dostigator.comand.hendlers.Command;
import ru.mishapp.dostigator.comand.hendlers.CommandHandler;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Configuration
public class Config {
    @Bean
    public Map<Command, CommandHandler> getCommandHandlerMap(List<CommandHandler> handlers) {
        return handlers.stream().collect(Collectors.toMap(CommandHandler::getCommand, Function.identity()));
    }
}
