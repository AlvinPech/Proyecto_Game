
package zuul1;

/*
 * @author lizandro reyes
 */
public enum CommandWord {
    
    GO("go"),HELP("help"), STRANGEWORD("?"),EXIT("exit");
    
    private String textCommand; 

     CommandWord(String textCommand){
        this.textCommand = textCommand;
    }

    public String toString(){
        return textCommand ;
    }

}
