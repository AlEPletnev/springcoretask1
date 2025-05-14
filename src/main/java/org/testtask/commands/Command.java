package org.testtask.commands;

public interface Command {

    public boolean isCommand(String textCommand);

    public void executeCommand();
}
