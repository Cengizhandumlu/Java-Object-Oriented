public class bubble {

	public static void main(String[] args) {
		int liste[]= {8,9,4,2,5,1,25,36,32,85,21,0};
		bubblesort(liste);
		
	}
	public static void bubblesort(int list[]) {
		int temp;
		for(int i=0;i<list.length;i++) {
			for(int j=0;j<list.length-1;j++) {
				if(list[j]>list[j+1]) {
					temp=list[j];
					list[j]=list[j+1];
					list[j+1]=temp;
				}
				System.out.print(","+list[j]);
			}
			System.out.println();
			
		}
		
	}


}
