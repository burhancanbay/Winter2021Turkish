package day05_wrapperConcatenationOperators;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir sayýnýn birler basamaðýný yazdýrýn
		
		int sayi=1469;
		System.out.println("verilen sayýnýn birler basamaðý= " + sayi%10);
		
		// verilen sayýnýn birler basamaðý hariç yazdýrýn
		System.out.println(sayi/10); // sayýnýn deðeri deðiþmez
		System.out.println(sayi);    // sayýnýn deðeri 1469 dur
		
		System.out.println(sayi/=10);// sayýnýn deðeri deðiþir ve kalýcý olarak 146 olur
		System.out.println(sayi);

	}

}
