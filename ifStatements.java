public class ifStatements {
    public static void main(String[] args){

    }
    public static void runGameLoop() {
        while (true) {
            Map_Methods.healthAndCommands();

            // Help command
            if (Map_Methods.command.equalsIgnoreCase("Help")) {
                Map_Methods.commandsHelp();
            // ----------- MOVE NORTH -----------
            // ----- DONE -----
            }else if (Map_Methods.command.equalsIgnoreCase("Move North") || Map_Methods.command.equalsIgnoreCase("N") || Map_Methods.command.equalsIgnoreCase("North")) {
                if (Map_Methods.classMap.equals("outside")){
                    switch (Map_Methods.currentMap){
                        case "outsideW4":
                            OutsideMap.outsideN1W4();
                            break;
                        case "outsideW3":
                            OutsideMap.outsideN1W3();
                            break;
                        case "outsideW2":
                            OutsideMap.outsideN1W2();
                            break;
                        case "outsideW1":
                            OutsideMap.outsideN1W1();
                            break;
                        case "startOutside":
                            OutsideMap.outsideN1();
                            break;  
                        case "outsideE1":    
                            OutsideMap.outsideN1E1();
                            break;
                        case "outsideE2":
                            OutsideMap.outsideN1E2();
                            break;
                        case "outsideE3":
                            OutsideMap.outsideN1E3();
                            break;
                        case "outsideE4":
                            OutsideMap.outsideN1E4();
                            break;
                        case "outsideN1W4":
                            OutsideMap.outsideN2W4();
                            break;
                        case "outsideN1W3":
                            OutsideMap.outsideN2W3();
                            break;
                        case "outsideN1W2":
                            OutsideMap.outsideN2W2();
                            break;
                        case "outsideN1W1":
                            OutsideMap.outsideN2W1();
                            break;
                        case "outsideN1":
                            OutsideMap.outsideN2();
                            break;
                        case "outsideN1E1":
                            OutsideMap.outsideN2E1();
                            break;
                        case "outsideN1E2":
                            blockMessage();
                            OutsideMap.outsideN1E2();
                            break;
                        case "outsideN1E3":
                            blockMessage();
                            OutsideMap.outsideN1E3();
                            break;
                        case "outsideN1E4": 
                            blockMessage();
                            OutsideMap.outsideN1E4();
                            break;
                        case "outsideN1E5":
                            blockMessage();
                            OutsideMap.outsideN1E5();
                            break;
                        case "outsideN1E6":
                            OutsideMap.outsideN2E6();
                            break;
                        case "outsideN2W4":
                            OutsideMap.outsideN3W4();
                            break;  
                        case "outsideN2W3": 
                            OutsideMap.outsideN3W3();
                            break;
                        case "outsideN2W2":
                            OutsideMap.outsideN3W2();
                            break;
                        case "outsideN2W1":
                            OutsideMap.outsideN3W1();
                            break;
                        case "outsideN2":
                            blockMessage();
                            OutsideMap.outsideN2();
                            break;
                        case "outsideN2E1":
                            blockMessage();
                            OutsideMap.outsideN2E1();
                            break;  
                        case "outsideN2E6":
                            OutsideMap.outsideN3E6();
                            break;
                        case "outsideN3W4":
                            blockMessage();
                            OutsideMap.outsideN3W4();
                            break;
                        case "outsideN3W3":
                            OutsideMap.outsideN4W3();
                            break;
                        case "outsideN3W2":
                            OutsideMap.outsideN4W2();
                            break;
                        case "outsideN3W1":
                            OutsideMap.outsideN4W1();
                            break;
                        case "outsideN3E5":
                            OutsideMap.outsideN4E5();
                            break;
                        case "outsideN3E6":
                            blockMessage();
                            OutsideMap.outsideN3E6();
                            break;
                        case "outsideN4W3":
                            if (Map_Methods.checkOutsideN5W3 == false){
                                System.out.println("You loot the crate...");
                                // Map_Methods.giveItem(Map_Methods.player, null);
                                Map_Methods.randItem();
                                Map_Methods.checkOutsideN5W3 = true;
                                System.out.println("Press any key to continue");
                                Map_Methods.userIn.nextLine();
                                OutsideMap.outsideN4W3();
                            }else if (Map_Methods.checkOutsideN5W3 == true){
                                System.out.println("There is an empty crate here");
                                System.out.println("Press any key to continue.");
                                Map_Methods.userIn.nextLine(); 
                                OutsideMap.outsideN4W3();
                            }
                            break;
                        case "outsideN4W2":
                            OutsideMap.outsideN5W2();
                            break;
                        case "outsideN4W1":
                            OutsideMap.outsideN5W1();
                            break;
                        case "outsideN4":
                            OutsideMap.outsideN5();
                            break; 
                        case "outsideN4E5":
                            OutsideMap.outsideN5E5();
                            break;  
                        case "outsideN5W2":
                            OutsideMap.outsideN6W2();
                            break;
                        case "outsideN5W1":
                            OutsideMap.outsideN6W1();
                            break;
                        case "outsideN5":
                            OutsideMap.outsideN6();
                            break;
                        case "outsideN5E1":
                            OutsideMap.outsideN6E1();
                            break;
                        case "outsideN5E2":
                            OutsideMap.outsideN6E2();
                            break;
                        case "outsideN5E6": 
                            blockMessage();
                            OutsideMap.outsideN5E6();
                            break;
                        case "outsideN5E7":
                            blockMessage();
                            OutsideMap.outsideN5E7();
                            break;
                        case "outsideN5E8":
                            OutsideMap.outsideN6E8();
                            break;
                        case "outsideN5E9":
                            blockMessage();
                            OutsideMap.outsideN5E9();
                            break;
                        case "outsideN6W2":
                            //Go to castle1(); (Main entrance)
                            Castle1.castle1_W2();
                            break;
                        case "outsideN6W1":
                            //Go to castle1(); (Main entrance)
                            Castle1.castle1_W1();
                            break;
                        case "outsideN6":
                            //Go to castle1(); (Main entrance)
                            Castle1.castle1();
                            break;
                        case "outsideN6E1":
                            //Go to castle1(); (Main entrance)
                            System.out.println("This is where I'd put my Castle1.java...");
                            System.out.println("IF I HAD THE MAP!");
                            break;
                        case "outsideN6E2":
                            //Go to castle1(); (Main entrance)
                            System.out.println("This is where I'd put my Castle1.java...");
                            System.out.println("IF I HAD THE MAP!");
                            break;
                        case "outsideN6E8":
                            //Go to castleKitchen or castleSideEntrance?
                            //Should only work if you have a flashlight.
                            //If you have the flashlight:
                            if (Map_Methods.player.hasItem("Flashlight")){
                                //Go to next map
                                System.out.println("This is where I'd put my Castle1.java...");
                                System.out.println("IF I HAD THE MAP!");
                            //If you don't have the flashlight:
                            }else{
                                System.out.println("It's too dark for you too see inside.");
                                System.out.println("Press any key to continue");
                                Map_Methods.userIn.nextLine();
                                OutsideMap.outsideN6E8();
                            }
                            break;
                        default:
                            System.out.println("Error: Unknown location.");
                            break;
                        }
                        // ----------- OUTSIDE MAP -----------
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
                //North commands if the map is castle1.
                }else if (Map_Methods.classMap.equals("castle1")){
                    switch (Map_Methods.currentMap){
                        case "castle1_W10":
                            castle1_N1W10();
                            break;
                        case "castle1_W9":
                            castle1_N1W9();
                            break;
                        case "castle1_W8":
                            castle1_N1W8();
                            break;
                        case "castle1_W7":
                            castle1_N1W7();
                            break;
                        case "castle1_W6":
                            castle1_N1W6();
                            break;
                        case "castle1_W5":
                            castle1_N1W5();
                            break;
                        case "castle1_W4":
                            castle1_N1W4();
                            break;
                        case "castle1_W3":
                            castle1_N1W3();
                            break;
                        case "castle1_W2":
                            castle1_N1W2();
                            break;
                        case "castle1_W1":
                            castle1_N1W1();
                            break;
                        case "castle1": //This doesn't work for some reason.
                            castle1_N1();
                            break;
                        case "castle1_E1":
                            castle1_N1E1();
                            break;
                        case "castle1_E2":
                            castle1_N1E2();
                            break;
                        case "castle1_E3":
                            castle1_N1E3();
                            break;
                        case "castle1_E4":
                            castle1_N1E4();
                            break;
                        case "castle1_E5":
                            castle1_N1E5();
                            break;
                        case "castle1_E6":
                            castle1_N1E6();
                            break;
                        case "castle1_N1W10":
                            castle1_N2W10();
                            break;
                        case "castle1_N1W9":
                            castle1_N2W9();
                            break;
                        case "castle1_N1W8":
                            castle1_N2W8();
                            break;
                        case "castle1_N1W7":
                            castle1_N2W7();
                            break;  
                        case "castle1_N1W6":  
                            castle1_N2W6();
                            break;
                        case "castle1_N1W5":
                            castle1_N2W5();
                            break;
                        case "castle1_N1W4":
                            castle1_N2W4();
                            break;
                        case "castle1_N1W3":
                            castle1_N2W3();
                            break;
                        case "castle1_N1W2":
                            castle1_N2W2();
                            break;
                        case "castle1_N1W1":
                            castle1_N2W1();
                            break;
                        case "castle1_N1":
                            castle1_N2();
                            break;
                        case "castle1_N1E1":
                            castle1_N2E1();
                            break;
                        case "castle1_N1E2":
                            castle1_N2E2();
                            break;
                        case "castle1_N1E3":
                            castle1_N2E3();
                            break; 
                        case "castle1_N1E4":
                            castle1_N2E4();
                            break;
                        case "castle1_N1E5":
                            castle1_N2E5();
                            break;  
                        case "castle1_N1E6":
                            castle1_N2E6();
                            break;
                        case "castle1_N2W10":
                            castle1_N3W10();
                            break;
                        case "castle1_N2W9":
                            castle1_N3W9();
                            break;
                        case "castle1_N2W8":
                            castle1_N3W8();
                            break;
                        case "castle1_N2W7":
                            castle1_N3W7();
                            break;
                        case "castle1_N2W6":
                            castle1_N3W6();
                            break;
                        case "castle1_N2W5":
                            castle1_N3W5();
                            break;
                        case "castle1_N2W4":
                            castle1_N3W4();
                            break;
                        case "castle1_N2W3":
                            castle1_N3W3();
                            break;
                        case "castle1_N2W2":
                            castle1_N3W2();
                            break;
                        case "castle1_N2W1":
                            castle1_N3W1();
                            break;
                        case "castle1_N2":
                            castle1_N3();
                            break;
                        case "castle1_N2E1":
                            castle1_N3E1();
                            break;
                        case "castle1_N2E2":
                            castle1_N3E2();
                            break;
                        case "castle1_N2E3":
                            castle1_N3E3();
                            break;
                        case "castle1_N2E4":
                            castle1_N3E4();
                            break;
                        case "castle1_N2E5":
                            castle1_N3E5();
                            break;
                        case "castle1_N2E6":
                            castle1_N3E6();
                            break;
                        case "castle1_N3W10":
                            castle1_N4W10();
                            break;
                        case "castle1_N3W9":
                            castle1_N4W9();
                            break;
                        case "castle1_N3W8":
                            castle1_N4W8();
                            break;
                        case "castle1_N3W7":
                            castle1_N4W7();
                            break;
                        case "castle1_N3W6":
                            castle1_N4W6();
                            break;
                        case "castle1_N3W5":
                            castle1_N4W5();
                            break;
                        case "castle1_N3W4":
                            castle1_N4W4();
                            break;
                        case "castle1_N3W3":
                            castle1_N4W3();
                            break;
                        case "castle1_N3W2":
                            castle1_N4W2();
                            break;
                        case "castle1_N3W1":
                            castle1_N4W1();
                            break;
                        case "castle1_N3":
                            castle1_N4();
                            break;
                        case "castle1_N3E1":
                            castle1_N4E1();
                            break;
                        case "castle1_N3E2":
                            castle1_N4E2();
                            break;
                        case "castle1_N3E3":
                            castle1_N4E3();
                            break;
                        case "castle1_N3E4":
                            castle1_N4E4();
                            break;
                        case "castle1_N3E5":
                            castle1_N4E5();
                            break;
                        case "castle1_N3E6":
                            castle1_N4E6();
                            break;
                        case "castle1_N4W10":
                            castle1_N5W10();
                            break;
                        case "castle1_N4W9":
                            castle1_N5W9();
                            break;
                        case "castle1_N4W8":
                            castle1_N5W8();
                            break;
                        case "castle1_N4W7":
                            castle1_N5W7();
                            break;
                        case "castle1_N4W6":
                            castle1_N5W6();
                            break;
                        case "castle1_N4W5":
                            castle1_N5W5();
                            break;
                        case "castle1_N4W4":
                            castle1_N5W4();
                            break;
                        case "castle1_N4W3":
                            castle1_N5W3();
                            break;
                        case "castle1_N4W2":
                            castle1_N5W2();
                            break;
                        case "castle1_N4W1":
                            castle1_N5W1();
                            break;
                        case "castle1_N4":
                            castle1_N5();
                            break;
                        case "castle1_N4E1":
                            castle1_N5E1();
                            break;
                        case "castle1_N4E2":
                            castle1_N5E2();
                            break;
                        case "castle1_N4E3":
                            castle1_N5E3();
                            break;
                        case "castle1_N4E4":
                            castle1_N5E4();
                            break;
                        case "castle1_N4E5":
                            castle1_N5E5();
                            break;
                        case "castle1_N4E6":
                            castle1_N5E6();
                            break;
                        case "castle1_N5W10":
                            wallMessage();
                            castle1_N5W10();
                            break;
                        case "castle1_N5W9":
                            wallMessage();
                            castle1_N5W9();
                            break;
                        case "castle1_N5W8":
                            wallMessage();
                            castle1_N5W8();
                            break;
                        case "castle1_N5W7":
                            //Go to castleKitchen or castleSideEntrance?
                            //Should only work if you have a flashlight.
                            //If you have the flashlight:
                            if (Map_Methods.player.hasItem("Flashlight")){
                                //Go to next map
                                System.out.println("This is where I'd put my Castle1.java...");
                                System.out.println("IF I HAD THE MAP!");
                                System.out.println("Press any key to continue");
                                Map_Methods.userIn.nextLine();
                                castle1_N5W7();
                            //If you don't have the flashlight:
                            }else{
                                System.out.println("It's too dark for you too see inside.");
                                System.out.println("Press any key to continue");
                                Map_Methods.userIn.nextLine();
                                castle1_N5W7();
                            }
                            break;
                        case "castle1_N5W6":
                            wallMessage();
                            castle1_N5W5();
                            break;
                        case "castle1_N5W5":
                            wallMessage();
                            castle1_N5W5();
                            break;
                        case "castle1_N5W4":
                            wallMessage();
                            castle1_N5W4();
                            break;
                        case "castle1_N5W3":
                            wallMessage();
                            castle1_N5W3();
                            break;
                        case "castle1_N5W2":
                            wallMessage();
                            castle1_N5W2();
                            break;
                        case "castle1_N5W1":
                            wallMessage();
                            castle1_N5W1();
                            break;
                        case "castle1_N5":
                            wallMessage();
                            castle1_N5();
                            break;
                        case "castle1_N5E1":
                            wallMessage();
                            castle1_N5E1();
                            break;
                        case "castle1_N5E2":
                            wallMessage();
                            castle1_N5E2();
                            break;
                        case "castle1_N5E3":
                            wallMessage();
                            castle1_N5E3();
                            break;
                        case "castle1_N5E4":
                            //Go inside door.
                            break;
                        case "castle1_N5E5":
                            wallMessage();
                            castle1_N5E5();
                            break;
                        case "castle1_N5E6":
                            wallMessage();
                            castle1_N5E6();
                            break;
                        default:
                            System.out.println("Error: Unknown location.");
                            break;
                    }
                }
            // ----------- MOVE EAST -----------
            // ----- DONE -----
            else if (Map_Methods.command.equalsIgnoreCase("Move East") || Map_Methods.command.equalsIgnoreCase("E") || Map_Methods.command.equalsIgnoreCase("East")) {
                if (Map_Methods.classMap.equals("outside")){
                    switch (Map_Methods.currentMap){
                        case "outsideW4":
                            OutsideMap.outsideW3();
                            break;
                        case "outsideW3":
                            OutsideMap.outsideW2();
                            break;
                        case "outsideW2":
                            OutsideMap.outsideW1();
                            break;
                        case "outsideW1":
                            OutsideMap.startOutside();
                            break;
                        case "startOutside":
                            OutsideMap.outsideE1();
                            break;
                        case "outsideE1":
                            OutsideMap.outsideE2();
                            break;
                        case "outsideE2":
                            OutsideMap.outsideE3();
                            break;
                        case "outsideE3":
                            OutsideMap.outsideE4();
                            break;
                        case "outsideE4":
                            blockMessage();
                            OutsideMap.outsideE4();
                            break;
                        case "outsideN1W4":
                            OutsideMap.outsideN1W3();
                            break;
                        case "outsideN1W3":
                            OutsideMap.outsideN1W2();
                            break;
                        case "outsideN1W2":
                            OutsideMap.outsideN1W1();
                            break;
                        case "outsideN1W1":
                            OutsideMap.outsideN1();
                            break;
                        case "outsideN1":
                            OutsideMap.outsideN1E1();
                            break;
                        case "outsideN1E1":
                            OutsideMap.outsideN1E2();
                            break;
                        case "outsideN1E2":
                            OutsideMap.outsideN1E3();
                            break;
                        case "outsideN1E3":
                            OutsideMap.outsideN1E4();
                            break;
                        case "outsideN1E4":
                            OutsideMap.outsideN1E5();
                            break;
                        case "outsideN1E5":
                            OutsideMap.outsideN1E6();
                            break;
                        case "outsideN1E6":
                            blockMessage();
                            OutsideMap.outsideN1E6();
                            break;
                        case "outsideN2W4":
                            OutsideMap.outsideN2W3();
                            break;
                        case "outsideN2W3":
                            OutsideMap.outsideN2W2();
                            break;
                        case "outsideN2W2":
                            OutsideMap.outsideN2W1();
                            break;
                        case "outsideN2W1":
                            OutsideMap.outsideN2();
                            break;
                        case "outsideN2":
                            OutsideMap.outsideN2E1();
                            break;
                        case "outsideN2E1":
                            blockMessage();
                            OutsideMap.outsideN2E1();
                            break;
                        case "outsideN2E6":
                            blockMessage();
                            OutsideMap.outsideN2E6(); 
                            break;
                        case "outsideN3W4":
                            OutsideMap.outsideN3W3();
                            break;
                        case "outsideN3W3":
                            OutsideMap.outsideN3W2();
                            break;
                        case "outsideN3W2":
                            OutsideMap.outsideN3W1();
                            break;
                        case "outsideN3W1":
                            blockMessage();
                            break;
                        case "outsideN3E5":
                            OutsideMap.outsideN3E6();
                            break;
                        case "outsideN3E6":
                            blockMessage();
                            OutsideMap.outsideN3E6();
                            break;
                        case "outsideN4W3":
                            OutsideMap.outsideN4W2();
                            break;
                        case "outsideN4W2":
                            OutsideMap.outsideN4W1();
                            break;
                        case "outsideN4W1":
                            OutsideMap.outsideN4();
                            break;
                        case "outsideN4":
                            blockMessage();
                            OutsideMap.outsideN4();
                            break;
                        case "outsideN4E5":
                            blockMessage();
                            OutsideMap.outsideN4E5();
                            break;
                        case "outsideN5W2":
                            OutsideMap.outsideN5W1();
                            break;
                        case "outsideN5W1":
                            OutsideMap.outsideN5();
                            break;
                        case "outsideN5":
                            OutsideMap.outsideN5E1();
                            break;
                        case "outsideN5E1":
                            OutsideMap.outsideN5E2();
                            break;
                        case "outsideN5E2":
                            blockMessage();
                            OutsideMap.outsideN5E2();
                            break;
                        case "outsideN5E5":
                            OutsideMap.outsideN5E6();
                            break;
                        case "outsideN5E6":
                            OutsideMap.outsideN5E7();
                            break;
                        case "outsideN5E7":
                            OutsideMap.outsideN5E8();
                            break;
                        case "outsideN5E8":
                            OutsideMap.outsideN5E9();
                            break;
                        case "outsideN5E9":
                            blockMessage();
                            OutsideMap.outsideN5E9();
                            break;
                        case "outsideN6W2":
                            OutsideMap.outsideN6W1();
                            break;
                        case "outsideN6W1":
                            OutsideMap.outsideN6();
                            break;
                        case "outsideN6":
                            OutsideMap.outsideN6E1();
                            break;
                        case "outsideN6E1":
                            OutsideMap.outsideN6E2();
                            break;
                        case "outsideN6E2":
                            blockMessage();
                            OutsideMap.outsideN6E2();
                            break;
                        case "outsideN6E8":
                            blockMessage();
                            OutsideMap.outsideN6E8();
                            break;
                        default:
                            System.out.println("Error: Unknown location!.");
                            break;
                    }
                }else if (Map_Methods.classMap.equals("castle1")){
                    switch (Map_Methods.currentMap){
                        case "castle1_W10":
                            castle1_W9();
                            break;
                        case "castle1_W9":
                            castle1_W8();
                            break;
                        case "castle1_W8":
                            castle1_W7();
                            break;
                        case "castle1_W7":
                            castle1_W6();
                            break;
                        case "castle1_W6":
                            castle1_W5();
                            break;
                        case "castle1_W5":
                            castle1_W4();
                            break;
                        case "castle1_W4":
                            castle1_W4();
                            break;
                        case "castle1_W3":
                            castle1_W3();
                            break;
                        case "castle1_W2":
                            castle1_W2();
                            break;
                        case "castle1_W1":
                            castle1_W1();
                            break;
                        case "castle1":
                            castle1_E1();
                            break;
                        case "castle1_E1":
                            castle1_E2();
                            break;
                        case "castle1_E2":
                            castle1_W3();
                            break;
                        case "castle1_E3":
                            castle1_E4();
                            break;
                        case "castle1_E4":
                            castle1_E5();
                            break;
                        case "castle1_E5":
                            castle1_E6();
                            break;
                        case "castle1_E6":
                            wallMessage();
                            castle1_E6();
                            break;
                        case "castle1_N1W10":
                            castle1_N1W9();
                            break;
                        case "castle1_N1W9":
                            castle1_N1W8();
                            break;
                        case "castle1_N1W8":
                            castle1_N1W7();
                            break;
                        case "castle1_N1W7":
                            castle1_N1W6();
                            break;
                        case "castle1_N1W6":
                            castle1_N1W5();
                            break;
                        case "castle1_N1W5":
                            castle1_N1W4();
                            break;
                        case "castle1_N1W4":
                            castle1_N1W3();
                            break;
                        case "castle1_N1W3":
                            castle1_N1W2();
                            break;
                        case "castle1_N1W2":
                            castle1_N1W1();
                            break;
                        case "castle1_N1W1":
                            castle1_N1();
                            break;
                        case "castle1_N1":
                            castle1_N1E1();
                            break;
                        case "castle1_N1E1":
                            castle1_N1E2();
                            break;
                        case "castle1_N1E2":
                            castle1_N1E3();
                            break;
                        case "castle1_N1E3":
                            castle1_N1E4();
                            break;
                        case "castle1_N1E4":
                            castle1_N1E5();
                            break;
                        case "castle1_N1E5":
                            castle1_N1E6();
                            break;
                        case "castle1_N1E6":
                            wallMessage();
                            castle1_N1E6();
                            break;
                        case "castle1_N2W10":
                            castle1_N2W9();
                            break;
                        case "castle1_N2W9":
                            castle1_N2W8();
                            break;
                        case "castle1_N2W8":
                            castle1_N2W7();
                            break;
                        case "castle1_N2W7":
                            castle1_N2W6();
                            break;
                        case "castle1_N2W6":
                            castle1_N2W5();
                            break;
                        case "castle1_N2W5":
                            castle1_N2W4();
                            break;
                        case "castle1_N2W4":
                            castle1_N2W3();
                            break;
                        case "castle1_N2W3":
                            castle1_N2W2();
                            break;
                        case "castle1_N2W2":
                            castle1_N2W1();
                            break;
                        case "castle1_N2W1":
                            castle1_N2();
                            break;
                        case "castle1_N2":
                            castle1_N2E1();
                            break;
                        case "castle1_N2E1":
                            castle1_N2E2();
                            break;
                        case "castle1_N2E2":
                            castle1_N2E3();
                            break;
                        case "castle1_N2E3":
                            castle1_N2E4();
                            break;
                        case "castle1_N2E4":
                            castle1_N2E5();
                            break;
                        case "castle1_N2E5":
                            castle1_N2E6();
                            break;
                        case "castle1_N2E6":
                            //Lead to kitchen, for now just ignore.
                            castle1_N2E6();
                            break;
                        case "castle1_N3W10":
                            castle1_N3W9();
                            break;
                        case "castle1_N3W9":
                            castle1_N3W8();
                            break;
                        case "castle1_N3W8":
                            castle1_N3W7();
                            break;
                        case "castle1_N3W7":
                            castle1_N3W6();
                            break;
                        case "castle1_N3W6":
                            castle1_N3W5();
                            break;
                        case "castle1_N3W5":
                            castle1_N3W4();
                            break;
                        case "castle1_N3W4":
                            castle1_N3W3();
                            break;
                        case "castle1_N3W3":
                            castle1_N3W2();
                            break;
                        case "castle1_N3W2":
                            castle1_N3W1();
                            break;
                        case "castle1_N3W1":
                            castle1_N3();
                            break;
                        case "castle1_N3":
                            castle1_N3E1();
                            break;
                        case "castle1_N3E1":
                            castle1_N3E2();
                            break;
                        case "castle1_N3E2":
                            castle1_N3E3();
                            break;
                        case "castle1_N3E3":
                            castle1_N3E4();
                            break;
                        case "castle1_N3E4":
                            castle1_N3E5();
                            break;
                        case "castle1_N3E5":
                            castle1_N3E6();
                            break;
                        case "castle1_N3E6":
                            wallMessage();
                            castle1_N3E6();
                            break;
                        case "castle1_N4W10":
                            castle1_N4W9();
                            break;
                        case "castle1_N4W9":
                            castle1_N4W8();
                            break;
                        case "castle1_N4W8":
                            castle1_N4W7();
                            break;
                        case "castle1_N4W7":
                            castle1_N4W6();
                            break;
                        case "castle1_N4W6":
                            castle1_N4W5();
                            break;
                        case "castle1_N4W5":
                            castle1_N4W4();
                            break;
                        case "castle1_N4W4":
                            castle1_N4W3();
                            break;
                        case "castle1_N4W3":
                            castle1_N4W2();
                            break;
                        case "castle1_N4W2":
                            castle1_N4W1();
                            break;
                        case "castle1_N4W1":
                            castle1_N4();
                            break;
                        case "castle1_N4":
                            castle1_N4E1();
                            break;
                        case "castle1_N4E1":
                            castle1_N4E2();
                            break;
                        case "castle1_N4E2":
                            castle1_N4E3();
                            break;
                        case "castle1_N4E3":
                            castle1_N4E4();
                            break;
                        case "castle1_N4E4":
                            castle1_N4E5();
                            break;
                        case "castle1_N4E5":
                            castle1_N4E6();
                            break;
                        case "castle1_N4E6":
                            wallMessage();
                            castle1_N4E6();
                            break;
                        case "castle1_N5W10":
                            castle1_N5W9();
                            break;
                        case "castle1_N5W9":
                            castle1_N5W8();
                            break;
                        case "castle1_N5W8":
                            castle1_N5W7();
                            break;
                        case "castle1_N5W7":
                            castle1_N5W6();
                            break;
                        case "castle1_N5W6":
                            castle1_N5W5();
                            break;
                        case "castle1_N5W5":
                            castle1_N5W4();
                            break;
                        case "castle1_N5W4":
                            castle1_N5W3();
                            break;
                        case "castle1_N5W3":
                            castle1_N5W2();
                            break;
                        case "castle1_N5W2":
                            castle1_N5W1();
                            break;
                        case "castle1_N5W1":
                            castle1_N5();
                            break;
                        case "castle1_N5":
                            castle1_N5E1();
                            break;
                        case "castle1_N5E1":
                            castle1_N5E2();
                            break;
                        case "castle1_N5E2":
                            castle1_N5E3();
                            break;
                        case "castle1_N5E3":
                            castle1_N5E4();
                            break;
                        case "castle1_N5E4":
                            castle1_N5E5();
                            break;
                        case "castle1_N5E5":
                            castle1_N5E6();
                            break;
                        case "castle1_N5E6":
                            wallMessage();
                            castle1_N5E6();
                            break;
                        default:
                            System.out.println("Error: Unknown location.");
                            break;
                    }
                }
            
            ////////////////////////////////////
            //MOVE SOUTH////////////////////////
            ////////////////////////////////////
            } else if (Map_Methods.command.equalsIgnoreCase("Move South") || Map_Methods.command.equalsIgnoreCase("S") || Map_Methods.command.equalsIgnoreCase("South")) {
                if (Map_Methods.classMap.equals("outside")){
                    switch(Map_Methods.currentMap){
                        case "outsideW4":
                            blockMessage();
                            OutsideMap.outsideW4();
                            break;
                        case "outsideW3":
                            blockMessage();
                            OutsideMap.outsideW3();
                            break;
                        case "outsideW2":
                            rubbleMessage();
                            OutsideMap.outsideW2();
                            break;
                        case "outsideW1":
                            rubbleMessage();
                            OutsideMap.outsideW1();
                            break;
                        case "startOutside":
                            rubbleMessage();
                            OutsideMap.startOutside();
                            break;
                        case "outsideE1":
                            rubbleMessage();
                            OutsideMap.outsideE1();
                            break;
                        case "outsideE2":
                            rubbleMessage();
                            OutsideMap.outsideE2();
                            break;
                        case "outsideE3":
                            blockMessage();
                            OutsideMap.outsideE3();
                            break;
                        case "outsideE4":
                            blockMessage();
                            OutsideMap.outsideE4();
                            break;
                        case "outsideN1W4":
                            OutsideMap.outsideW4();
                            break;
                        case "outsideN1W3":
                            OutsideMap.outsideW3();
                            break;
                        case "outsideN1W2":
                            OutsideMap.outsideW2();
                            break;
                        case "outsideN1W1":
                            OutsideMap.outsideW1();
                            break;
                        case "outsideN1":
                            OutsideMap.startOutside();
                            break;
                        case "outsideN1E1":
                            OutsideMap.outsideE1();
                            break;
                        case "outsideN1E2":
                            OutsideMap.outsideE2();
                            break;
                        case "outsideN1E3":
                            OutsideMap.outsideE3();
                            break;
                        case "outsideN1E4":
                            OutsideMap.outsideE4();
                            break;
                        case "outsideN1E5":
                            blockMessage();
                            OutsideMap.outsideN1E5();
                            break;
                        case "outsideN1E6":
                            blockMessage();
                            OutsideMap.outsideN1E6();
                            break;
                        default:
                            System.out.println("Error: Unknown location.");
                            break;
                    }
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
                // }else if (Map_Methods.currentMap.equals("startOutside")){
                //     rubbleMessage();
                //     OutsideMap.startOutside();
                // }else if (Map_Methods.currentMap.equals("outsideE1")){
                //     rubbleMessage();
                //     OutsideMap.outsideE1();
                // }else if (Map_Methods.currentMap.equals("outsideE2")){
                //     rubbleMessage();
                //     OutsideMap.outsideE2();
                // }else if (Map_Methods.currentMap.equals("outsideE3")){
                //     blockMessage();
                //     OutsideMap.outsideE3();
                // }else if (Map_Methods.currentMap.equals("outsideE4")){
                //     blockMessage();
                //     OutsideMap.outsideE4();
                // }else if (Map_Methods.currentMap.equals("outsideN1W4")){
                //     OutsideMap.outsideW4();
                // }else if (Map_Methods.currentMap.equals("outsideN1W3")){
                //     OutsideMap.outsideW3();
                // }else if (Map_Methods.currentMap.equals("outsideN1W2")){
                //     OutsideMap.outsideW2();
                // }else if (Map_Methods.currentMap.equals("outsideN1W1")){
                //     OutsideMap.outsideW1();
                // }else if (Map_Methods.currentMap.equals("outsideN1")){
                //     OutsideMap.startOutside();
                // }else if (Map_Methods.currentMap.equals("outsideN1E1")){
                //     OutsideMap.outsideE1();
                // }else if (Map_Methods.currentMap.equals("outsideN1E2")){
                //     OutsideMap.outsideE2();
                // }else if (Map_Methods.currentMap.equals("outsideN1E3")){
                //     OutsideMap.outsideE3();
                // }else if (Map_Methods.currentMap.equals("outsideN1E4")){
                //     OutsideMap.outsideE4();
                // }else if (Map_Methods.currentMap.equals("outsideN1E5")){
                //     blockMessage();
                //     OutsideMap.outsideN1E5();
                // }else if (Map_Methods.currentMap.equals("outsideN1E6")){
                //     blockMessage();
                //     OutsideMap.outsideN1E6();
                // }else if (Map_Methods.currentMap.equals("outsideN2W4")){
                //     OutsideMap.outsideN1W4();
                // }else if (Map_Methods.currentMap.equals("outsideN2W3")){
                //     OutsideMap.outsideN1W3();
                // }else if (Map_Methods.currentMap.equals("outsideN2W2")){
                //     OutsideMap.outsideN1W2();
                // }else if (Map_Methods.currentMap.equals("outsideN2W1")){
                //     OutsideMap.outsideN1W1();
                // }else if (Map_Methods.currentMap.equals("outsideN2")){
                //     OutsideMap.outsideN1();
                // }else if (Map_Methods.currentMap.equals("outsideN2E1")){
                //     OutsideMap.outsideN1E1();
                // }else if (Map_Methods.currentMap.equals("outsideN2E6")){
                //     OutsideMap.outsideN1E6();
                // }else if (Map_Methods.currentMap.equals("outsideN3W4")){
                //     OutsideMap.outsideN2W4();
                // }else if (Map_Methods.currentMap.equals("outsideN3W3")){
                //     OutsideMap.outsideN2W3();
                // }else if (Map_Methods.currentMap.equals("outsideN3W2")){
                //     OutsideMap.outsideN2W2();
                // }else if (Map_Methods.currentMap.equals("outsideN3W1")){
                //     OutsideMap.outsideN2W1();
                // }else if (Map_Methods.currentMap.equals("outsideN3E5")){
                //     blockMessage();
                //     OutsideMap.outsideN3E5();
                // }else if (Map_Methods.currentMap.equals("outsideN3E6")){
                //     OutsideMap.outsideN2E6();
                // }else if (Map_Methods.currentMap.equals("outsideN4W3")){
                //     OutsideMap.outsideN3W3();
                // }else if (Map_Methods.currentMap.equals("outsideN4W2")){
                //     OutsideMap.outsideN3W2();
                // }else if (Map_Methods.currentMap.equals("outsideN4W1")){
                //     OutsideMap.outsideN3W1();
                // }else if (Map_Methods.currentMap.equals("outsideN4")){
                //     blockMessage();
                //     OutsideMap.outsideN4();
                // }else if (Map_Methods.currentMap.equals("outsideN4E5")){
                //     OutsideMap.outsideN3E5();
                // }else if (Map_Methods.currentMap.equals("outsideN5W2")){
                //     OutsideMap.outsideN4W2();
                // }else if (Map_Methods.currentMap.equals("outsideN5W1")){
                //     OutsideMap.outsideN4W1();
                // }else if (Map_Methods.currentMap.equals("outsideN5")){
                //     OutsideMap.outsideN4();
                // }else if (Map_Methods.currentMap.equals("outsideN5E1")){
                //     blockMessage();
                //     OutsideMap.outsideN5E1();
                // }else if (Map_Methods.currentMap.equals("outsideN5E2")){
                //     blockMessage();
                //     OutsideMap.outsideN5E2();
                // }else if (Map_Methods.currentMap.equals("outsideN5E5")){
                //     OutsideMap.outsideN4E5();
                // }else if (Map_Methods.currentMap.equals("outsideN5E6")){
                //     blockMessage();
                //     OutsideMap.outsideN5E6();
                // }else if (Map_Methods.currentMap.equals("outsideN5E7")){
                //     blockMessage();
                //     OutsideMap.outsideN5E7();
                // }else if (Map_Methods.currentMap.equals("outsideN5E8")){
                //     blockMessage();
                //     OutsideMap.outsideN5E8();
                // }else if (Map_Methods.currentMap.equals("outsideN5E9")){
                //     blockMessage();
                //     OutsideMap.outsideN5E9();
                // }else if (Map_Methods.currentMap.equals("outsideN6W2")){
                //     OutsideMap.outsideN5W2();
                // }else if (Map_Methods.currentMap.equals("outsideN6W1")){
                //     OutsideMap.outsideN5W1();
                // }else if (Map_Methods.currentMap.equals("outsideN6")){
                //     OutsideMap.outsideN5();
                // }else if (Map_Methods.currentMap.equals("outsideN6E1")){
                //     OutsideMap.outsideN5E1();
                // }else if (Map_Methods.currentMap.equals("outsideN6E2")){
                //     OutsideMap.outsideN5E2();
                // }else if (Map_Methods.currentMap.equals("outsideN6E8")){
                //     OutsideMap.outsideN5E8();
            // ----------- MOVE WEST ----------- 
            // ----- DONE -----  
            }else if (Map_Methods.command.equalsIgnoreCase("Move West") || Map_Methods.command.equalsIgnoreCase("W") || Map_Methods.command.equalsIgnoreCase("West")) {
                if (Map_Methods.currentMap.equals("outsideE4")){
                    OutsideMap.outsideE3();
                }else if (Map_Methods.currentMap.equals("outsideE3")){
                    OutsideMap.outsideE2();
                }else if (Map_Methods.currentMap.equals("outsideE2")){
                    OutsideMap.outsideE1();
                }else if (Map_Methods.currentMap.equals("outsideE1")){
                    OutsideMap.startOutside();
                }else if (Map_Methods.currentMap.equals("startOutside")){
                    OutsideMap.outsideW1();
                }else if (Map_Methods.currentMap.equals("outsideW1")){
                    OutsideMap.outsideW2();
                }else if (Map_Methods.currentMap.equals("outsideW2")){
                    OutsideMap.outsideW3();
                }else if (Map_Methods.currentMap.equals("outsideW3")){
                    OutsideMap.outsideW4();
                }else if (Map_Methods.currentMap.equals("outsideW4")){
                    blockMessage();
                    OutsideMap.outsideW4();
                }else if (Map_Methods.currentMap.equals("outsideN1E6")){
                    OutsideMap.outsideN1E5();
                }else if (Map_Methods.currentMap.equals("outsideN1E5")){
                    OutsideMap.outsideN1E4();
                }else if (Map_Methods.currentMap.equals("outsideN1E4")){
                    OutsideMap.outsideN1E3();
                }else if (Map_Methods.currentMap.equals("outsideN1E3")){
                    OutsideMap.outsideN1E2();
                }else if (Map_Methods.currentMap.equals("outsideN1E2")){
                    OutsideMap.outsideN1E1();
                }else if (Map_Methods.currentMap.equals("outsideN1E1")){
                    OutsideMap.outsideN1();
                }else if (Map_Methods.currentMap.equals("outsideN1")){
                    OutsideMap.outsideN1W1();
                }else if (Map_Methods.currentMap.equals("outsideN1W1")){
                    OutsideMap.outsideN1W2();
                }else if (Map_Methods.currentMap.equals("outsideN1W2")){
                    OutsideMap.outsideN1W3();
                }else if (Map_Methods.currentMap.equals("outsideN1W3")){
                    OutsideMap.outsideN1W4();
                }else if (Map_Methods.currentMap.equals("outsideN1W4")){
                    blockMessage();
                    OutsideMap.outsideN1W4();
                }else if (Map_Methods.currentMap.equals("outsideN2E6")){
                    blockMessage();
                    OutsideMap.outsideN2E6();
                }else if (Map_Methods.currentMap.equals("outsideN2E1")){
                    OutsideMap.outsideN2();
                }else if (Map_Methods.currentMap.equals("outsideN2")){
                    OutsideMap.outsideN2W1();
                }else if (Map_Methods.currentMap.equals("outsideN2W1")){
                    OutsideMap.outsideN2W2();
                }else if (Map_Methods.currentMap.equals("outsideN2W2")){
                    OutsideMap.outsideN2W3();
                }else if (Map_Methods.currentMap.equals("outsideN2W3")){
                    OutsideMap.outsideN2W4();
                }else if (Map_Methods.currentMap.equals("outsideN2W4")){
                    blockMessage();
                    OutsideMap.outsideN2W4();
                }else if (Map_Methods.currentMap.equals("outsideN3E6")){
                    OutsideMap.outsideN3E5();
                }else if (Map_Methods.currentMap.equals("outsideN3E5")){
                    blockMessage();
                    OutsideMap.outsideN3E5();
                }else if (Map_Methods.currentMap.equals("outsideN3W1")){
                    OutsideMap.outsideN3W2();
                }else if (Map_Methods.currentMap.equals("outsideN3W2")){
                    OutsideMap.outsideN3W3();
                }else if (Map_Methods.currentMap.equals("outsideN3W3")){
                    OutsideMap.outsideN3W4();
                }else if (Map_Methods.currentMap.equals("outsideN3W4")){
                    blockMessage();
                    OutsideMap.outsideN3W4();
                }else if (Map_Methods.currentMap.equals("outsideN4E5")){
                    System.out.println("There's an empty crate here.");
                    System.out.println("Press any key to continue");
                    Map_Methods.userIn.nextLine();
                    OutsideMap.outsideN4E5();
                }else if (Map_Methods.currentMap.equals("outsideN4")){
                    OutsideMap.outsideN4W1();
                }else if (Map_Methods.currentMap.equals("outsideN4W1")){
                    OutsideMap.outsideN4W2();
                }else if (Map_Methods.currentMap.equals("outsideN4W2")){
                    OutsideMap.outsideN4W3();
                }else if (Map_Methods.currentMap.equals("outsideN4W3")){
                    blockMessage();
                    OutsideMap.outsideN4W3();
                }else if (Map_Methods.currentMap.equals("outsideN5E9")){
                    OutsideMap.outsideN5E8();
                }else if (Map_Methods.currentMap.equals("outsideN5E8")){
                    OutsideMap.outsideN5E7();
                }else if (Map_Methods.currentMap.equals("outsideN5E7")){
                    OutsideMap.outsideN5E6();
                }else if (Map_Methods.currentMap.equals("outsideN5E6")){
                    OutsideMap.outsideN5E5();
                }else if (Map_Methods.currentMap.equals("outsideN5E5")){
                    blockMessage();
                    OutsideMap.outsideN5E5();
                }else if (Map_Methods.currentMap.equals("outsideN5E2")){
                    OutsideMap.outsideN5E1();
                }else if (Map_Methods.currentMap.equals("outsideN5E1")){
                    OutsideMap.outsideN5();
                }else if (Map_Methods.currentMap.equals("outsideN5")){
                    OutsideMap.outsideN5W1();
                }else if (Map_Methods.currentMap.equals("outsideN5W1")){
                    OutsideMap.outsideN5W2();
                }else if (Map_Methods.currentMap.equals("outsideN5W2")){
                    if (Map_Methods.command.equalsIgnoreCase("Move West")
                    && (Map_Methods.checkOutsideN5W3 == false)){
                        System.out.println("You loot the crate...");
                        Map_Methods.randItem();
                        System.out.println("Press any key to continue");
                        Map_Methods.checkOutsideN5W3 = true;
                        Map_Methods.userIn.nextLine();
                        OutsideMap.outsideN5W2();
                    }else if (Map_Methods.command.equalsIgnoreCase("Move West")
                    &&  (Map_Methods.checkOutsideN5W3 == true)){
                        System.out.println("There's an empty crate here.");
                        System.out.println("Press any key to continue");
                        Map_Methods.userIn.nextLine();
                        OutsideMap.outsideN5W2();
                    }
                }else if (Map_Methods.currentMap.equals("outsideN6E8")){
                    blockMessage();
                    OutsideMap.outsideN6E8();
                }else if (Map_Methods.currentMap.equals("outsideN6E2")){
                    OutsideMap.outsideN6E1();
                }else if (Map_Methods.currentMap.equals("outsideN6E1")){
                    OutsideMap.outsideN6();
                }else if (Map_Methods.currentMap.equals("outsideN6")){
                    OutsideMap.outsideN6W1();
                }else if (Map_Methods.currentMap.equals("outsideN6W1")){
                    OutsideMap.outsideN6W2();
                }else if (Map_Methods.currentMap.equals("outsideN6W2")){
                    blockMessage();
                    OutsideMap.outsideN6W2();
                }
            }else if (Map_Methods.command.equalsIgnoreCase("exit")){
                System.exit(0);
            ////////////////////////////////////////////
            //DEV INPUTS, REMOVE LATER//////////////////
            ////////////////////////////////////////////
            // }else if (Map_Methods.command.equals("O LORD GIVE DEVROOM")){
            //     // dev_room.devRoom();
            //     // if (Map_Methods.classMap.equals("devRoom")) {
            //     //     dev_room.handleDevRoomCommand();
            //     //     //Doesn't work, will debug later.
            //     }
            }else if (Map_Methods.command.equals("O LORD GIVE DEATH")){ //Works fine!
                Map_Methods.playerDeath();
            }else if (Map_Methods.command.equals("O LORD GIVE DEMOLITION")){
                //Put on the backburner for now, will figure out later.
                Map_Methods.giveItem(Map_Methods.player, "Dynamite");
                Map_Methods.giveItem(Map_Methods.player, "Dynamite");
                System.out.println();
                System.out.println("Press any key to continue");
                Map_Methods.userIn.nextLine();
                //How do I call a map from here?
                //Either learn hashmaps or use a bunch of if statements... This is gonna take a while.
            // ----------- INVALID INPUT -----------
            } else {
                System.out.println("Not a valid option!");
            }
        }
    }

    // ----- Helper Methods -----
    public static void blockMessage() {
        System.out.println("The trees are thick here, you'd get lost trying to go through them\nPress any key to return.");
        // System.out.println("You'd get lost trying to go through them.");
        // System.out.println("Press any key to return.");
        Map_Methods.userIn.nextLine();
    }

    public static void rubbleMessage() {
        System.out.println("The way back is blocked by rubble from the train... Trying to walk through the reckage would probably kill you.\nPress any key to return."); 
        Map_Methods.userIn.nextLine();
    }
    
    public static void wallMessage() {
        System.out.println("You bump into the wall and fall onto your back.\n...You feel pretty stupid.\nPress any key to return");
        Map_Methods.userIn.nextLine();
    }
    
    ///////////////////////////////////////////
    //MISC/////////////////////////////////////
    ///////////////////////////////////////////
       // ----------- OUTSIDE MAP -----------
    // outsideLine1 = "TTTTTTTT.....TTTTT.TT"; N6
    // outsideLine2 = "TTTTTTT#.....TT.....T"; N5 
    // outsideLine3 = "TTTTTTT....TTT#.TTTTT"; N4
    // outsideLine4 = "TTTTTT....TTTTT..TTTT"; N3
    // outsideLine5 = "TTTTTT......TTTT.TTTT"; N2
    // outsideLine6 = "TTTTTT...........TTTT"; N1
    // outsideLine7 = "TTTTTT....o....TTTTTT";
    // outsideLine8 = "TTTTTTTT#####TTTTTTTT";
    //                 W     4321 123456789E
    //Note-- Line up with cursor for number, I.E next to the crate on N5 would be W2.
    // ----- STUBS FOR CASTLE1 -----
    public static void castle1_W10() {}
    public static void castle1_W9() {}
    public static void castle1_W8() {}
    public static void castle1_W7() {}
    public static void castle1_W6() {}
    public static void castle1_W5() {}
    public static void castle1_W4() {}
    public static void castle1_W3() {}
    public static void castle1_W2() {}
    public static void castle1_W1() {}
    public static void castle1() {}
    public static void castle1_E1() {}
    public static void castle1_E2() {}
    public static void castle1_E3() {}
    public static void castle1_E4() {}
    public static void castle1_E5() {}
    public static void castle1_E6() {}
    public static void castle1_N1W10() {}
    public static void castle1_N1W9() {}
    public static void castle1_N1W8() {}
    public static void castle1_N1W7() {}
    public static void castle1_N1W6() {}
    public static void castle1_N1W5() {}
    public static void castle1_N1W4() {}
    public static void castle1_N1W3() {}
    public static void castle1_N1W2() {}
    public static void castle1_N1W1() {}
    public static void castle1_N1() {}
    public static void castle1_N1E1() {}
    public static void castle1_N1E2() {}
    public static void castle1_N1E3() {}
    public static void castle1_N1E4() {}
    public static void castle1_N1E5() {}
    public static void castle1_N1E6() {}
    public static void castle1_N2W10() {}
    public static void castle1_N2W9() {}
    public static void castle1_N2W8() {}
    public static void castle1_N2W7() {}
    public static void castle1_N2W6() {}
    public static void castle1_N2W5() {}
    public static void castle1_N2W4() {}
    public static void castle1_N2W3() {}
    public static void castle1_N2W2() {}
    public static void castle1_N2W1() {}
    public static void castle1_N2() {}
    public static void castle1_N2E1() {}
    public static void castle1_N2E2() {}
    public static void castle1_N2E3() {}
    public static void castle1_N2E4() {}
    public static void castle1_N2E5() {}
    public static void castle1_N2E6() {}
    public static void castle1_N3W10() {}
    public static void castle1_N3W9() {}
    public static void castle1_N3W8() {}
    public static void castle1_N3W7() {}
    public static void castle1_N3W6() {}
    public static void castle1_N3W5() {}
    public static void castle1_N3W4() {}
    public static void castle1_N3W3() {}
    public static void castle1_N3W2() {}
    public static void castle1_N3W1() {}
    public static void castle1_N3() {}
    public static void castle1_N3E1() {}
    public static void castle1_N3E2() {}
    public static void castle1_N3E3() {}
    public static void castle1_N3E4() {}
    public static void castle1_N3E5() {}
    public static void castle1_N3E6() {}
    public static void castle1_N4W10() {}
    public static void castle1_N4W9() {}
    public static void castle1_N4W8() {}
    public static void castle1_N4W7() {}
    public static void castle1_N4W6() {}
    public static void castle1_N4W5() {}
    public static void castle1_N4W4() {}
    public static void castle1_N4W3() {}
    public static void castle1_N4W2() {}
    public static void castle1_N4W1() {}
    public static void castle1_N4() {}
    public static void castle1_N4E1() {}
    public static void castle1_N4E2() {}
    public static void castle1_N4E3() {}
    public static void castle1_N4E4() {}
    public static void castle1_N4E5() {}
    public static void castle1_N4E6() {}
    public static void castle1_N5W10() {}
    public static void castle1_N5W9() {}
    public static void castle1_N5W8() {}
    public static void castle1_N5W7() {}
    public static void castle1_N5W6() {}
    public static void castle1_N5W5() {}
    public static void castle1_N5W4() {}
    public static void castle1_N5W3() {}
    public static void castle1_N5W2() {}
    public static void castle1_N5W1() {}
    public static void castle1_N5() {}
    public static void castle1_N5E1() {}
    public static void castle1_N5E2() {}
    public static void castle1_N5E3() {}
    public static void castle1_N5E4() {}
    public static void castle1_N5E5() {}
    public static void castle1_N5E6() {}
    // ----------- CASTLE1 MAP -----------
    // castle1_1 = "###-##########-###";
    // castle1_2 = "|................#"; N5
    // castle1_3 = "#................#"; N4
    // castle1_4 = "#................#"; N3
    // castle1_5 = "#................|"; N2
    // castle1_6 = "#................#"; N1
    // castle1_7 = "#................#"; 
    // castle1_8 = "########=====#####";
    //             W1987654321 1234567
}
