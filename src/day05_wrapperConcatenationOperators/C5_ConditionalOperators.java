package day05_wrapperConcatenationOperators;

public class C5_ConditionalOperators {

	public static void main(String[] args) {
		// AND && , OR ||
		
		boolean isTrue=5>4 && 7-3>0;
		System.out.println(isTrue);
		
		int x=10;
		int y=5;
		System.out.println(x/y==2 && x*y>20 && x-y>0); // true b�t�n i�lemlerin do�ru oldu�u anlam�na gelir
		
		System.out.println(x+y<0 && x-y>0); // false
		
		System.out.println(x<y || x+y<0 || x*y>0); //true i�lerinden 1 tanesi bile do�ru olsa sonu� true olur
	}

}
