package day12_stringmanipulation;

public class C02_EqualIgnoreCase {

	public static void main(String[] args) {
		
		// equalIgnoreCase() buyuk-kucuk harf duyarliligi olmadan karsilastirir
		
		String str1="ali can";
		String str2="Ali CAN";
		String str3="Ali caN ";
		
		System.out.println(str1.equals(str2)); // False
        System.out.println(str1.equalsIgnoreCase(str2)); // True
        
        System.out.println(str1.equals(str3)); // False
        System.out.println(str1.equalsIgnoreCase(str3)); // False
		
	}

}
