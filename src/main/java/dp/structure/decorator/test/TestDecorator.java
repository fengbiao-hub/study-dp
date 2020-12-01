package dp.structure.decorator.test;

import dp.structure.decorator.Car;
import dp.structure.decorator.SuperFlyCar;
import dp.structure.decorator.SuperWaterCar;

public class TestDecorator {

	public static void main(String[] args) {
		Car car = new Car();
		SuperFlyCar superFlyCar = new SuperFlyCar(car);
		SuperWaterCar superWaterCar = new SuperWaterCar(car);
		SuperWaterCar superWaterCar2 = new SuperWaterCar(new SuperFlyCar(car));
		SuperWaterCar superWaterCar3 = new SuperWaterCar(new SuperWaterCar(car));
		superFlyCar.move();
		System.out.println("===========================================");
		superWaterCar.move();
		System.out.println("===========================================");
		superWaterCar2.move();
		System.out.println("===========================================");
		superWaterCar3.move();
	}
}
