package org.tnsif.capgemini.c2tc.basicsofjava;

public class SwitchDemo {

	public static void main(String[] args) {

		String day="funday";
		
		switch(day)
		{
		case "Monday":
		case "monday":
		System.out.println("Attend the meetings");
		break;
			
		case "Tuesday":
		case "tuesday":
		System.out.println("Work on project task");
		break;
			
		case "Wednesday":
		case "wednesday":
		System.out.println("Submit the progress report");
		break;
			
		case "Thursday":
		case "thursday":
		System.out.println("client call and review");
		break;
		
		case "Friday":
		case "friday":
		System.out.println("wrap up weekly task");
		break;
		
		case "Saturday":
		case "saturday":
		case "Sunday":
		case "sunday": 
			System.out.println("enjoy the weekend");
			break;
			
			default:
			{
				System.out.println("invalid day");
			}
	
	}

}


	}

