package day04_matematikselIslemlerModulus;



public class C2_ModulusOperatoru {

	public static void main(String[] args) {
		
		// modulus operat�r� b�lme i�lminde kalan� verir.
		// herhangi bir say�n�n mesela 7 ile b�l�n�p b�l�nemedi�ini bulmak i�in kalan=0 olup olmad���na bak�l�r.
		
		int kalan=15%4;
		System.out.println(kalan);
		System.out.println(26%5);

		// 856 n�n birler basama��n� yazd�r�n
	
		int birlerBasamagi=856%10;
		System.out.println("say�n�n birler basama��= " + birlerBasamagi);

		// 856 say�s�n�n onlar basama��n� yazd�r�n
		int sayi=856;
		sayi/=10;
		System.out.println(sayi);
	    
		System.out.println("onlar basama��= "+ sayi%10);
		
		// y�zler basama��n� bulmak i�in tekrar 10 a b�lelim
		
		sayi/=10;
		System.out.println("y�zler basama��= " + sayi);

		
		
	}

}
