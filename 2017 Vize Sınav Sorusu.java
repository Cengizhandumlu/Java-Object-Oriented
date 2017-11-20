import java.util.ArrayList;
import java.util.Random;
public class arrray {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste=new ArrayList<Integer>();
		Random rand=new Random();// Random metodundan nesne olustur.
		int i=0;
		while(i!=13) {
		liste.add(rand.nextInt(11));// ArrayList icerisine rastgele sayilar ata.
		i++;
		}
		System.out.println(liste);// Olusan listeyi yazdir.
		mtd(liste);//main disinda olusturulan metodu cagir.

	}
	
	
	public static void mtd(ArrayList<Integer> list) {
		if(list.size()%2!=0) {//gonderilen arraylist uzunlugu tek sayi ise listenin son elemanini sil.
			list.remove(list.size()-1);//remove komutuyla kaldirildi.
		}
		for(int i=0;i<list.size();i+=2) {//listedeki elemanlari ikiser ikiser karsilastir.
			if(list.get(i)>list.get(i+1)) {
				list.remove(i);//listenin i.indexini kaldir.
				list.remove(i);//silinen indexin yerine gectigi icin i.indexi kaldir.
				i-=2;//2 liste elemani silindigi icin size degisti,2 geri gel kaldigin yerden kontrole devam et.
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(" "+list.get(i));//olusan yeni listeyi get() komutuyla yazdir.
		}
		
	}

}
