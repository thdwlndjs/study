package CH17;
//toString 오버라이드해서 객체에 오버라이드 가능
class Car{
	private String carName;
	private String company;
	public Car(String carName,String company) {
		this.carName=carName;
		this.company=company;
	}
	@Override
	public String toString() {
		String str="차량이름: "+this.carName+",제조사:"+company;
		return str;
	}
}
public class CarMainClass {

	public static void main(String[] args) {
		Car c = new Car("현대","소나타");
		System.out.println(c);
	}

}
