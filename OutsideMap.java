public class OutsideMap 
{
    public static void main(String[] args){

    }
    
    public static void AskName(){
        Map_Methods.clearScreen();
        Map_Methods.playername = "[NAME IMPENDING]";
        System.out.println("Your default name is" + Map_Methods.playername);
        System.out.println("Would you like to change it?");
        while(true){
            String nameChange = Map_Methods.userIn.nextLine();
            if (nameChange.equalsIgnoreCase("y")
                || nameChange.equalsIgnoreCase("yes")){
                    System.out.println("What is your name?");
                    Map_Methods.playername = Map_Methods.userIn.nextLine();
                    trainScene1();
                    break;
            }else if(nameChange.equalsIgnoreCase("n")
                    || nameChange.equalsIgnoreCase("no")){
                    trainScene1();
                    break;
            }else{
                System.out.println("Not a valid input!");
                System.out.println("Press any key to continue");
                Map_Methods.userIn.nextLine();
            }
        }
    }
    public static void trainScene1()
    {
        Map_Methods.clearScreen();
        System.out.println("__________________________");
        System.out.println("| ^      ^       _________|");
        System.out.println("|/|\\ ^  /|\\ ^   | GROCERY |");
        System.out.println("|\\| /|\\/ | /|\\  |   ___   |");
        System.out.println("| \\/ | \\  / | \\ |   |*|   |");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println();
        System.out.println("               O");
        System.out.println("             _/|>");
        System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾");
        System.out.println("              / \\     |#########|");
        System.out.println("              | |     |#########|");
        System.out.println("                      |#########|");
        System.out.println("                      (@@@@@@@@@)");
        System.out.println("                      (@@@@@@@@@)");
        
        System.out.println();
        System.out.println("You haven't been on a train since you were a child.");
        System.out.println("Though, having roamed country to country with your mother since birth, the sounds of the metal grinding against the railway track is all but familiar.");
        System.out.println();
        System.out.println("The abusive fathers, fleeting friends, a mother who never really loved you, you hated it. \nAt 16 you had enough, and ran away from home... wherever \"home\" was that fateful week.");
        System.out.println();
        System.out.println("Press any key to continue");
        Map_Methods.userIn.nextLine();
        trainScene2();
    }
    public static void trainScene2()
    {
        Map_Methods.clearScreen();
        System.out.println("__________________________");
        System.out.println("|^  /|\\    ^      ^    /||");
        System.out.println("||\\/ | \\  /|\\  ^ /|\\  / ||");
        System.out.println("|| \\ |  \\/ | \\/|\\ | \\/  ||");
        System.out.println("||  \\|   \\ |  \\| \\|  \\  ||");
        System.out.println("‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾‾");
        System.out.println();
        System.out.println("               O");
        System.out.println("             _/|>");
        System.out.println("    ‾‾‾‾‾‾‾‾‾‾‾|‾‾‾‾‾‾‾‾‾");
        System.out.println("              / \\     |#########|");
        System.out.println("              | |     |#########|");
        System.out.println("                      |#########|");
        System.out.println("                      (@@@@@@@@@)");
        System.out.println("                      (@@@@@@@@@)");
        System.out.println();
        System.out.println("Unfortunately, you suffered the same fate, and drifted around the continent, never being able to settle down.");
        System.out.println("That state of drifting felt like an eternity, until you met Elena.");
        System.out.println("After becoming married, you were finally able to lead a normal life.");
        System.out.println();
        System.out.println("What career did you choose?");
        System.out.println("1. Specialize in demolition work");
        System.out.println("2. Join the local police");
        System.out.println("3. Enlist in the military");
        String career = Map_Methods.userIn.nextLine();
        if (career.equalsIgnoreCase("Specialize in demolition work") 
            || career.equals("1") 
            || career.equals("1.")) {
            System.out.println("Despite your lack of prior education, you were hired for a local construction group as a demolition man. You developed a knack for explosives.");
            System.out.println();
            System.out.println("You gained two sticks of dynamite!");
            // Add to inventory
            Map_Methods.player.addItemWithoutPrint("Dynamite");
            Map_Methods.player.addItemWithoutPrint("Dynamite");
            Map_Methods.giveItem(Map_Methods.player, "Dynamite"); //Might have to do 
            //Map_Methods.player.giveItem, not sure yet.
            Map_Methods.giveItem(Map_Methods.player, "Dynamite");
            System.out.println();
            System.out.println("Press any key to continue");
            Map_Methods.userIn.nextLine();
            startOutside(); //Going to add more later, for now go to start.
        }else if (career.equalsIgnoreCase("Join the local police department")
                || career.equals("2") 
                || career.equals("2.")) {
            System.out.println("With your physical prowess and mental fortitude, it wasn't long before you gained your badge.");
            System.out.println("You gained a police baton and a flashlight!");
            System.out.println();
            //Put in invetory
            Map_Methods.player.addItemWithoutPrint("Nightstick");
            Map_Methods.player.addItemWithoutPrint("Flashlight");
            Map_Methods.giveItem(Map_Methods.player, "Nightstick");
            Map_Methods.giveItem(Map_Methods.player, "Flashlight");
            System.out.println();
            System.out.println("Press any key to continue");
            Map_Methods.userIn.nextLine();
            startOutside(); // Going to add more later, for now go to start.
        }else if (career.equalsIgnoreCase("Enlist in the military")
                || career.equals("3") 
                || career.equals("3.")) {
            System.out.println("Despite your wedding vows, you could never fully escape your old life, yearning to wander");
            System.out.println();
            System.out.println("You found yourself enlisting in the military, travelling military base to military base.");
            System.out.println("You gained a rifle and 10 .303 rounds!");
            
            // Add to inventory
            System.out.println();
            System.out.println("Press any key to continue");
            Map_Methods.userIn.nextLine();
            startOutside(); //Going to add more later, for now go to start.
        }else{
            System.out.println("Not a valid input!");
            System.out.println("Press any key to continue");
            Map_Methods.userIn.nextLine();
            trainScene2();
        }
    }
    public static void outsideW4()
    {
        Map_Methods.clearScreen(); //Clears the screen
        Map_Methods.resetOutside(); //Gets rid of other positions for the player on map
        Map_Methods.currentMap = "outsideW4"; //Sets map for ifStatements.
        Map_Methods.classMap = "outside"; //Sets the current class map for the if statements
        Map_Methods.outsideLine7 = "TTTTTTo........TTTTTT"; //Sets position on map.
        Map_Methods.outsideMap(); //Prints the map
        ifStatements.runGameLoop();
        //No need to call Map_Methods.healthandCommands(), already called by runGameLoop.
    }
    public static void outsideW3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideW3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT.o.......TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideW2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideW2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT..o......TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideW1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideW1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT...o.....TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void startOutside()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "startOutside";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT....o....TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideE1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideE1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT.....o...TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideE2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideE2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT......o..TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideE3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideE3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT.......o.TTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideE4()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideE4";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine7 = "TTTTTT........oTTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    
    public static void outsideN1W4()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1W4";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTTo..........TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1W3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1W3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT.o.........TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1W2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1W2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT..o........TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1W1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1W1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT...o.......TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT....o......TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1E1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1E1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT.....o.....TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1E2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1E2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT......o....TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1E3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1E3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT.......o...TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1E4()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1E4";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT........o..TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1E5()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1E5";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT.........o.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN1E6()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN1E6";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine6 = "TTTTTT..........oTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2W4()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2W4";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTTo.....TTTT.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2W3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2W3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTT.o....TTTT.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2W2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2W2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTT..o...TTTT.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2W1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2W1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTT...o..TTTT.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTT....o.TTTT.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2E1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2E1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTT.....oTTTT.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN2E6()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN2E6";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine5 = "TTTTTT......TTTToTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN3W4()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN3W4";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine4 = "TTTTTTo...TTTTT..TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN3W3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN3W3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine4 = "TTTTTT.o..TTTTT..TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN3W2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN3W2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine4 = "TTTTTT..o.TTTTT..TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN3W1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN3W1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine4 = "TTTTTT...oTTTTT..TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN3E5()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN3E5";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine4 = "TTTTTT....TTTTTo.TTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN3E6()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN3E6";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine4 = "TTTTTT....TTTTT.oTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN4W3()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN4W3";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine3 = "TTTTTTTo...TTT*.TTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN4W2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN4W2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine3 = "TTTTTTT.o..TTT*.TTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN4W1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN4W1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine3 = "TTTTTTT..o.TTT*.TTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN4()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN4";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine3 = "TTTTTTT...oTTT*.TTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN4E5()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN4E5";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine3 = "TTTTTTT....TTT*oTTTTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5W2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5W2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*o....TT.....T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5W1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5W1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*.o...TT.....T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*..o..TT.....T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*...o.TT.....T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*....oTT.....T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E5()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E5";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*.....TTo....T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E6()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E6";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*.....TT.o...T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E7()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E7";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*.....TT..o..T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E8()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E8";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*.....TT...o.T";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN5E9()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN5E9";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine2 = "TTTTTTT*.....TT....oT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN6W2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN6W2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine1 = "TTTTTTTTo....TTTTT.TT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN6W1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN6W1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine1 = "TTTTTTTT.o...TTTTT.TT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN6()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN6";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine1 = "TTTTTTTT..o..TTTTT.TT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN6E1()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN6E1";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine1 = "TTTTTTTT...o.TTTTT.TT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN6E2()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN6E2";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine1 = "TTTTTTTT....oTTTTT.TT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    public static void outsideN6E8()
    {
        Map_Methods.clearScreen();
        Map_Methods.resetOutside();
        Map_Methods.currentMap = "outsideN6E8";
        Map_Methods.classMap = "outside";
        Map_Methods.outsideLine1 = "TTTTTTTT.....TTTTToTT";
        Map_Methods.outsideMap();
        ifStatements.runGameLoop();
    }
    // ----------- MAP -----------
    // outsideLine1 = "TTTTTTTT.....TTTTT.TT"; N6
    // outsideLine2 = "TTTTTTT#.....TT.....T"; N5 
    // outsideLine3 = "TTTTTTT....TTT#.TTTTT"; N4
    // outsideLine4 = "TTTTTT....TTTTT..TTTT"; N3
    // outsideLine5 = "TTTTTT......TTTT.TTTT"; N2
    // outsideLine6 = "TTTTTT...........TTTT"; N1
    // outsideLine7 = "TTTTTT....o....TTTTTT";
    // outsideLine8 = "TTTTTTTT#####TTTTTTTT";
    //                 W     4321 123456789E
}