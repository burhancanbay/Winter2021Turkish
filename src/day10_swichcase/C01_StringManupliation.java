package day10_swichcase;

public class C01_StringManupliation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Hello World";
		System.out.println(str.toUpperCase());
		System.out.println(str);
		
		String str2=str.toUpperCase();
		System.out.println(str2);
		
		String sonuc=str.concat(str2);
		System.out.println(sonuc);
		
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.startsWith("H"));
		
	}

}
