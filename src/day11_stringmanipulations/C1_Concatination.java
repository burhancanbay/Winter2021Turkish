package day11_stringmanipulations;

public class C1_Concatination {

	public static void main(String[] args) {
	
		System.out.println(15+20+"merhaba");
		System.out.println("merhaba"+15+20);
		System.out.println("merhaba"+(15+20));
		System.out.println("merhaba"+15*20);

	String str1="hello";
	String str2="world";
	System.out.println(str1+" "+str2);
	
	System.out.println(str1.concat(str2));
	System.out.println(str1.concat(" "+str2));
	System.out.println(str1.concat(" ").concat(str2));
	
	
	}

}
