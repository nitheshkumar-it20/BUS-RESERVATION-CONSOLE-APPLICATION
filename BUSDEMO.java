package Busres;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arraylist;
public class BUSDEMO {
   public static void main(String[] args) {
	   
	   ArrayList<BUS>buses=new ArrayList<BUS>();
	   ArrayList<booking>bookings=new ArrayList<booking>();
	   
	   buses.add(new BUS (1,true,2));
	   buses.add(new BUS (2,false,45));
	   buses.add(new BUS (3,true,50));
	   
	   for(BUS b:buses) {
		   b.displayinfo();
	   }
	   int useropt=1;
	   Scanner scanner=new Scanner(System.in);
	   while(useropt==1) {
	   System.out.println("Enter 1 to book and 2 to exit ");
	   useropt=scanner.nextInt();
	   if(useropt==1) {
		  booking book=new booking();
		   if(book.available(bookings,buses)) {
			   bookings.add(book);
			   System.out.println("Your booking is confirmed");
		   }
		   else {
			   System.out.println("The bus is full .Try another bus or date");
		   }
	   }
   }
}
}
