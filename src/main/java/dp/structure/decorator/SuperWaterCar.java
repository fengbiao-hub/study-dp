package dp.structure.decorator;

public class SuperWaterCar extends SuperCar {

	public SuperWaterCar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("汽车在水里游~");
	}

}
