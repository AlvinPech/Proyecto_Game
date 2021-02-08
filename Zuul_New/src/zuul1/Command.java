package zuul1;

public class Command
{

    private CommandWord aCommandWord; 
    private String secondaryWord; 

    public Command(CommandWord aCommandWord, String secondaryWord){
        this.aCommandWord = aCommandWord;
        this.secondaryWord = secondaryWord;
    }
   
    public CommandWord getaCommandWord(){
        return aCommandWord;
    }
    
    public void setaCommandWord(CommandWord aCommandWord){
        this.aCommandWord = aCommandWord;
    }
    
    public String getSecondaryWord(){
        return secondaryWord;
    }
    
    public void setSecondaryWord(String secondaryWord){
        this.secondaryWord = secondaryWord;
    }
    
   public boolean validateSecondaryWord (){
        return(secondaryWord != null);
    }
    
    public boolean validateUnknownCommands (){
        return(aCommandWord == CommandWord.STRANGEWORD);
    }
}


