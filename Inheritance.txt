
/* Time class start*/

public class Time {
	private int day,month,year;
	public Time() {
		
	}
	public Time(int day,int month,int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public int getDay() {
		return day;
	}
	public void setMonth(int month) {
		this.month=month;
	}
	public int getMonth() {
		return month;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getYear() {
		return year;
	}
	
}
/* Time class finish*/

/* Person class start*/

public class Person {
	protected String name,surname;
	protected Time birthday;
	public Person() {
		
	}
	public Person(String name,String surname,Time birthday) {
		this.name=name;
		this.surname=surname;
		this.birthday=birthday;
	}
	public void whoAmI() {
		System.out.println("name: "+name+" surname:"+surname+" birthday:"+birthday.getDay()+birthday.getMonth()+birthday.getYear());
	}
}

/* Person class finish*/

/* Engineer class start*/

public class Engineer extends Person {
	private int id;
	protected int maas,ca_sa;
	public Engineer() {
		
	}
	public Engineer(String name,String surname,Time birthday,int id,int maas,int ca_sa) {
		super(name,surname,birthday);
		this.id=id;
		this.maas=maas;
		this.ca_sa=ca_sa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void whoAmI() {
		System.out.println("name: "+name+" surname"+surname+" birthday:"+birthday.getDay()+birthday.getMonth()+birthday.getYear()+" id:"+getId()+" maas:"+maas+" ca_sa:"+ca_sa);
	}
}

/* Engineer class finish*/

/* InheritanceTest class start*/

public class InheritanceTest {

	public static void main(String[] args) {
		Time t1=new Time(3,3,1973);
		Kisi i1=new Kisi("Ali","Veli",t1);
		Kisi i2;
		Engineer i3,i4;
		TeamLeader i5;
		i2=new Engineer("A","B",t1,123,300,20);
		i3=new Engineer("ABC","XYZ",t1,333,300,20);
		i4=new TeamLeader("XYZ","ABC",t1,444,350,20,3);
		i5=new TeamLeader("Cengizhan","DUMLU",t1,555,350,20,35);
		i1.whoAmI();
		i2.whoAmI();
		i3.whoAmI();
		i4.whoAmI();
		i5.whoAmI();

	}

}

/* Inheritance class finish*/


