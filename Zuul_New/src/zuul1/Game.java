package zuul1;


public class Game 
{
   static Parser parser;
    
    
    
    public void startGame()
    {
       GamePrint gamePrint = new GamePrint();
       gamePrint.welcomeMessage(); 
       boolean goOut=false; 
       
       while(!goOut)
       {
           Command cmd = parser.xxxxx(); 
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
           xxxx.xxx(cmd);
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
    
    
    
    
    
    
    
    
}
