public class selectionSort {

	public static void main(String[] args) {
		int liste[]= {8,9,44,2,5,1,25,36,32,85,21,0};
		selectionsort(liste);
		
	}
	public static void selectionsort(int list[]) {
		int temp;
		int minIndex=0;
		for(int i=0;i<list.length;i++) {
			minIndex=i;
			for(int j=i;j<list.length;j++) 
				if(list[j]<list[minIndex]) 
					minIndex=j;
				
				temp=list[i];
				list[i]=list[minIndex];
				list[minIndex]=temp;
			
			System.out.print(","+list[i]);
		}
		
	}


}
