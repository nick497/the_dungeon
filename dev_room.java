public class dev_room {
    public static void main(String[] args) {
    }
    public static String devRoomLine1;
    public static String devRoomLine2;
    public static String devRoomLine3;
    public static String devRoomLine4;
    static{
        devRoomLine1 = "......................";
        devRoomLine2 = "*o....................";
        devRoomLine3 = "......................";
        devRoomLine4 = "......................";
    }
    public static void resetDevRoom() 
    {
        devRoomLine1 = "......................";
        devRoomLine2 = "*o....................";
        devRoomLine3 = "......................";
        devRoomLine4 = "......................";
    }
    public static void devRoomMap()
    {
        System.out.println(devRoomLine1);
        System.out.println(devRoomLine2);
        System.out.println(devRoomLine3);
        System.out.println(devRoomLine4);
    }
    public static void devRoom()
    {
        Map_Methods.clearScreen(); //Clears the screen
        resetDevRoom(); //Gets rid of other positions for the player on map
        Map_Methods.currentMap = "devRoom"; //Sets map for ifStatements.
        Map_Methods.classMap = "devRoom"; //Sets the current class map for the if statements
        devRoomLine2 = "*o...................."; //Sets position on map.
        devRoomMap(); //Prints the map
        ifStatements.runGameLoop();
        //No need to call Map_Methods.healthandCommands(), already called by runGameLoop.
    }
    //Doesn't work, will debug later 10/15/25
    public static void handleDevRoomCommand() {
    if (Map_Methods.command.equalsIgnoreCase("move west")) {
        System.out.println("You loot the crate...");
        Map_Methods.randItem();
        System.out.println("Press any key to continue");
        devRoom(); // refresh room
    } else if (Map_Methods.command.equalsIgnoreCase("return")) {
        OutsideMap.startOutside();
    }
    }
}