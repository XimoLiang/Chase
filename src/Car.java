
class Car {
	//總生產數
	static int total;
	
	//生產編號
	static int sn;
	
	//車種名稱
	static String name;
	
	public Car(String n){
		total++;
		setsn(total);
		setName(n);
	}
	public void setsn(int total){
		sn=total;
	}
	public void setName(String n){
		name=n;
	}
	public static int getTotal(){
		return total;
	}
	public static int getsn(){
		return sn;
	}
	public static String getName(){
		return name;
	}
}
