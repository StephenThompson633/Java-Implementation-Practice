public class Player{
    //Each basketball player will have a jersey number
    //Each player will have a name 
    int jersey_num;
    String name;
    String position;
    
    public Player(){}

    public void addAttributes(String n, String p, int num){
        name = n;
        position = p;
        jersey_num = num;
    }


}