
package zuul1;
/**
 *
 * @author Rodrigo Plaza
 */
public class GamePrint 

{
 
    public String WelcomeMessage(){
    String m = "Welcome to Zuul!"+"\n"+"Are you ready to have fun?\n" +
"If you need help you can press the button on the top left";
      System.out.println(m);  
    return m;
}
    
    
  public String helpMessage()  {
        String help = "You are lost. You are alone. You wander" + "\n";
        help += "around at the university." + "\n";
        help += "\n";
        help += "Your command words are:" +  "\n";
        help += parser.showCommands();
        System.out.println(help);
        return help;
    }

   
}

