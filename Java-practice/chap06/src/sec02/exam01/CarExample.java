package sec02.exam01;

public class CarExample {

	public static void main(String[] args) {
		
		Car myCar = new Car(); //Car의 정보를 가져오려면 객체부터 생성해야됨.
		
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		
		myCar.speed = 60;
		System.out.println("현재속도: " + myCar.speed);
	}

}