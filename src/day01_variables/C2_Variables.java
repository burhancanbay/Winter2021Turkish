package day01_variables;

public class C2_Variables {
	
	public static void main(String[] args) {
		
		int sayi; //;yaz� dilindeki nokta gibidir.java ;� g�r�nce o sat�rdaki kod yaz�l�m�n�n bitti�ini anlar.
		sayi=27;
		
		System.out.print(sayi); // eger println degil de print yazarsak yazd�rma i�leminden sonra alt sat�ra ge�mez

		char ilkHarf='M';
		System.out.println(ilkHarf); // println yaz�nca yazma i�leminden sonra alt sat�ra ge�er
		
		double sayiDouble=5.34;
		
		System.out.println(sayiDouble);
		
		System.out.println(sayi+sayiDouble);
		
		System.out.println(sayi+ilkHarf); //27+77=104
		// eger bir toplama i�leminde char degi�ken kullan�l�rsa karakterin Ascii(Amerikan standart kodlama sistemi) degeri ile toplama yapar
		
	}

}
