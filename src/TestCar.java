
public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("已生產的車子數"+Car.getTotal());
		
		//生產第一輛車併印出此車的資訊
		Car c1=new Car("BMW");
		System.out.println("目前已產的車子數"+Car.getTotal());
		System.out.println("此車的名稱"+Car.getName());
		System.out.println("此車的序號"+Car.getsn());
	}

}
