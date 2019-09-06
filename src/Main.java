import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in).useDelimiter("\n");

        String Go, Outside, Room, Open, Choice, Yes, Paper, Patio, Pool, Weapon, Hammer, Ax, Tv, Volume, Door, Couch, Basement, Laundry, Dark;

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
                    System.out.println(" ");
                    System.out.println(" You did it!");
                } else if (Choice.equalsIgnoreCase("Eat leftovers")) {
                    System.out.println(" ");
                    System.out.println("The leftovers killed you");
                }
            } else if (Open.equalsIgnoreCase("open cabinet")) {
                {
                    System.out.println("Would you like to 'Eat can of beans' or 'Take a plate' ?");
                }
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
        } else if (Go.equalsIgnoreCase("upstairs")) {
            System.out.println("There is a 'bedroom' and a 'bathroom' . Which would you like to enter ?");

            System.out.println("> ");
            Room = keyboard.next();

            if (Room.equalsIgnoreCase("bedroom")) {
                {
                    System.out.println("Would you like to 'lay on bed' or 'open the drawer' ?");
                }

                System.out.println("> ");
                Yes = keyboard.next();

                if (Yes.equalsIgnoreCase("lay on bed")) {
                    System.out.println("");
                    System.out.println("Take a nap!");
                } else if (Yes.equalsIgnoreCase("open the drawer")) {
                    System.out.println("");
                    System.out.println("Jet fuel cant melt steel beams");
                }
            } else if (Room.equalsIgnoreCase("bathroom")) {
                {
                    System.out.println("would you like to 'look in mirror' or 'use the toilet' ?");
                }
                System.out.println(">");
                Paper = keyboard.next();

                if (Paper.equalsIgnoreCase("look in mirror")) {
                    System.out.println("");
                    System.out.println("youre ugly");
                } else if (Paper.equalsIgnoreCase("use the toilet")) {
                    System.out.println("");
                    System.out.println("you ate taco bell");
                }
            }

        } else if (Go.equalsIgnoreCase("patio")) {
            System.out.println("Would you like to 'go to the pool' or 'open shed' ?");

            System.out.println("> ");
            Patio = keyboard.next();

            if (Patio.equalsIgnoreCase("go to the pool")) {
                {
                    System.out.println("Would you like to 'clean the pool' or 'swim in the pool' ?");
                }
                System.out.println("> ");
                Pool = keyboard.next();
                if (Pool.equalsIgnoreCase("clean the pool")) {
                    System.out.println("");
                    System.out.println("Good job!");
                } else if (Pool.equalsIgnoreCase("swim in the pool")) {
                    System.out.println(" ");
                    System.out.println("You cant swim!");
                }

            } else if (Patio.equalsIgnoreCase("open shed")) {
                System.out.println("Would you like to 'take an ax' or 'take a hammer' ?");

                System.out.println("> ");
                Weapon = keyboard.next();

                if (Weapon.equalsIgnoreCase("take an ax")) {
                    {
                        System.out.println("Would you like to 'chop a tree' or 'throw the ax' ?");
                    }

                    System.out.println("> ");
                    Ax = keyboard.next();

                    if (Ax.equalsIgnoreCase("chop a tree")) {
                        System.out.println(" ");
                        System.out.println("Nice!");
                    } else if (Ax.equalsIgnoreCase("throw the ax")) {
                        System.out.println("good throw");

                    }

                } else if (Weapon.equalsIgnoreCase("take a hammer")) {
                    {
                        System.out.println("would you like to 'hammer a nail' or 'break the hammer' ?");
                    }
                    System.out.println("> ");
                    Hammer = keyboard.next();
                    if (Hammer.equalsIgnoreCase("hammer a nail")) {
                        System.out.println(" ");
                        System.out.println("Good job!");
                    } else if (Hammer.equalsIgnoreCase("break the hammer")) {
                        System.out.println(" ");
                        System.out.println("Bad job");
                    }


                }
            }
        } else if (Go.equalsIgnoreCase("living room")) {

            System.out.println("would you lke to 'turn on the tv' or 'sit on the couch' ?");

            System.out.println("> ");
            Room = keyboard.next();

            if (Room.equalsIgnoreCase("turn on the tv")) {
                System.out.println("Would you like to ' change the channel' or 'stay on the first channel' ? ");
                System.out.println("> ");
                Tv = keyboard.next();

                if (Tv.equalsIgnoreCase("change the channel")) {
                    System.out.println("would you like to 'increase volume' or 'decrease volume' ?");
                    System.out.println("> ");
                    Volume = keyboard.next();

                    if (Volume.equalsIgnoreCase("increase volume")) {
                        System.out.println(" ");
                        System.out.println("good job");
                    } else if (Volume.equalsIgnoreCase("decrease volume")) {
                        System.out.println(" ");
                        System.out.println("Bad job");
                    }
                } else if (Tv.equalsIgnoreCase("stay on the first channel")) {
                    System.out.println("Would you like to 'go open the door' or 'ignore the door' ?");
                    System.out.println("> ");
                    Door = keyboard.next();

                    if (Door.equalsIgnoreCase("go open the door")) {
                        System.out.println("good job");
                    } else if (Door.equalsIgnoreCase("ignore the door")) {
                        System.out.println("bad job");
                    }
                }
            } else if (Room.equalsIgnoreCase("sit on the couch")) {
                System.out.println("would you like to 'look out the window' or 'start to eat' ?");
                System.out.println("> ");
                Couch = keyboard.next();

                if (Couch.equalsIgnoreCase("look out the window")) {
                    System.out.println("good job");
                } else if (Couch.equalsIgnoreCase("start to eat")) {
                    System.out.println("popeyes is not better than chick fil a");
                }
            }
        } else if (Go.equalsIgnoreCase("basement")) {
            System.out.println("would you like to 'turn on the lights' or 'walk in the dark' ?");
            System.out.println("> ");
            Basement = keyboard.next();

            if (Basement.equalsIgnoreCase("turn on the lights")) {
                System.out.println("Would you like to ' turn the laundry on' or 'turn the lights off' ?");

                System.out.println("> ");
                Laundry = keyboard.next();

                if (Laundry.equalsIgnoreCase("turn the laundry on")) {
                    System.out.println("jet fuel cant melt steel beams");
                } else if (Laundry.equalsIgnoreCase("turn the lights off")) {
                    System.out.println("jet fuel can melt stel beams");
                }
            } else if (Basement.equalsIgnoreCase("walk in the dark")) {
                System.out.println("do you want to 'open a chest' or 'open a closet' ?");
                System.out.println("> ");
                Dark = keyboard.next();

                if (Dark.equalsIgnoreCase("open a chest")) {
                    System.out.println("you died");
                } else if (Dark.equalsIgnoreCase("open a closet")) {
                    System.out.println("you died");
                }
            }
        }
    }
}






























