package day05_wrapperConcatenationOperators;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		// = atama(assignment) i�areti
		
		int sayi1=5;
		int sayi2=4;
		
		boolean isGreat=sayi1>sayi2;
		System.out.println(isGreat); // true
		
		boolean isSmall=sayi1<sayi2;
		System.out.println(isSmall); // false
		
		boolean isEqual=sayi1==sayi2;
		System.out.println(isEqual); // false
		
		System.out.println(sayi1==5);
		System.out.println(sayi2==4);
		System.out.println(sayi1*sayi2==20);
		
		System.out.println(sayi1+sayi2!=9); // false say�lar�n toplam� 9 de�il de�il mi?
		System.out.println(sayi1-sayi2!=0); // true say�lar�n fark� 1 de�il de�il mi? 

	}

}
