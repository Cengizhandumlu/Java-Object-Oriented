package sayitahminetme;

import java.util.Scanner;
import java.util.Random;

public class SayiTahmini {
	
	

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Random rastgele=new Random();
		
		int adim;
		int sayi=rastgele.nextInt(100);
		int sayac=0;
		int tahmin;	
		
		System.out.println("sayi tahmin oyununa hosgeldiniz."
	+"lutfen oyunu kac adimda bitirmek istediginizi giriniz:");
		adim=input.nextInt();
		
		while(sayac<adim) {
			System.out.println("1 ile 99 sayilari arasinda bir tahminde bulununuz"
		                        +"girmek istediginiz sayi:");
		
		tahmin=input.nextInt();
		
		if(tahmin<1 || tahmin >99) {
			sayac++;
			System.out.println("aralik disinda sayi girdiniz"
					+"aralik icinde bir tahminde bulununuz...");
		}
		
		else {
			if(tahmin<sayi) {
				sayac++;
				System.out.println("atanan sayi girdiginiz sayidan daha buyuk."
						+"lutfen daha buyuk bir sayi giriniz:");
						
			}
			
			else if(sayi<tahmin) {
				sayac++;
				System.out.println("atanan sayi girdiginiz sayidan daha kucuk."
				+"lutfen daha kucuk bir sayi giriniz:");
			}
			
			else {
				sayac++;
				System.out.println("TEBRİKLER sayiyi dogru tahmin ettiniz:"
			+"ulastiginiz hamle sayisi="+sayac);
				break;
				
			}
				
			
		}	
		
	}
		
		if(sayac>=adim) {
			System.out.println("UZGUNUZ tahmin hakkiniz doldu."+"KAYBETTİNİZ."
		+"tahmin etmenizi bekledigimiz sayi="+sayi);
		}

	}

}
