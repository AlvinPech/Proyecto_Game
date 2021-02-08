package zuul1;


public class Game{
    
    public static Parser parser;
    static Room startingRoom;
    GameStructure gameStructure= new GameStructure();  
    GamePrint gamePrint= new GamePrint();

    public Game(){
        gameStructure.createRooms();
        parser = new Parser();
    }
    
    public void startGame(){
     
       gamePrint.welcomeMessage(); 
       boolean goOut = false; 
       while(!goOut){
           Command command = parser.getUserCommand(); 
           if( executeCommand(command).equals("exit") ){
               goOut = true;  
           }
       }  
       String  exitMessage = "see you later and come back soon"; 
       System.out.println(exitMessage);
    }
    
    public String executeCommand(Command command){
     
        CommandWord cmdWord = command.getaCommandWord(); 
        String exitMessage = "";
        
        if(cmdWord == CommandWord.STRANGEWORD){
             exitMessage = "the command is not valid"; 
             System.out.println(exitMessage);
             return exitMessage;
        }
        if(cmdWord == CommandWord.HELP){
             gamePrint.helpMessage(); 
        }
        if(cmdWord == CommandWord.GO){
           gameStructure.goRoom(command);
        }
        if(cmdWord == CommandWord.EXIT){
            exitMessage = validateExit(command); 
        }
           return exitMessage;
    }  
    
    public String validateExit(Command command){
        String exitMessage = "exit"; 
        if( command.validateSecondaryWord() ){
            exitMessage = "want to go out?";
          }
    return exitMessage;
    }

    public String go(String direction) {
        return gameStructure.goRoom(new Command(CommandWord.GO, direction));        
    }

}
