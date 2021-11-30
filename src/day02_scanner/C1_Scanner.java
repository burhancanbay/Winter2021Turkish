package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("karenin bir kenarýn uzunluðunu girin");
		
		double kenar=scan.nextDouble();
		
		System.out.println("girdiðiniz kenar uzunluðuna ait karenin alaný="+kenar*kenar);
		
		scan.close();
		
	}
		
		
	}


