/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zuul1;

/**
 *
 * @author Usuario
 */
public enum CommandWord {
    
    GO("go"),HELP("help"), STRANGEWORD("?"),EXIT("exit");
    
    private String textCommand; 

     CommandWord(String textCommand) {
        this.textCommand = textCommand;
    }

    @Override
    public String toString() 
    {
        return textCommand ;
    }
    
    
    
    
    
}
