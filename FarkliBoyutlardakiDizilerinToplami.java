/* COK BOYUTLU DIZILERDE INDEX DEGERI CIFT OLAN DIZIDEKI ELEMANLARIN TOPLAMINI*/


public class Dizi{

	public static void main(String[] args) {
		
		Random rand=new Random();
		
		int a[][]= {{1,2,3},{3,5},{6,7,8,10},{11,5,76}};
		//satir indexi cift olan elemanlarin toplami;
		int toplam=0;
		
		for(int i=0;i<a.length;i=i+2) {
			for(int j=0;j<a[i].length;j++) {
				toplam+=a[i][j];
			}
		}
		
		System.out.printf("cift olan indexteki elemanlarin toplami= %d",toplam);
		
		
	}
}
