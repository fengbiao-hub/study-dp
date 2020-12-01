package dp.structure.decorator;

public class SuperFlyCar extends SuperCar {

	public SuperFlyCar(ICar car) {
		super(car);
	}

	@Override
	public void move() {
		super.move();
		System.out.println("汽车在天上飞~");
	}

}
