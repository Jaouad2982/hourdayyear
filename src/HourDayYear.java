import java.util.Scanner;

public class HourDayYear {
	private static Scanner s=new Scanner(System.in);
public static void main(String[]args){
	
	

	System.out.println("Enter the number of minutes");
	double minutes=s.nextLong();
	System.out.println("the number Of hours is " + calculateHours(minutes));
	System.out.println("The number Of days is " + (calculateDays(calculateHours(minutes))));
	System.out.println("The number Of years is " + (calculateYear(calculateDays(calculateHours(minutes)))));
	
}
public static double calculateHours(double minutes){
	return minutes/60;
}
public static double calculateDays(double heures){
	return heures/24;
}
public static double calculateYear(double oneday){
	return oneday/365;
}

}