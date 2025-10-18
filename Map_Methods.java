import java.util.Scanner;
public class Map_Methods {
    ///////////////////////////////
    //Strings//////////////////////
    ///////////////////////////////
    public static Scanner userIn = new Scanner(System.in);
    public static String currentMap;
    public static String command;
    
    public static String playername; 
    public static Player player = new Player(playername);
    public static String classMap;
    //Map_Methods.playername = Map_Methods.userIn.nextLine();
    public static boolean checkOutsideN5W3 = false;
    public static double twoItemChance = (Math.random() * (2-0.0)) + 0.0;
    
    //Maps
    //Outside
    public static String outsideLine1;
    public static String outsideLine2;
    public static String outsideLine3;
    public static String outsideLine4;
    public static String outsideLine5;
    public static String outsideLine6;
    public static String outsideLine7;
    public static String outsideLine8;
    static{
        outsideLine1 = "TTTTTTTT.....TTTTT.TT";
        outsideLine2 = "TTTTTTT*.....TT.....T";
        outsideLine3 = "TTTTTTT....TTT*.TTTTT";
        outsideLine4 = "TTTTTT....TTTTT..TTTT";
        outsideLine5 = "TTTTTT......TTTT.TTTT";
        outsideLine6 = "TTTTTT...........TTTT";
        outsideLine7 = "TTTTTT....o....TTTTTT";
        outsideLine8 = "TTTTTTTT#####TTTTTTTT";
    }
    public static void resetOutside() 
    {
        outsideLine1 = "TTTTTTTT.....TTTTT.TT";
        outsideLine2 = "TTTTTTT*.....TT.....T";
        outsideLine3 = "TTTTTTT....TTT*.TTTTT";
        outsideLine4 = "TTTTTT....TTTTT..TTTT";
        outsideLine5 = "TTTTTT......TTTT.TTTT";
        outsideLine6 = "TTTTTT...........TTTT";
        outsideLine7 = "TTTTTT.........TTTTTT";
        outsideLine8 = "TTTTTTTT#####TTTTTTTT";
    }
    //Castle1
    public static String castle1_1;
    public static String castle1_2;
    public static String castle1_3;
    public static String castle1_4;
    public static String castle1_5;
    public static String castle1_6;
    public static String castle1_7;
    public static String castle1_8;
    static{
        castle1_1 = "###-##########-###";
        castle1_2 = "|................#"; 
        castle1_3 = "#................#";
        castle1_4 = "#................#";
        castle1_5 = "#................|";
        castle1_6 = "#................#";
        castle1_7 = "#................#";
        castle1_8 = "########=====#####";
    }
    public static void resetCastle1()
    {
        castle1_1 = "###-##########-###";
        castle1_2 = "|................#"; 
        castle1_3 = "#................#";
        castle1_4 = "#................#";
        castle1_5 = "#................|";
        castle1_6 = "#................#";
        castle1_7 = "#................#";
        castle1_8 = "########=====#####";
    }
    public static void main(String[] args)
    {
        // MyProgram.menu();
        
        // Test case
        // OutsideMap.startOutside();
        
        // OutsideMap.outsideN2();
    }
    public static void outsideMap()
    {
        System.out.println(outsideLine1);
        System.out.println(outsideLine2);
        System.out.println(outsideLine3);
        System.out.println(outsideLine4);
        System.out.println(outsideLine5);
        System.out.println(outsideLine6);
        System.out.println(outsideLine7);
        System.out.println(outsideLine8);
    }
    public static void castle1Map()
    {
        System.out.println(castle1_1);
        System.out.println(castle1_2);
        System.out.println(castle1_3);
        System.out.println(castle1_4);
        System.out.println(castle1_5);
        System.out.println(castle1_6);
        System.out.println(castle1_7);
        System.out.println(castle1_8);
    }
    ///////////////////////////////
    //Main Methods/////////////////
    ///////////////////////////////
    public static void playerDeath()
    {
        clearScreen();
        System.out.println("=====================================");
        System.out.println("           YOU HAVE DIED             ");
        System.out.println("=====================================");
        System.out.println();
        System.out.println("Would you like to restart? (y/n)");
        
        String restartYesOrNo = userIn.nextLine();

        if (restartYesOrNo.equalsIgnoreCase("y") || restartYesOrNo.equalsIgnoreCase("yes")) {
            // MyProgram.menu();
            //Won't be available until I find away to strip the player of their items.
            System.out.println("Currently unavailable. \nExiting game...");
            System.exit(0);
        }else{
            System.out.println("Game over.");
            System.exit(0);
        }
    }
    //This should work on most IDEs.
    public static void clearScreen()
    {
        // System.out.print("\033[H\033[2J");
        //If it doesn't work:
        System.out.print("\033\143");
    }
    //Displays health and commands after the map.
    public static void healthAndCommands()
    {
        System.out.println();
        System.out.println("Player Health: " + player.health);
        System.out.println("Help for commands");
        command = userIn.nextLine();
    }
    public static void commandsHelp()
    {
        //////////////////////////////////
        //NEEDS TO BE FIXED///////////////
        //////////////////////////////////
        clearScreen();
        System.out.println("Help:");
        System.out.println("Shows this commands screen");
        System.out.println("Move (direction) (e.g., North, East, etc. ");
        System.out.println("Move that direction");
        System.out.println("Interact (direction) (e.g., North, East, etc.: ");
        System.out.println("Interact with the object in that direction");
        System.out.println("Inventory:");
        System.out.println("Check inventory");
        System.out.println();
        System.out.println("Press any key to return");
        userIn.nextLine();
        // while(true)    
        //     if(currentMap.equals("startOutside")){
        //         startOutside();
        //     }else if(currentMap.equals("outsideN1")){
        //         outsideN1();
        //     }else if(currentMap.equals("outsideN2")){
        //         outsideN2();
        //     }else if(currentMap.equals("outsideN1E1")){
        //         outsideN1E1();
        //         break;
        //     }
        // }
    }
    //Gives item(s) to player.
    public static void giveItem(Player player, String item) {
        String[] possibleItems = {"Nightstick", "Rifle", ".303 round", "Dynamite", "Matchbook", "Flashlight"};
        if (item == null) {
        // give random item
            int randomIndex = (int) (Math.random() * possibleItems.length);
            item = possibleItems[randomIndex];
        }
        player.addItem(item);
    }
    //Gives random item to player
    public static void randItem()
    {
        System.out.println("Developer test, remove when done.");
        System.out.println("Math.random result: " + twoItemChance); 
        //If the randomNum is above 1.8 from 0-2, it gives the player two items.
        if (twoItemChance > 1.8) {
            giveItem(player, null);
            giveItem(player, null);
        //If the randomNum is 0.25 or below, you don't get an item.
        }else if (twoItemChance <0.25) {
            System.out.println("There's nothing in here.");
        //If the number doesn't fill one of these conditions, just give the player a regular item.
        }else{
            giveItem(player, null);
        }
    }
    public static void randItem_RNGGalore(){
        //If the randomNum is above 1.98 out of 2.0
        if (twoItemChance > 1.98){
            giveItem(player, null);
        //Else, kill the player.
        }else{
            System.out.println("The chest was rigged with an explosive that killed you instantly.");
            System.out.println("Press any key to continue");
            playerDeath();
        }
    }
}
