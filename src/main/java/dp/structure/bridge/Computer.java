package dp.structure.bridge;

public class Computer {

	protected Brand brand;

	public Computer(Brand brand) {
		super();
		this.brand = brand;
	}

	public void sale() {
		brand.sale();
	}
}
