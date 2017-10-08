class ifElse(){
	public static void main(){
		int score=76;
		char grade;
		
		if(score>=90){
			grade='A';
		}

		else if(score>=80){
			grade='B';
		}

		else if(score>=70){
			grade='C';
		}

		else if(score>=60){
			grade='D';
		}

		else{
			grade='F';
		}
	System.out.println("Grade="+grade);//Grade= C

	}


}

