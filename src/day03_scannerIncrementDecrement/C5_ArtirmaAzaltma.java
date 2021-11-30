package day03_scannerIncrementDecrement;

public class C5_ArtirmaAzaltma {

	public static void main(String[] args) {
		
		int num=15;
		
		int num2=num+2;
		
		System.out.println("num2 : " + num2);
		System.out.println("num : " + num);
		
		num=num + 5;
		
		System.out.println("num = " + num);

		System.out.println(num+12);

		num=num+8;
		System.out.println(num);
		System.out.println(num+=10); // num 10 artt�
		
		System.out.println(num+=1);
		num++;
		System.out.println(num+=1);
	} 
}

