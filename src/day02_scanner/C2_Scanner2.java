package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		// kullan�c�dan dairenin yar�cap�n� isteyip dairenin alan�n� yazd�r�n 
		
		Scanner scan=new Scanner(System.in);
        System.out.println("dairenin yar��ap�n� girin");
	    double yaricap=scan.nextDouble();
		
		System.out.println("girdi�iniz yar��apa ait dairenin alan�="+3.14*yaricap*yaricap);
		
		scan.close();

	}

}
