import java.util.*;
class calculateHeartrate {

	public static void main(String [] args) {

	Scanner scan = new Scanner (System.in);
	System.out.println("Enter your name :");
	String name = scan.nextLine();

	System.out.println("Enter your age:");
	int age = scan.nextInt();

	System.out.println("Enter your PulseRate :");
	float PulseRate = scan.nextFloat();

	double Resting_Heart_Rate = Math.sqrt(PulseRate * 60);
	System.out.println("Hello " + name + ", Your Resting rate is " +Resting_Heart_Rate);

	if ((Resting_Heart_Rate<60) && (age<18)) {
	
		System.out.println("Level of the activity Below Normal");
	}

	else if ((Resting_Heart_Rate<65) && (age == 18)) {

		System.out.println("Level of the activity Normal");

	}

	else if ((Resting_Heart_Rate<120) && (age < 28)) {

		System.out.println("Level of the activity Above Average");	

	}

	else {

		System.out.println("Level of the activity High");
	}

	
	}

}