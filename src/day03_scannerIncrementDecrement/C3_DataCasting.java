package day03_scannerIncrementDecrement;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri t�r�nde bir de�i�ken olu�turup de�er atay�n
		// olu�turulan variable i ad�m ad�m AUTO W�DEN�NG ile geni�letip yazd�r�n
		
		byte numByte=44;
		
		System.out.println("byte de�i�ken de�eri : " + numByte);
		
		short numShort=numByte;
		
		System.out.println("short de�i�ken de�eri : " + numShort);
		
		int numInt=numShort;
		
		System.out.println("integer de�i�ken de�eri : " + numInt);
		
		float numFloat=numInt;
		
		System.out.println("float de�i�ken de�eri : " + numFloat);
		 
        double numDouble=numFloat;
        
        System.out.println("double de�i�ken de�eri : " + numDouble);
	}

}
