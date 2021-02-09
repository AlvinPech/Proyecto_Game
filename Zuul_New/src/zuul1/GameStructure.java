package zuul1;

import static zuul1.Game.startingRoom;

public class GameStructure {
    
    public void createRooms(){
    
        Room entrance, theatre, pub, lab, office;
      
        entrance = new Room("outside the Main Entrance of the university");
        theatre = new Room("in a Lecture Theatre");
        pub = new Room("in the Campus Pub");
        lab = new Room("in a Computing Lab");
        office = new Room("in the Computing Admin Office");
        
        entrance.setExit("east", theatre);
        entrance.setExit("south", lab);
        entrance.setExit("west", pub);

        theatre.setExit("west", entrance);

        pub.setExit("east", entrance);

        lab.setExit("north", entrance);
        lab.setExit("east", office);

        office.setExit("west", lab);

        startingRoom = entrance; 
    }

    public String goRoom(Command command){
       
        String room = "";
        
         if(!command.validateSecondaryWord()) {
            room = "Go where?";
            System.out.println(room);
            return room;
        }

        String direction = command.getSecondaryWord();

        Room nextRoom = startingRoom.getRoomExit(direction);

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
