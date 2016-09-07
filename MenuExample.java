import java.util.*; //scanner
/**
* Sample Crash proof text-based menu
* @author Lisa Miller
* @since 9/7/2016
*/
public class MenuExample{
   public static void main(String[] args){
      Scanner userIn = new Scanner(System.in);
      String inString = new String("");
      boolean endLoop = false;
      
      //loop until stopping condition is given
      while(endLoop != true){
         //menu text
         System.out.println("Please enter the number of your choice:");
         System.out.println("1. Add a Pokemon");
         System.out.println("2. Print all Pokemon");
         System.out.println("0. Exit the program");
         System.out.print("What would you like to do? ");
         
         //read in from user as a String -- much less errors can happen!
         inString = userIn.nextLine();
         
         //take off any spaces on the string
         inString = inString.trim();
         
         //just switch on the String no need to convert to int
         switch(inString){
            case "0": endLoop = true;
                     System.out.println("Good bye!");
                     break;
            case "1": //do stuff to make a new Pokemon         
                     System.out.println("\n*****A new pokemon should get put into the array****\n");
                     break;
            case "2": //print out all the Pokemon
                     System.out.println("\n****The array should be printed****\n");
                     break;
             default: //not a valid menu entry
                     System.out.println("\n****Invalid menu choice.****\nPlease enter a 0, 1, or 2\n");
                     break;        
         
         }
      
      
      }
      
   
   }
}