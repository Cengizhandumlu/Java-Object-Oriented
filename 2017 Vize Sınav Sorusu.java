import java.util.ArrayList;
import java.util.Random;
public class arrray {

	public static void main(String[] args) {
		
		ArrayList<Integer> liste=new ArrayList<Integer>();
		Random rand=new Random();
		int i=0;
		while(i!=13) {
		liste.add(rand.nextInt(11));
		i++;
		}
		System.out.println(liste);
		mtd(liste);

	}
	
	
	public static void mtd(ArrayList<Integer> list) {
		if(list.size()%2!=0) {
			list.remove(list.size()-1);
		}
		for(int i=0;i<list.size();i+=2) {
			if(list.get(i)>list.get(i+1)) {
				list.remove(i);
				list.remove(i);
				i-=2;
			}
		}
		for(int i=0;i<list.size();i++) {
			System.out.print(" "+list.get(i));
		}
		
	}

}
