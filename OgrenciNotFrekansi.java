package ogrencinotu;

import java.util.Scanner;



public class OgrenciNotu {

	public static void main(String[] args) {
		
		int []notlar=new int[20];
		
		int []frekans=new int[6];
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("20 adet ogrencinin notunu giriniz:");
		
		for(int i=0;i<notlar.length;i++) {
			
			notlar[i]=input.nextInt();
						
		}
		
		for(int i=0;i<notlar.length;i++) {
			try {
				++frekans[notlar[i]];
			}
			
			catch(ArrayIndexOutOfBoundsException hata) {
				System.out.println("lutfen 0-5 arasinda giriniz"+hata);
			}
			
			
			}
		
				
		System.out.println("not:     frekans:\n");
		System.out.println(".....    ........\n");

		for(int i=0;i<frekans.length;i++) {
			System.out.printf("%d %9d\n",i,frekans[i]);
		
		
		
		}
		
	}

}
