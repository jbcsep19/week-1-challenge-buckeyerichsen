import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String Go, Outside, Room, Open, Choice;

        System.out.println(" WELCOME TO MY TINY ADVENTURE");
        System.out.println("  ");
        System.out.println(" You are in a creepy house! Would you like to go to the 'kitchen' , go 'upstairs', go to the 'patio' , go to the 'living room' , or go to the 'basement' ? ");
        System.out.print("> ");
        Go = keyboard.next();

        if (Go.equalsIgnoreCase("kitchen")) {
            System.out.println("Would you like to open the 'refrigerator' or  'open cabinet'? ");

            System.out.print(">  ");
            Open = keyboard.next();

            if (Open.equalsIgnoreCase("refrigerator")) {
                {
                    System.out.println("Would you like to 'Drink strange milk' or 'Eat leftovers' ? ");
                }

                System.out.print(">  ");
                Choice = keyboard.next();

                if (Choice.equalsIgnoreCase("Drink strange milk")) {

                    {
                        System.out.println(" ");
                        System.out.println(" You did it!");
                    }

                } else if (Choice.equalsIgnoreCase("Eat leftovers")) {
                    System.out.println("");
                    System.out.println("The leftovers killed you");

                } else if (Open.equalsIgnoreCase("open cabinet")) {
                    System.out.println("Would you like to 'Eat can of beans' or 'Take a plate' ?");
                    System.out.print(">  ");
                    Outside = keyboard.next();

                    if (Outside.equalsIgnoreCase("Eat can of beans")) {
                        System.out.println("");
                        System.out.println("The beans killed you!");
                    } else if (Outside.equalsIgnoreCase("Take a plate")) {
                        System.out.println("");
                        System.out.println("Plates are pointless");
                    }
                }

//            if (Go.equalsIgnoreCase("upstairs")) {
//                System.out.println("There is a 'bedroom' and a 'bathroom' . Which would you like to enter ? ");
//            }
//            System.out.print(">  ");
//            Room = keyboard.next();
//
//            if (Room.equalsIgnoreCase("bedroom")) {
//                System.out.println("  ");
//                System.out.println("Would you like to 'lay on the bed' or 'open the drawer' ?");
//            }
//            if (Room.equalsIgnoreCase("lay on the bed")) {
//                System.out.println("  ");
//                System.out.println("You fell asleep!");
//            } else if (Room.equalsIgnoreCase("open the drawer")) {
//                System.out.println("");
//                System.out.println("There was nothing in the drawer");
//            }
//            if (Room.equalsIgnoreCase("bathroom")) {
//                System.out.println("Would you like to 'look in the mirror' or 'use the toilet' ?");
//                if (Room.equalsIgnoreCase("look in the mirror")) {
//                    System.out.println("youre ugly");
//                    if (Room.equalsIgnoreCase("use the toilet")) {
//                        System.out.println("you ate taco bell");
//                    }
//
//                }
//            }
//        }
//        if (Go.equalsIgnoreCase("patio")) {
//            System.out.println("would you like to 'go to the pool' or 'open the shed' ?");
//        }
//        System.out.print(">  ");
//        Outside = keyboard.next();
//        if (Outside.equalsIgnoreCase("go to the pool")) {
//            System.out.println("would you like to 'clean the pool'  or 'swim in the pool' ?");
//            if (Outside.equalsIgnoreCase("clean the pool")) ;
//            System.out.println("");
//            System.out.println("you did a good job cleaning");
//
//
//            if (Outside.equalsIgnoreCase("fight")) {
//                System.out.println("  ");
//                System.out.println("You're weak and die");
//            } else if (Outside.equalsIgnoreCase("run away")) {
//                System.out.println("  ");
//                System.out.println("You died because your too slow & can't run");
//            }


            }
        }
    }
}








