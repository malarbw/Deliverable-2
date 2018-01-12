import java.text.SimpleDateFormat; //allows for use of date format (MM/DD/YY : HH/mm/ss) in the input
import java.util.Scanner;
import java.util.Date;

public class DateDifferent {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //allows for user input
		
		System.out.print("Please enter two dates in the format of MM/DD/YYYY");
		System.out.print("Date 1: ");
		String firstDate = input.nextString();
		System.out.print("Date 2: ");
		String secDate = input.nextString();

		SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy"); 

		Date d1 = null;
		Date d2 = null;

		try { /*Honestly I'm not sure if I fully understand the mechanism of the try statement here, but this is how the example I was 
				able to find executed the task*/
				
			d1 = format.parse(firstDate);
			d2 = format.parse(secDate);

			long diff = d2.getTime() - d1.getTime();
			
			long diffDays = diff / (24 * 60 * 60 * 1000);
			long diffMonths = diff / (30 * 24 * 60 * 60 * 1000);
			long diffYears = diff / (12 * 30 * 24 * 60 * 1000);
			
			System.out.print("The difference in time between these two dates are: "); //Simple output directions to show the time difference
			System.out.print(diffYears + " years, ");
			System.out.print(diffMonths + " months, ");
			System.out.print(diffDays + " days.");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}