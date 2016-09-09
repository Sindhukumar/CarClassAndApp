
public class CarApp {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		car1.setColor("red");
		car1.setMake("Porche");
		car1.setSpeed(50);
		System.out.println(car1.start());
		System.out.println(car1.acceralate());
		System.out.println("The "+car1.getColor()+" "+car1.getMake()+" is going "+car1.getSpeed()+" mph");
		System.out.println(car1.stop());

	}

}
