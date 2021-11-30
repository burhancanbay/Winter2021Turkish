package day04_matematikselIslemlerModulus;



public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus operatörü bölme iþlminde kalaný verir.
		// herhangi bir sayýnýn mesela 7 ile bölünüp bölünemediðini bulmak için kalan=0 olup olmadýðýna bakýlýr.
		
		int kalan=15%4;
		System.out.println(kalan);
		System.out.println(26%5);

		// 856 nýn birler basamaðýný yazdýrýn
	
		int birlerBasamagi=856%10;
		System.out.println("sayýnýn birler basamaðý= " + birlerBasamagi);

		// 856 sayýsýnýn onlar basamaðýný yazdýrýn
		int sayi=856;
		sayi/=10;
		System.out.println(sayi);
	    
		System.out.println("onlar basamaðý= "+ sayi%10);
		
		// yüzler basamaðýný bulmak için tekrar 10 a bölelim
		
		sayi/=10;
		System.out.println("yüzler basamaðý= " + sayi);

		
		
	}

}
