package zuul1;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Parser 
{
    private CommandWords commands; 
    private Command comm;
    private Scanner word = new Scanner(System.in);
    private ArrayList<String> list = new ArrayList<String>();
    public Parser() 
    {
        commands = new CommandWords();
        
    }

   
    public Command getUserCommand() 
    {
        String inputLine;  
        String word1 = null;
        String word2 = null;

        System.out.print("\n:");     

        
        Scanner commandWord = new Scanner(word.nextLine());
        
        while(commandWord.hasNext()){
            list.add(commandWord.next());
        }
        
        if(list.get(0) != null){
            word1 = list.get(0);
            if(list.get(1) != null){
                word2 = list.get(1);
            }
        }
        
        comm = new Command(commands.getCommandWord(word1), word2);
        return comm;
    }
    
    public String showCommands()
    {
        return commands.showAll();
    }
    
}
