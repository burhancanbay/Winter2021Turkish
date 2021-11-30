package day05_wrapperConcatenationOperators;

public class C3_Concatenation {

	public static void main(String[] args) {
		// concatenation(birleþtirme):java'da birden fazla String'i + iþareti ile toplarsanýz,
		// java bu String'leri yan yana yazar
		
		String str1="Java";
		String str2="Guzeldir";
		
		System.out.println(str1+str2);
        System.out.println(str1+" "+str2);
        System.out.println(str1+' '+str2);
        System.out.println(str2+" "+str1);
        
        int sayi1=5;
        int sayi2=4;
        System.out.println(sayi1+sayi2);
        
        System.out.println(sayi1+sayi2+str1+str2);
        System.out.println(str1+str2+sayi1+sayi2);
        
        System.out.println(str1+str2+(sayi1-sayi2)); //JavaGuzeldir1 yazdýrýr
        
        System.out.println(sayi1+sayi2+" "+str1+str2); // 9 JavaGuzeldir
        System.out.println(sayi1+sayi2+' '+str1+str2); // 41JavaGuzeldir 
        //çünkü matematiksel iþlemde char deðeri sayý ile toplanýrsa ascii deðeri devreye girer
        System.out.println(sayi1+sayi2+str1+' '+str2); // 9Java Guzeldir 
        
        System.out.println(str1+str2+sayi1*sayi2); // JavaGuzeldir20
        System.out.println(str1+str2+2*(sayi1-sayi2)); //JavaGuzeldir2 yazdýrýr
	}

}
