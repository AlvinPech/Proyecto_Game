package zuul1;

public class Command
{

    private CommandWord aCommandWord; 
    private String secondaryWord; 

    
    
    // método constructor
    public Command(CommandWord aCommandWord, String secondaryWord) 
    {
        this.aCommandWord = aCommandWord;
        this.secondaryWord = secondaryWord;
    }
    
    //

    public CommandWord getaCommandWord() 
    {
        return aCommandWord;
    }
    public void setaCommandWord(CommandWord aCommandWord)
    {
        this.aCommandWord = aCommandWord;
    }
    public String getSecondaryWord() 
    {
        return secondaryWord;
    }
    public void setSecondaryWord(String secondaryWord) 
    {
        this.secondaryWord = secondaryWord;
    }
    
    
    public boolean validateSecondaryWord ()
    {
        if(secondaryWord != null){
            return true; 
        }else{
            return false;
        }
       }
    
    //reyes
    public boolean validateUnknownCommands (){
        if(aCommandWord == CommandWord.xx){
            return true;
        }else{
            return false;
        }
    }
    
    
    
    
}

