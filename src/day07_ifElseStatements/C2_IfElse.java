package day07_ifElseStatements;

import java.util.Scanner;

public class C2_IfElse {

	public static void main(String[] args) {
		//kullan�c�dan d�rtgenin kenar uzunluklar�n� al�n 
		//uzunluklar e�it ise kare de�il ise dikd�rtgen yazd�ral�m
		
		Scanner scan=new Scanner(System.in);
		System.out.println("d�rtgenin kenar uzunluklar�n� girin");
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		
		if (kenar1==kenar2) {
			System.out.println("d�rtgen karedir");
			
		} else { System.out.println("d�rtgen dikd�rtgendir");

		}
scan.close();
	}

}
