package org.testtask.commands;

import org.springframework.stereotype.Component;

@Component
public class ExitCommand implements Command{

    private final String TEXT_COMMAND = "exit";

    @Override
    public boolean isCommand(String textCommand) {
        return TEXT_COMMAND.equalsIgnoreCase(textCommand);
    }

    @Override
    public void executeCommand() {
        System.exit(0);
    }
}
