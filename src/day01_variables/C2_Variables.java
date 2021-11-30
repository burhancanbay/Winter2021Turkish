package day01_variables;

public class C2_Variables {
	
	public static void main(String[] args) {
		
		int sayi; //;yazý dilindeki nokta gibidir.java ;ü görünce o satýrdaki kod yazýlýmýnýn bittiðini anlar.
		sayi=27;
		
		System.out.print(sayi); // eger println degil de print yazarsak yazdýrma iþleminden sonra alt satýra geçmez

		char ilkHarf='M';
		System.out.println(ilkHarf); // println yazýnca yazma iþleminden sonra alt satýra geçer
		
		double sayiDouble=5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi+sayiDouble);
		
		System.out.println(sayi+ilkHarf); //27+77=104
		// eger bir toplama iþleminde char degiþken kullanýlýrsa karakterin Ascii(Amerikan standart kodlama sistemi) degeri ile toplama yapar
		
	}

}
