package org.testtask.commands;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *today-iso - возвращает текущую дату в стандартном виде, независимо от локали, например, "2022-03-18"
*/

@Component
public class ToDayISOCommand implements Command {

    private final String TEXT_COMMAND = "today-iso";

    @Override
    public boolean isCommand(String textCommand) {
        return TEXT_COMMAND.equalsIgnoreCase(textCommand);
    }

    @Override
    public void executeCommand() {
        Date date = new Date();
        System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(date));
    }
}
