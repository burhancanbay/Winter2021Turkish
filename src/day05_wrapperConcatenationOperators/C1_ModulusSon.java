package day05_wrapperConcatenationOperators;

public class C1_ModulusSon {

	public static void main(String[] args) {
		// verilen bir say�n�n birler basama��n� yazd�r�n
		
		int sayi=1469;
		System.out.println("verilen say�n�n birler basama��= " + sayi%10);
		
		// verilen say�n�n birler basama�� hari� yazd�r�n
		System.out.println(sayi/10); // say�n�n de�eri de�i�mez
		System.out.println(sayi);    // say�n�n de�eri 1469 dur
		
		System.out.println(sayi/=10);// say�n�n de�eri de�i�ir ve kal�c� olarak 146 olur
		System.out.println(sayi);

	}

}
