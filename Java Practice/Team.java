import java.util.*;
public class Team{
    //the team will hold the list of players 
    List<Player> players = new ArrayList<Player>();
    HashMap<String, Integer> team = new HashMap<String, Integer>();

    public Team(){}

    //add a new player to the list 
    public void addPlayers(Player p){
        players.add(p);
    }

    //sort the players by their jersey number [least --> greatest]
    public ArrayList <Player> sortPlayers(){
        return null;
    }
    
    //display the team as [Name, Numbers]
    public HashMap<String, Integer> showRoster(){
        for(Player p: players){
            team.put(p.name, p.jersey_num);
        }
        return team;
    }
    
    //remove players from the team
    public void cutPlayer(Integer num){ 
            //find a person by their number in the map and remove 
            if(team.containsValue(num)){
                team.remove(num);
            }
        //remove players from the list by searching through the players list 
        //players.remove(binarySearch(players, num))
    }

    public Player binarySearch(ArrayList<Player> list, Integer target){
        int start = 0;
        int end = list.size()-1;

        while(/*until target is found*/){
            int mid = //;
            
            if(/*the target is the mid*/){
                //return player
            }else if(/*target > mid */){
                //look right 
            }else{
                //look left
            }  
        }
        //return the player from the list 
        return null;
    }
    


}