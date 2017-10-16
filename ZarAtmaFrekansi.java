import java.util.Random;



public class Zaratmafrekansi {

	public static void main(String[] args) {
		int sonuc=0;
		int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
		
		Random newRand=new Random(6);
		int i;
		
		for(i=0;i<100;i++) {
			sonuc=1+newRand.nextInt(6);
			
			switch(sonuc){
			
			case 1:
				f1++;
				break;
			case 2:
				f2++;
				break;
			case 3:
				f3++;
				break;
			case 4:
				f4++;
				break;
			case 5:
				f5++;
				break;
			case 6:
				f6++;
				break;
			
			}
			
		}
		
		System.out.printf("f1=%d,f2=%d,f3=%d,f4=%d,f5=%d,f6=%d",f1,f2,f3,f4,f5,f6);
			

	}

}
