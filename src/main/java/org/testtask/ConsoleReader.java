package org.testtask;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.testtask.commands.Command;

import java.util.List;
import java.util.Scanner;

@Component
public class ConsoleReader
{
   private final List<Command> commandsList;

   @Autowired
   public ConsoleReader(List<Command> commandsList){
      this.commandsList = commandsList;
   }

   public void run(){
      while(true){
         Scanner console = new Scanner(System.in);
         System.out.println("Enter command");
         String textCommand = console.nextLine();
         boolean isFindCommand = false;
         for(Command command : commandsList){
            if(command.isCommand(textCommand)){
               isFindCommand = true;
               command.executeCommand();
            }
         }
         if(isFindCommand == false){
            System.out.println("Command not found");
         }
      }
   }

}