package day02_scanner;

import java.util.Scanner;

public class C1_Scanner {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("karenin bir kenar�n uzunlu�unu girin");
		
		double kenar=scan.nextDouble();
		
		System.out.println("girdi�iniz kenar uzunlu�una ait karenin alan�="+kenar*kenar);
		
		scan.close();
		
	}
		
		
	}


