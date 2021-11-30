package day02_scanner;

import java.util.Scanner;

public class C2_Scanner2 {

	public static void main(String[] args) {
		
		// kullanýcýdan dairenin yarýcapýný isteyip dairenin alanýný yazdýrýn 
		
		Scanner scan=new Scanner(System.in);
        System.out.println("dairenin yarýçapýný girin");
	    double yaricap=scan.nextDouble();
		
		System.out.println("girdiðiniz yarýçapa ait dairenin alaný="+3.14*yaricap*yaricap);
		
		scan.close();

	}

}
