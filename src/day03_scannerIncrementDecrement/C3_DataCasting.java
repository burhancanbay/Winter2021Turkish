package day03_scannerIncrementDecrement;

public class C3_DataCasting {

	public static void main(String[] args) {
		
		// byte veri türünde bir deðiþken oluþturup deðer atayýn
		// oluþturulan variable i adým adým AUTO WÝDENÝNG ile geniþletip yazdýrýn
		
		byte numByte=44;
		
		System.out.println("byte deðiþken deðeri : " + numByte);
		
		short numShort=numByte;
		
		System.out.println("short deðiþken deðeri : " + numShort);
		
		int numInt=numShort;
		
		System.out.println("integer deðiþken deðeri : " + numInt);
		
		float numFloat=numInt;
		
		System.out.println("float deðiþken deðeri : " + numFloat);
		 
        double numDouble=numFloat;
        
        System.out.println("double deðiþken deðeri : " + numDouble);
	}

}
