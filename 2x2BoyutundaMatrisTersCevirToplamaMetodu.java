public class Ters {
	public static void DiziTersCevirTopla(int a[][],int b[][]) {

		int c[][]=new int[a.length][a.length];

		int k=a.length-1;
		
		for(int i=0;i<a.length;i++) {

			for(int j=0;j<b.length;j++) {

				c[i][j]=a[i][j]+b[k][j];

			}

			k--;
		}

		for(int i=0;i<c.length;i++) {//toplam sonucunu yazdiriyoruz.

			for(int j=0;j<c.length;j++) {

				System.out.printf("%d ",c[i][j]);

			}
			
			System.out.println();
		}
		
	}

}
