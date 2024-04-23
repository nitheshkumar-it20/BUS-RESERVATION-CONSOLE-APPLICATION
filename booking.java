package Busres;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class booking {
	
	 public BUS obj;
	 
    String passengername;
    int busno;
    Date date;
    
    booking(){
    	obj=new BUS();
    	Scanner scanner=new Scanner(System.in);
    	System.out.println("Enter the name of the passenger");
    	passengername=scanner.next();
    	System.out.println("Enter the busno");
    	busno=scanner.nextInt();
    	System.out.println("Enter date dd-mm-yyyy");
    	String dateinput=scanner.next();
    	SimpleDateFormat dateformat=new SimpleDateFormat("dd-mm-yyyy");
    	try {
			date=dateformat.parse(dateinput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
   

    
   public boolean  available(ArrayList<booking>bookings,ArrayList<BUS>buses) {
	   int capacity=0;
	   for(BUS b:buses) {
		   System.out.println(b.getbusno());
		   if(b.getbusno()==busno) {
			   			   capacity=b.getCapacity();
		   }
	   }
	   int booked=0;
	   for(booking b:bookings) {
		   if(b.busno==busno && b.date.equals(date)) {
			   booked++;
		   }
	   }
	   System.out.println(booked);
	   System.out.println(capacity);
	   return booked<capacity?true:false;
   }
}
