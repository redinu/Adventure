import java.util.Scanner;

public class Adventure {

	public static void main(String[] args) {
		
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		//Scanner keyboard = new Scanner(System.in);
		chooseAdventure();
		
	}
	
	public static String chooseAdventure(){
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You are in a creepy house!  Would you like to go 'upstairs' or into the"
				+ "'kitchen'?");
		String choice = keyboard.nextLine();
			
		if(choice.equalsIgnoreCase("kitchen")){
		
		
			System.out.println("There is a long countertop with dirty dishes everywhere.");
			System.out.println("Off to one side there is, as you'd expect, a refrigerator.");
			
			
			System.out.println( "You may open the 'refrigerator'or look in a 'cabinet'.");
			choice = keyboard.nextLine();
			
			     if(choice.equalsIgnoreCase("refrigerator")){
			    
				
			
			          System.out.println("Inside the refrigerator you see food and stuff. ");			
			          System.out.println("It looks pretty nasty. Would you like to eat some of the food? ('yes' or 'no')");
			          choice = keyboard.nextLine();
			 
			                if(choice.equalsIgnoreCase("no")){
					            System.out.println("You die of starvation... eventually.");
			                    }
			
			
			     }	else {
			    	 
			    	 System.out.println("Inside the cabinet you have got hidden treasures.");	
			     }
			
			
		}else {
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master 'bedroom'.");
			System.out.println("There is also a 'bathroom' off the hallway.  Where would you like to go?");
			choice = keyboard.nextLine();
			
			 	if (choice.equalsIgnoreCase("bedroom")){
			 		System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.");
			 		System.out.println("The bed is unmade.  In the back of the room, the closet door is ajar. ");
			 		System.out.println("Would you like to open the door? ('yes' or 'no')");
			 	
			 	choice = keyboard.nextLine();
				
			 	
			 		if(choice.equalsIgnoreCase("no")){
			 			System.out.println("Well, then I guess you'll never know what was in there. ");
			 			System.out.println("Thanks for playing, I'm tired of making nested if statements.");
			 		}
			 	} else {
			 		System.out.println("The bathroom is really dirty. You have to clean the bathroom");
			 		System.out.println("Thanks for playing, I'm tired of making nested if statements.");
			 	}
		}
		
		keyboard.close();
		
		return choice;
		
	}

}
