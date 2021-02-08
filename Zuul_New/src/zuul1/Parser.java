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

        inputWordsList = getWordsList(commandWord); //We need to get the list of words that user input

        if(inputWordsList[0] != "") {
            word1 = inputWordsList[0];
            if(inputWordsList[1] != "") {
                word2 = inputWordsList[1];
            }
        }
        objCommand = new Command(objCommandWords.getCommandWord(word1), word2);
        return objCommand;
    }

    public String[] getWordsList(Scanner commandWord){
        String[] splitWords = {"",""};
        if(commandWord.hasNext()) {
            splitWords[0] = commandWord.next();
            getSecondWord(commandWord, splitWords);
        }
        return splitWords;
    }

    private void getSecondWord(Scanner commandWord, String[] splitWords) {
        if(commandWord.hasNext()) {
            splitWords[1] = commandWord.next();
        }
    }

    public String showCommands() {
        return objCommandWords.showAllCommands();
    }
    
}
