package zuul1;

import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

public class Room {
        
    private String description;
    private HashMap<String, Room> exits;
    
    public Room(String description){
        
        this.description = description;
        exits = new HashMap<String, Room>();
    }
    
    public void setExit(String direction, Room neighbor){
        
        exits.put(direction, neighbor);
    }

    public String getShortDescription(){
        
        return description;
    }
    
    public String getLongDescription(){
        String longDescription;
        longDescription= "You are " + description + ".\n" + getExitString();
        return longDescription;
    }

    private String getExitString(){
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    public Room getRoomExit(String direction){
        Room roomExit= exits.get(direction);
        return roomExit;
    }
}