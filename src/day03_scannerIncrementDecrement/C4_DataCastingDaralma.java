package day03_scannerIncrementDecrement;

public class C4_DataCastingDaralma {

	public static void main(String[] args) {
		
		// double bir degisken olusturalim ve bunu int ve byte a cevirin

		double numDouble=280.56;
		
		int numInt=(int) numDouble;
		System.out.println("integer desisken deseri : " + numInt);
	
		byte numByte=(byte)numInt;
		System.out.println("byte desisken deseri : " + numByte);
		
		// daha dar bir data tipine sevirirken eger data tipinin sinirindan buyukse saymaya negatif en ksssk saysdan saymaya devam eder.
		// istenen saysya gelinceye kadar tekrar tekrar en ksssk negatif saysya gider
	}

}
