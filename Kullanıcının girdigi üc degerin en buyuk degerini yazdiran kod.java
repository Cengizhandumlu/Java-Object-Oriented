import java.util.Scanner;

public class EnBuyuk {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n1,n2,n3;
		int sonuc;
		System.out.println("degerleri sirasiyla giriniz=");
		n1=input.nextInt();
		n2=input.nextInt();
		n3=input.nextInt();
		
		sonuc=maxi(n1,n2,n3);
		System.out.println("Enbuyuk deger="+sonuc);
		

	}

	public static int maxi(int x,int y,int z) {
		int maxvalue;
		maxvalue=x;
		if(y>maxvalue) {
			maxvalue=y;
		}
		if(z>maxvalue) {
			maxvalue=z;
		}
		
		return maxvalue;
	}
	
}
