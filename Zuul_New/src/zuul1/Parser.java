package zuul1;
import java.util.ArrayList;
import java.util.Scanner;


public class Parser {
    private final CommandWords objCommandWords;
    private Command objCommand;
    private final Scanner inputWord = new Scanner(System.in);

    public Parser() {
        objCommandWords = new CommandWords();
    }
   
    public Command getUserCommand() {
        String word1 = null;
        String word2 = null;
        String[] inputWordsList = {"",""};

        System.out.print("\n:");
        Scanner commandWord = new Scanner(inputWord.nextLine());

        if(commandWord.hasNext()) {
            inputWordsList[0] = commandWord.next();
            if(commandWord.hasNext()) {
                inputWordsList[1] = commandWord.next();
            }
        }

        if(inputWordsList[0] != "") {
            word1 = inputWordsList[0];
            if(inputWordsList[1] != "") {
                word2 = inputWordsList[1];
            }
        }
        objCommand = new Command(objCommandWords.getCommandWord(word1), word2);
        return objCommand;
    }
    
    public String showCommands() {
        return objCommandWords.showAllCommands();
    }
    
}
