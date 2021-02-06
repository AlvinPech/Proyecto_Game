package zuul1;

import java.util.HashMap;

public class CommandWords{

    private HashMap<String, CommandWord> validCommands;

   
    public CommandWords()
    {
        validCommands = new HashMap<String, CommandWord>();
        for(CommandWord command : CommandWord.values()) {
            if(command != CommandWord.STRANGEWORD) {
                validCommands.put(command.toString(), command);
            }
        }
    }
    
    public CommandWord getCommandWord(String commandWord)
    {
        CommandWord command = validCommands.get(commandWord);
        if(command != null) {
            return command;
        }
        else {
            return CommandWord.STRANGEWORD;
        }
    }
    
   
    public boolean isCommand(String aString)
    {
        return validCommands.containsKey(aString);
    }

 
    public String showAll() 
    {
        String commands = "";
        for(String command : validCommands.keySet()) {
            commands += command + "  " + "\n";
        }
        commands += "\n";
        return commands;
    }
    
}
