package org.testtask.commands;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
 *today - возвращает текущую дату в выбранной локале, например, "пятница, 18 марта, 2022" или "Friday, March, 18, 2022"/
 */

public class TodayCommand implements Command {

    private final String TEXT_COMMAND = "today";

    private final Locale locale;

    public TodayCommand(Locale locale){
        this.locale = locale;
    }

    @Override
    public boolean isCommand(String textCommand) {
        return TEXT_COMMAND.equalsIgnoreCase(textCommand);
    }

    @Override
    public void executeCommand() {
        Date date = new Date();
        System.out.println(new SimpleDateFormat("EEE, MMM, d, yyyy",locale).format(date));
    }
}
