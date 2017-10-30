/* KART SINIFI OLUSTURULDU*/

public class Kart {
	
	private String KartNo;
	private String KartTuru;
	
	public Kart(String No,String Tur){
		KartNo=No;
		KartTuru=Tur;
	}
	
	public String toString() {
		return KartNo+" "+KartTuru;
	}
	

}


/*KARDESTESI SINIFI OLUSTURULDU*/


import java.util.Random;

public class KartDestesi {

	private static final int KartSayisi=52;
	private Kart Deste[]=new Kart[KartSayisi];
	int i;
	private int siradakikart;
	private static final Random num=new Random();
	
	public KartDestesi() {
		String No[]= {"As","Papaz","Kiz","Vale","iki","uc","dort","bes",
				"alti","yedi","sekiz","dokuz","on"};
		String []Tur= {"Maca","Kupa","Sinek","Karo"};
		for(i=0;i<Deste.length;i++) {
			Deste[i]=new Kart(No[i%13],Tur[i/13]);
		}
	}
	
	public void KartKaristir() {
		int birinci;
		siradakikart=0;
		for(birinci=0;birinci<Deste.length;birinci++) {
			int ikinci=num.nextInt(KartSayisi);
			Kart temp=Deste[birinci];
			Deste[birinci]=Deste[ikinci];
			Deste[ikinci]=temp;
       }
		
		
	}
	public Kart KartDagit() {
		if(siradakikart<Deste.length) {
			return Deste[siradakikart++];
		}
		else 
			return null;
		
		
	}
	
	
}


/*TEST SINIFIMIZ*/

public class OyunTest {

	public static void main(String[] args) {
		KartDestesi yenideste=new KartDestesi();
		yenideste.KartKaristir();
		for(int i=0;i<52;i++) {
			System.out.printf("%-19s",yenideste.KartDagit());
			if(i%4==0) {
				System.out.println();
			}
		}
			

	}

}

