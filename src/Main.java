import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String Go, Look, Pantry, Eat, Open;

        System.out.println( " WELCOME TO MY TINY ADVENTURE");
        System.out.println("  ");
        System.out.println( " You are in a creepy house! Would you like to go to the 'kitchen' , go 'upstairs', go to the 'patio' , go to the 'living room' , or go to the 'basement' ? ");
        System.out.print( "> ");
        Go = keyboard.next();

        if (Go.equalsIgnoreCase ("kitchen"))
        {System.out.println("Would you like to open the 'refrigerator' or  'open cabinet'? ");}
        System.out.print(">  ");
        Open = keyboard.next();

            if (Open.equalsIgnoreCase( "refrigerator"))
            {System.out.println("Would you like to 'Drink strange milk' or 'Eat leftovers' ? ");
            System.out.print(">  ");
            Look = keyboard.next();

            if (Look.equalsIgnoreCase( "Drink strange milk"))
            {System.out.println(" ");
                System.out.println(" You did it!"); }

            else if (Look.equalsIgnoreCase("Eat leftovers"))
            { System.out.println("");
                 System.out.println("The leftovers killed you"); }
        if (Open.equalsIgnoreCase("open cabinet"))
        {System.out.println("Would you like to 'Eat can of beans' or 'Take a plate' ?");
            System.out.print(">  ");


        if (Look.equalsIgnoreCase( "refrigerator" ))
        {System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty. Would you like to eat some of the food, 'Yes' or 'No'?");}
        System.out.print(">  ");
        Eat = keyboard.next();

        if (Eat.equalsIgnoreCase("Yes"))
        {System.out.println("  ");
            System.out.println("You live!");}

        else if (Eat.equalsIgnoreCase("No"))
        {System.out.println("  ");
            System.out.println("You die of starvation!");}



        else if (Look.equalsIgnoreCase( "pantry" ))
        {System.out.println("There is a killer inside. Do you want to 'fight' them, or 'run away'?");}
        System.out.print(">  ");
        Pantry = keyboard.next();

        if (Pantry.equalsIgnoreCase("fight"))
        {System.out.println("  ");
            System.out.println("You're weak and die");}

        else if(Pantry.equalsIgnoreCase("run away"))
        {System.out.println("  ");
            System.out.println("You died because your too slow & can't run");}









    }
}
