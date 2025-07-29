package Lab1;

import java.util.Scanner;

public class Restaurantbill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  bill,gst,maintainance,totalbill;
	      double disc,finalbill;
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter item bill ");
	      bill=sc.nextInt();
	      gst=sc.nextInt();
	      maintainance=sc.nextInt();
	          totalbill=bill+gst+maintainance;
	          if(totalbill>1000)
	            disc=(totalbill*10)/100; 
	          else
	            disc=(totalbill*5)/100;
	        finalbill=totalbill-disc;
	        System.out.println("itembill "+bill);
	        System.out.println("gst "+gst);
	        System.out.println("maint "+bill);
	        System.out.println("disc "+disc);
	        System.out.println("totalbill "+totalbill);
	        System.out.println("finalbill "+finalbill);
	        sc.close();
	      
	  }

	}