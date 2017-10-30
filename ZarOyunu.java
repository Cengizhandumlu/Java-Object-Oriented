
import java.util.Random;

public class ZarOyunu {
	
	private static Random num=new Random();//rastgele zar atmamiz icin gerekli olan Random kutuphanesini tanimladik
	private enum Durum{Kazan,Kaybet,Devam};//durum adli bir degisken tipi tanımladim ve alacagi degerler kazan,kaybet ve devam

	public static void main(String[] args) {
		int puan=0;
		int zartoplami;
		Durum oyundurumu;
		zartoplami=ZarAt();
		System.out.println("attiginiz zarlarin toplami="+zartoplami );
		switch(zartoplami) {
		case 7:
		case 11: oyundurumu=Durum.Kazan;
		
		case 2:
		case 3:
		case 12: oyundurumu=Durum.Kaybet;
		
		default: oyundurumu=Durum.Devam;//diger durumlarda zartoplami aldigi puan olur 
		puan=zartoplami;
		System.out.println("puaniniz="+puan);
		break;
		
		}
		
		while(oyundurumu==Durum.Devam) {//eger devam geldi ise zar atmaya devam et
			zartoplami=ZarAt();//tekrar zar atildi
			
			System.out.println("yeni puaniniz="+zartoplami);
			
			if(puan==zartoplami) {
				oyundurumu=Durum.Kazan;
			}
			else {
				if(zartoplami==7) {
					oyundurumu=Durum.Kaybet;
				}
			}
			
			if(oyundurumu==Durum.Kazan) {
				System.out.println("TEBRİKLER KAZANDINIZ");
				
			}
			else {
				
				System.out.println("UZGUNUZ KAYBETTINIZ");
			}
			
			
		}
		
		

	}
	
	public static int ZarAt() {
		int zar1;
		int zar2;
		int toplam;
		zar1=1+num.nextInt(6);
		zar2=1+num.nextInt(6);
		toplam=zar1+zar2;
		return toplam;
	}

}
