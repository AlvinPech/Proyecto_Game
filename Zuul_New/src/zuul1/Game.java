package zuul1;


public class Game 
{
    static Parser parser;
    static Room startingRoom;
    GameStructure gameStructure= new GameStructure();  
    GamePrint gamePrint= new GamePrint();

    public Game() {
        gameStructure.createRooms();
        parser = new Parser();
    }
    
    
    
    public void startGame()
    {
       GamePrint gamePrint = new GamePrint();
       gamePrint.welcomeMessage(); 
       boolean goOut=false; 
       
       while(!goOut)
       {
           Command cmd = parser.getCommand(); 
           if(executeCommand(cmd).equals("exit")){
               goOut = true;
           }
           String  msg="see you later and come back soon" ; 
           System.out.println(msg);
       }
        
        
    }
    
    
    public String executeCommand(Command cmd)
    {
     
        CommandWord cmdWord = cmd.getaCommandWord() ; 
        
        if(cmdWord== CommandWord.HELP){
             GamePrint gamePrint = new GamePrint();
             gamePrint.helpMessage(); 
        }
        
        if(cmdWord== CommandWord.GO){
           gameStructure.goRoom(cmd);
        }
        if(cmdWord== CommandWord.EXIT){
            String msg = exit(cmd);
        }
        
        if(cmdWord== CommandWord.STRANGEWORD){
             String msg = "the command is not valid"; 
             return msg;
        }
        
        
        return "";
    }  
    
    public String exit(Command cmd){
        String msg="exit"; 
        if(cmd.validateSecondaryWord()){
            msg = "want to go out?";
            
        }
    return msg;
    }
    
    //
    
    public String go(String direction) {
        return gameStructure.goRoom(new Command(CommandWord.GO, direction));        
    }
    
    
    
    
    
    
}
