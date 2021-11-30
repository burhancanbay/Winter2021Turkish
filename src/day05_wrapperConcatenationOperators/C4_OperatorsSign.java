package day05_wrapperConcatenationOperators;

public class C4_OperatorsSign {

	public static void main(String[] args) {
		// = atama(assignment) iþareti
		
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
		
		System.out.println(sayi1+sayi2!=9); // false sayýlarýn toplamý 9 deðil deðil mi?
		System.out.println(sayi1-sayi2!=0); // true sayýlarýn farký 1 deðil deðil mi? 

	}

}
