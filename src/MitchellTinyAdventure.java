import java.util.*;
public class MitchellTinyAdventure {

	public static void main(String[] args) {
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println("You are in a creepy house!  Would you like to go the \"uPstairs\" or into the \"KITCHEN\" ?");
        String response;
        Scanner sc = new Scanner(System.in);
        
        response = sc.next();
        Response(response ,sc);
        sc.close();
        
	}
   
	public static  String Response(String response ,Scanner sc)
	{
		
		if(response.equalsIgnoreCase("kitchen"))
		{
			System.out.println("There is a long countertop with dirty dishes everywhere. Off to one sidethere is, as you\'d expect, a refrigerator. You may open the \"refrigerator\"or look in a \"cabinet\".");
			response = sc.next();
			if(response.equalsIgnoreCase("cabinet"))
				System.out.println("There is a venemous snake and it bits you!!!!!HAHAHAAHAHHAAHHAAHHAHAHHAH!");
			else if(response.equalsIgnoreCase("refrigerator"))
			{
				System.out.println("Inside the refrigerator you see food and stuff. It looks pretty nasty.Would you like to eat some of the food? (\"yes\" or \"no\")");
				response = sc.next();
				if(response.equalsIgnoreCase("yes"))
				{
					System.out.println("You are sick!!!");
				}
				else
				{
				    System.out.println("Your Gonna Die!!!");
				}
			}
		}
		else if(response.equalsIgnoreCase("upstairs"))
		{
			System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you liketo go?");
			response = sc.next();
			if(response.equalsIgnoreCase("bedroom"))
			{
				System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The bed is unmade.  In the back of the room, the closet door is ajar.  Would youlike to open the door? (\"yes\" or \"no\")");
				if(response.equalsIgnoreCase("yes"))
				{
					System.out.println("Hhahahahh a killer is hiding and he shoots you dead");
				}
				else
				{System.out.println("You are a coward ..........Go muster up some courage you scared cat!!!!");}
			}else if (response.equalsIgnoreCase("bathroom"))
			{
				System.out.println("You are responsible for the blood on the floor...............hahhahhahaahahahahhha");
			}
			}
		
		return response;
	}

}
