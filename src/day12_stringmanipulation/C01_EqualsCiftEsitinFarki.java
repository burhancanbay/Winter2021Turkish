package day12_stringmanipulation;

public class C01_EqualsCiftEsitinFarki {

	public static void main(String[] args) {
		
		String str1="ali can";
		String str2=str1+"";
		System.out.println(str2);
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		String str3="ali can";
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
	}

}
