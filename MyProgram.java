public class MyProgram
{
    
///////////////////////////////////////////////////////////
///TO DO://////////////////////////////////////////////////
///////////////////////////////////////////////////////////
//REMOVE ALL CASTLE_W10
//REMOVE ALL CASTLE_E7
///////////////////////////////////////////////////////////    
    public static void main(String[] args){
        menu();
        // OutsideMap.outsideN6E8();
    }
    public static void menu(){
        //Puts the player health back to 100 incase they are restarting from death
        Map_Methods.player.health = 100;
        //Keeps the current map value (In this case the menu):
        Map_Methods.currentMap = "menu";
        System.out.println("            _______ _    _ ______");
        System.out.println("           |__   __| |  | |  ____|");
        System.out.println("              | |  | |__| | |__");
        System.out.println("              | |  |  __  |  __|");
        System.out.println("              | |  | |  | | |____");
        System.out.println("              |_|  |_|  |_|______|");
        System.out.println(" _____  _    _ _   _  _____ ______ ____  _   _ ");
        System.out.println("|  __ \\| |  | | \\ | |/ ____|  ____/ __ \\| \\ | |");
        System.out.println("| |  | | |  | |  \\| | |  __| |__ | |  | |  \\| |");
        System.out.println("| |  | | |  | | . ` | | |_ |  __|| |  | | . ` |");
        System.out.println("| |__| | |__| | |\\  | |__| | |___| |__| | |\\  |");
        System.out.println("|_____/ \\____/|_| \\_|\\_____|______\\____/|_| \\_|");
        
        String startOption = "Start";
        String exitOption = "Exit";
        while(true){
            System.out.println();
            System.out.println("Start");
            System.out.println("Exit");
            System.out.println("What would you like to do?");
            String choiceMenu1 = Map_Methods.userIn.nextLine();
            
            if(choiceMenu1.equalsIgnoreCase(startOption)){
                System.out.println("Entering game...");
                OutsideMap.AskName();
                break;
            }else if(choiceMenu1.equalsIgnoreCase(exitOption)){
                System.out.println("Exiting game...");
                System.exit(0);
            }else {
                System.out.println("Not a valid option!");
            }
        }
    }
}
