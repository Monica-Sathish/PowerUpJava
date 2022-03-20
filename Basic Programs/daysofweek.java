package prgs;
import java.util.*;
public class daysofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		switch(num) {
		case 0: System.out.println("Sunday");break;
		case 1: System.out.println("Monday");break;
		case 2: System.out.println("Tueday");break;
		case 3: System.out.println("Wednesday");break;
		case 4: System.out.println("Thursday");break;
		case 5: System.out.println("Friday");break;
		case 6: System.out.println("Saturday");break;
		default: System.out.println("Wrong Input");break;
		}
	}

}
