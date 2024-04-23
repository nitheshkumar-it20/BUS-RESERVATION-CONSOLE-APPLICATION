package Busres;

public class BUS {
   private int busno;
   private boolean ac;
   private int capacity;
   
   BUS(int no,boolean ac,int cap){
	   this.busno=no;
	   this.ac=ac;
	   this.capacity=cap;
   }
   
  

public BUS() {
	// TODO Auto-generated constructor stub
}



public int getCapacity(){
	   return capacity;
   }
   
   public void setCapacity(int cap) {
	   capacity=cap;
   }
   
   public int getbusno(){
	   return busno;
   }
   
   public boolean getac(){
	   return ac;
   }
   
   public void setac(boolean act){
	   ac=act;
   }
   
   public void displayinfo() {
	   System.out.println("Bus no: "+busno+", Ac: "+ac+", Capacity "+capacity);
   }
}
