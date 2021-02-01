
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
  public String helpMessage()
  {
      String m = "you're lost?\n" +
"the commands you can write are help, go and exit";
        System.out.println(m);
        return m;
    }

   
}

