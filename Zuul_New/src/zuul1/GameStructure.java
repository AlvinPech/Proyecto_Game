package zuul1;

import static zuul1.Game.startingRoom;

package zuul1;

import static zuul1.Game.startingRoom;

public class GameStructure {
    
public void createRooms()
    {
        Room mainEntrance, lecturetheatre, campusPub, computingLab, computingOffice;
      
        mainEntrance = new Room("outside the Main Entrance of the university");
        lecturetheatre = new Room("in a Lecture Theatre");
        campusPub = new Room("in the Campus Pub");
        computingLab = new Room("in a Computing Lab");
        computingOffice = new Room("in the Computing Admin Office");
        
        mainEntrance.setExit("east", lecturetheatre);
        mainEntrance.setExit("south", computingLab);
        mainEntrance.setExit("west", campusPub);

        lecturetheatre.setExit("west", mainEntrance);

        campusPub.setExit("east", mainEntrance);

        computingLab.setExit("north", mainEntrance);
        computingLab.setExit("east", computingOffice);

        computingOffice.setExit("west", computingLab);

        startingRoom = mainEntrance; 
    }
     
      public String goRoom(Command command)   {
       
        String room = "";
        
        if(!command.validateSecondaryWord()) {
            room = "Go where?";
            System.out.println(room);
            return room;
        }

        String direction = command.getSecondaryWord();

        Room nextRoom = startingRoom.getExit(direction);

        if (nextRoom == null) {
            room = "There is no door!";
        }
        else {
            startingRoom =nextRoom;
            room = startingRoom.getLongDescription();
        }
        System.out.println(room);
        return room;
    }
}
