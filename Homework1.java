/*
 * Written by Jacinda Orr
 */
import java.util.Scanner;


public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner keyboard = new Scanner (System.in);//This allows the scanner to take in the information that the user inputed
		
		

		System.out.println("Welcome to College Simulator\nDo you get up and get ready, Set another 5 minute timer or snooze the alarm completly\nPress 1 for get up, 2 for 5 minute timer, and 3 for snooze" );
		String choice = keyboard.nextLine();
		
		if (choice.equals("1")){ //This is where the first ending starts all the other endings have a similar layout to this one
			System.out.println("You got up and were on time to class!");
		} else if (choice.equals("2")){ // this happens if the user does not pick the first choice
			System.out.println("You got up but were late to class!");
		} else if (choice.equals("3")){ // if the user decides not to pick the first or second choice then it goes onto option 3
			System.out.println("You did not get up and missed class!");
	} else {
			System.out.println("Invalid choice.");
		}
		
		// This is where ending 2 starts
	System.out.println("You are feeling a little hungry. Do you go buy a small snack/meal nearby or purchase nothing\nPress 1 for snack and 2 for nothing");
	String foodChoice = keyboard.nextLine();
if (foodChoice.equals("1")){
	System.out.println("You are no longer hungry but spent $10!");
} else if (foodChoice.equals("2")){
	System.out.println("You are hungry but you saved money!");
} else {
		System.out.println("Invalid choice.");
	}

//ending 3 starts
System.out.println("You are home what shoud you do?");
System.out.println("You can do homework/study, clean, or have free time on your phone.\nPress 1 for homework, 2 for clean, and 3 for freetime");
String boredChoice = keyboard.nextLine();

if (boredChoice.equals("1")){
System.out.println("You completed lots of homework and feel more knowledegable on your schoolwork!");
} else if (boredChoice.equals("2")){
System.out.println("Your house is clean but you did not complete any work!");
} else if (boredChoice.equals("3")){
	System.out.println("You got nothing completed but had some good laughs!");
} else {
	System.out.println("Invalid choice.");
}

//ending 4 starts
System.out.println("You have another class in an hour? You can leave 45 minutes early or leave 10 minutes early.\nPress 1 for forty five or 2 for ten");
String secondClassChoice = keyboard.nextLine();

if (secondClassChoice.equals("1")){
System.out.println("You found parking and were on time to class!");
} else if (secondClassChoice.equals("2")){
System.out.println("You eventually found parking and were 30 minutes late to class!");
} else {
	System.out.println("Invalid choice.");
}

// ending 5 starts
	System.out.println("There was a one quesiton pop quiz at the end of the class.");
	System.out.println("The question read, Is attendance mandatory in this class?\nIs this true or false");
	boolean answer = keyboard.nextBoolean();
	if (!answer) {
		System.out.println("Correct, you got an 100%");
	} else {
		System.out.println("Incorrect, you got a 0%");
	}
		keyboard.nextLine();
	
	// ending 6 starts
	System.out.println("You go back home and are decinding on dinner. You are having a calorie crisis.");
	System.out.println("Press 1 for Buldak noodles, 2 for Avacado/leftover chicken, and 3 for nothing.");
	System.out.println("1. Buldak Noodles(<= 600 calories)");
	System.out.println("2. Avacado/leftover chicken(<= 400 calories)");
	System.out.println("3. Nothing(< 0 calories)");
	
	int calorieChoice = keyboard.nextInt();
	int calories = 0;
	
	if (calorieChoice == 1) {
		calories = 600;
		if (calories <= 600) {
			System.out.println("You chose Buldak Noodles. Not the healthiest meal but at least you ate. Total = " + calories + "calories.");
		}
	} else if (calorieChoice == 2) {
		calories = 400;
		if (calories<= 400) {
		System.out.println("You chose Avacado/leftover chickens. Not a bad choice. Great way to get protien and fiber. Total = " + calories + "calories.");
	}
	} else if (calorieChoice == 3) {
		calories = -1;
		if (calories <0) {
		System.out.println("You chose Nothing. Not a great choice. You are now hungry. Total = " + calories + "calories.");
		}
	} else {
		System.out.println("Invalid choice.");
}
keyboard.nextLine();

	//ending 7
	System.out.println("Your squad leaders need to know will you be at a volunteer event next weekend. Type yes or no");
	String squadChoice = keyboard.nextLine();
	
	if (squadChoice.equalsIgnoreCase("yes")){
		System.out.println("They were happy and you are safe from future details for up to 1 week!");
	} else if (squadChoice.equals("no")){
		System.out.println("They made you find another cadet in your place");
	} else {
			System.out.println("Invalid choice.");
	}

	//ending 8
	System.out.println("You are unsure of what to do it is 9:00 pm. Should you have free time or go to bed");
	System.out.println("Press 1 for free time and 2 for bed.");
	String freeChoice = keyboard.nextLine();
if (freeChoice.equals("1")){
	System.out.println("You spent the perfect amount of downtime and had a peaceful night of sleep!");
} else if (freeChoice.equals("2")){
	System.out.println("You woke up at 3:00 am");
} else {
		System.out.println("Invalid choice.");
	}
// ending 9
System.out.println("Your alarm goes off for PT. Should you get up or snooze");
System.out.println("Press 1 for get up and 2 for snooze");
String ptChoice = keyboard.nextLine();

if (ptChoice.equals("1")){ 
	System.out.println("You make it to PT on time and had a great workout!");
} else if (ptChoice.equals("2")){
		System.out.println("You were late to PT and it was one of the worst days you have had in a while!");
} else { 
	System.out.println("Invalid choice");
}


System.out.println("Thank you for playing College Simulator.");//The next two lines help end the game
System.exit(0);

	}	
}
	
