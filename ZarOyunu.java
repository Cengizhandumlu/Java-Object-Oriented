import java.util.Random;
public class Zaroyunu {

	private static final Random randNum=new Random(6);//final atanilan numaranin tekrar  degistirilmemesi icin konuldu.
													 
	private enum Durum{Kazan,Kaybet,Devam};//Durum tipi olusturuldu.
	
	public static int ZarAt() {
		int zar1=randNum.nextInt(6);
		int zar2=randNum.nextInt(6);
		
		return zar1+zar2;
		
	}
	
	public static void main(String[] args) {
		
		int puan=0;
		Durum oyunDurumu;
		int zarToplami;
		zarToplami=ZarAt();
		
		switch(zarToplami) {
		case 7:
		case 11:
			oyunDurumu=Durum.Kazan;
			break;
		case 2:
		case 3:
		case 12:
			oyunDurumu=Durum.Kaybet;
			break;
			
		default:
			oyunDurumu=Durum.Devam;
			puan=zarToplami;
			break;
			
		}
		
		if(oyunDurumu==Durum.Devam) {
			
			zarToplami=ZarAt();
			if(zarToplami==puan) {
				oyunDurumu=Durum.Kazan;
			}
			else if(zarToplami==7) {
				oyunDurumu=Durum.Kaybet;
			}
			
		}
		
		if(oyunDurumu==Durum.Kazan) {
			System.out.println("Kazandiniz...");
			
		}
		else {
			System.out.println("Kaybetiniz...");
		}

	}
	
}
