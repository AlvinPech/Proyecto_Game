package zuul1;

import static zuul1.Game.parser;
import static zuul1.Game.startingRoom;

public class GamePrint {
       
    public String welcomeMessage(){
     
        String message = "Welcome to Zuul!"+"\n"+"Are you ready to have fun?\n" 
        + "If you need help you can press the button on the top left" 
        + CommandWord.HELP + "' if you need help." + "\n" 
        + "\n" + startingRoom.getLongDescription();
        System.out.print(message);
        return message;    
    }
 
    public String helpMessage() {
        
        String message = "you're lost?\n" 
        +"the commands you can write are help, go and exit" +  "\n"
        + parser.showCommands();
        System.out.println(message);
        return message;
    }
}